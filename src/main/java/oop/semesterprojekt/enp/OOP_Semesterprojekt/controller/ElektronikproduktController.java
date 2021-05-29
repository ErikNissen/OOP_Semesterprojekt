package oop.semesterprojekt.enp.OOP_Semesterprojekt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import oop.semesterprojekt.enp.OOP_Semesterprojekt.model.Elektronikprodukt;
import oop.semesterprojekt.enp.OOP_Semesterprojekt.service.ElektronikproduktService;

@RestController
public class ElektronikproduktController {

    @Autowired
    ElektronikproduktService elektronikproduktService;

    @GetMapping("/elektronik")
    private List<Elektronikprodukt> gettAllElektronik() {
        return elektronikproduktService.getAllElektronik();
    }

    @GetMapping("/elektronik/{id}")
    private Elektronikprodukt getElektronikprodukt(@PathVariable("id") int id) {
        return (Elektronikprodukt) elektronikproduktService.getElektronikproduktById(id);
    }

    @DeleteMapping("/elektronik/{id}")
    private void deleteElektronikprodukt(@PathVariable("id") int id) {
        elektronikproduktService.delete(id);
    }

    @PostMapping("/elektronik")
    private int saveElektronikprodukt(@RequestBody Elektronikprodukt elektronikprodukt) {

        elektronikproduktService.saveOrUpdateElektronikprodukt(elektronikprodukt);
        return elektronikprodukt.getId();
    }
}
