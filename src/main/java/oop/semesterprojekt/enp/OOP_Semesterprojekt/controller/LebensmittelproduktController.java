package oop.semesterprojekt.enp.OOP_Semesterprojekt.controller;

import java.util.List;

import oop.semesterprojekt.enp.OOP_Semesterprojekt.service.ProduktService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import oop.semesterprojekt.enp.OOP_Semesterprojekt.model.Lebensmittelprodukt;
import oop.semesterprojekt.enp.OOP_Semesterprojekt.service.LebensmittelproduktService;

@RestController
public class LebensmittelproduktController {

    @Autowired
    LebensmittelproduktService lebensmittelproduktService;

    @GetMapping("/lebensmittel")
    private List<Lebensmittelprodukt> gettAllLebensmittelprodukt() {

        return lebensmittelproduktService.getAllLebensmittelprodukt();
    }

    @GetMapping("/lebensmittel/{id}")
    private Lebensmittelprodukt getLebensmittelprodukt(@PathVariable("id") int id) {

        return lebensmittelproduktService.getLebensmittelproduktById(id);
    }

    @DeleteMapping("/lebensmittel/{id}")
    private void deleteLebensmittelprodukt(@PathVariable("id") int id) {

        lebensmittelproduktService.delete(id);
    }

    @PostMapping("/lebensmittel")
    private int saveLebensmittelprodukt(@RequestBody Lebensmittelprodukt lebensmittelprodukt) {

        return lebensmittelproduktService.saveOrUpdateLebensmittelprodukt(lebensmittelprodukt).getId();
    }

    @PostMapping("/lebensmittel/{id}")
    private int updateLebensmittelprodukt(@RequestBody Lebensmittelprodukt lebensmittelprodukt) {

        // TODO: ein Produkt aktualisieren. Problem im Moment: Mit jedem neuen Request wird automatisch eine neue ID vergeben

        return 1;

    }
}
