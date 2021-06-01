package oop.semesterprojekt.enp.OOP_Semesterprojekt.controller;

import oop.semesterprojekt.enp.OOP_Semesterprojekt.model.Elektronikprodukt;
import oop.semesterprojekt.enp.OOP_Semesterprojekt.model.Lebensmittelprodukt;
import oop.semesterprojekt.enp.OOP_Semesterprojekt.model.Produkt;
import oop.semesterprojekt.enp.OOP_Semesterprojekt.service.ElektronikproduktService;
import oop.semesterprojekt.enp.OOP_Semesterprojekt.service.LebensmittelproduktService;
import oop.semesterprojekt.enp.OOP_Semesterprojekt.service.ProduktService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class Webcontroller {

    @Autowired
    ProduktService produktService;
    LebensmittelproduktService lebensmittelproduktService;
    ElektronikproduktService elektronikproduktService;

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

    @RequestMapping( value= "/lebensmittel.html")
    public String alleLebensmittel( Model model ) {

        List<Lebensmittelprodukt> alleLebensmittel = lebensmittelproduktService.getAllLebensmittelprodukt();
        model.addAttribute("alleLebensmittel", alleLebensmittel);
        return "lebensmittel.html";
    }

    @RequestMapping( value = "elektronik.html" )
    public String alleElektronik( Model model ) {

        List<Elektronikprodukt> alleElektronik = elektronikproduktService.getAllElektronik();
        model.addAttribute("alleElektronik", alleElektronik);
        return "elektronik.html";
    }
}
