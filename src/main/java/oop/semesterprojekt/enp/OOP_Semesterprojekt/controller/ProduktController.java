package oop.semesterprojekt.enp.OOP_Semesterprojekt.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import oop.semesterprojekt.enp.OOP_Semesterprojekt.model.Produkt;
import oop.semesterprojekt.enp.OOP_Semesterprojekt.service.ProduktService;

@RestController
public class ProduktController {

    @Autowired
    ProduktService produktService;

    // CREATE or UPDATE
    @PostMapping("/produkt")
    private int saveProdukt(@RequestBody Produkt produkt) {

        return produktService.saveOrUpdateProdukt(produkt).getId();

    }

    // READ
    @GetMapping("/produkt")
    private List<Produkt> gettAllProdukt(@RequestParam(value = "bezeichnung", required = false) String bezeichnung) {

        if(bezeichnung == null) {
            return produktService.getAllProdukt();
        } else {
            return produktService.getProduktByName(bezeichnung);
        }
    }

    // READ
    @GetMapping("/produkt/{id}")
    private Produkt getProdukt(@PathVariable("id") int id) {

        return produktService.getProduktById(id);
    }

    // DELETE
    @DeleteMapping("/produkt/{id}")
    private void deleteProdukt(@PathVariable("id") int id) {

        produktService.delete(id);
    }
}