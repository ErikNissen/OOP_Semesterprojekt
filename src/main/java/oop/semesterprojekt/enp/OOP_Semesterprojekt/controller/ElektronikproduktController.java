package oop.semesterprojekt.enp.OOP_Semesterprojekt.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import oop.semesterprojekt.enp.OOP_Semesterprojekt.model.Elektronikprodukt;
import oop.semesterprojekt.enp.OOP_Semesterprojekt.service.ElektronikproduktService;

@RestController
public class ElektronikproduktController {

    @Autowired
    ElektronikproduktService elektronikproduktService;

    // CREATE or UPDATE
    @PostMapping("/elektronik")
    private int saveElektronikprodukt(@RequestBody Elektronikprodukt elektronikprodukt) {

        return elektronikproduktService.saveOrUpdateElektronikprodukt(elektronikprodukt).getId();

    }

    // READ
    @GetMapping("/elektronik")
    private List<Elektronikprodukt> gettAllElektronik(@RequestParam(value = "bezeichnung", required = false) String bezeichnung) {

        if(bezeichnung == null) {
            return elektronikproduktService.getAllElektronik();
        } else {
            return elektronikproduktService.getElektronikproduktByName(bezeichnung);
        }
    }

    // READ
    @GetMapping("/elektronik/{id}")
    private Elektronikprodukt getElektronikprodukt(@PathVariable("id") int id) {

        return (Elektronikprodukt) elektronikproduktService.getElektronikproduktById(id);
    }

    // DELETE
    @DeleteMapping("/elektronik/{id}")
    private void deleteElektronikprodukt(@PathVariable("id") int id) {

        elektronikproduktService.delete(id);
    }
}