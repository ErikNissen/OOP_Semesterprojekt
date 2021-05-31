package oop.semesterprojekt.enp.OOP_Semesterprojekt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import oop.semesterprojekt.enp.OOP_Semesterprojekt.model.Lebensmittelprodukt;
import oop.semesterprojekt.enp.OOP_Semesterprojekt.service.LebensmittelproduktService;

@RestController
public class LebensmittelproduktController {

    @Autowired
    LebensmittelproduktService lebensmittelproduktService;

    // CREATE or UPDATE
    @PostMapping("/lebensmittel")
    private int saveLebensmittelprodukt(@RequestBody Lebensmittelprodukt lebensmittelprodukt) {

        return lebensmittelproduktService.saveOrUpdateLebensmittelprodukt(lebensmittelprodukt).getId();
    }

    // READ
    @GetMapping("/lebensmittel")
    private List<Lebensmittelprodukt> gettAllLebensmittelprodukt(@RequestParam(value = "bezeichnung", required = false) String bezeichnung) {

        if(bezeichnung == null) {
            return lebensmittelproduktService.getAllLebensmittelprodukt();
        } else {

        }

        return lebensmittelproduktService.getAllLebensmittelprodukt();
    }

    // READ
    @GetMapping("/lebensmittel/{id}")
    private Lebensmittelprodukt getLebensmittelprodukt(@PathVariable("id") int id) {

        return lebensmittelproduktService.getLebensmittelproduktById(id);
    }

    // DELETE
    @DeleteMapping("/lebensmittel/{id}")
    private void deleteLebensmittelprodukt(@PathVariable("id") int id) {

        lebensmittelproduktService.delete(id);
    }

}
