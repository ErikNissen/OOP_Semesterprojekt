package oop.semesterprojekt.enp.OOP_Semesterprojekt.controller;

import oop.semesterprojekt.enp.OOP_Semesterprojekt.model.Produkt;
import oop.semesterprojekt.enp.OOP_Semesterprojekt.service.ProduktService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ProduktWEBController {

    @Autowired
    ProduktService produktService;

    @RequestMapping( value = "/" )
    public String index() {

        return "index";
    }

    @RequestMapping( value = "/produkt.html" )
    public String alleProdukte( Model model ) {

        List<Produkt> alleProdukte = produktService.getAllProdukt();
        model.addAttribute("alleProdukte", alleProdukte);
        return "produkt.html";
    }
}
