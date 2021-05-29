package oop.semesterprojekt.enp.OOP_Semesterprojekt.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import oop.semesterprojekt.enp.OOP_Semesterprojekt.model.Produkt;
import oop.semesterprojekt.enp.OOP_Semesterprojekt.service.ProduktService;
import org.springframework.web.servlet.ModelAndView;

/**
 * Jede Schnittstelle verfügt über einen eigene Controller
 */
@RestController
public class ProduktController {

    @Autowired
    ProduktService produktService;

    /**
     *
     * @param produkt Es werden die statischen Eigenschaften aus dem POST-Request gespeichert
     * @return Bei Erfolg wird die ID angezeigt, welche das angelegte Produkt bekommen hat
     */
    @PostMapping("/produkt")
    private int saveProdukt(@RequestBody Produkt produkt) {

        return produktService.saveOrUpdateProdukt(produkt).getId();
        //Ab hier regelt die DB-Engine die Vergabe der ID
    }

    /**
     *
     * @return zeigt alle Einträge
     */
    @GetMapping("/produkt")
    public ModelAndView gettAllProdukt() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("produkt", produktService.getAllProdukt());
        return modelAndView;
    }

    /*
    @GetMapping("/produkt")
    private List<Produkt> gettAllProdukt() {
        return produktService.getAllProdukt();
    }
     */

    /**
     *
     * @param id Die ID des Produktes, das ausgegeben werden soll
     * @return
     */
    @GetMapping("/produkt/{id}")
    private Produkt getProdukt(@PathVariable("id") int id) {
        return produktService.getProduktById(id);
    }

    /**
     *
     * @param id Die ID des zu löschenden Produktes. DELETE-Request in "Postman" auswählen
     */
    @DeleteMapping("/produkt/{id}")
    private void deleteProdukt(@PathVariable("id") int id) {
        produktService.delete(id);
    }
}
