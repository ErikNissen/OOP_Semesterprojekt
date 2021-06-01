package oop.semesterprojekt.enp.OOP_Semesterprojekt.controller;

import oop.semesterprojekt.enp.OOP_Semesterprojekt.model.Elektronikprodukt;
import oop.semesterprojekt.enp.OOP_Semesterprojekt.service.ElektronikproduktService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ElektronikproduktWEBController {

    @Autowired
    ElektronikproduktService elektronikproduktService;

    @RequestMapping( value= "/elektronik.html")
    public String alleLebensmittel( Model model ) {

        List<Elektronikprodukt> alleElektronik = elektronikproduktService.getAllElektronik();
        model.addAttribute("alleElektronik", alleElektronik);
        return "elektronik.html";
    }
}
