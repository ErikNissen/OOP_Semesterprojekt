package oop.semesterprojekt.enp.OOP_Semesterprojekt.controller;

import oop.semesterprojekt.enp.OOP_Semesterprojekt.model.Lebensmittelprodukt;
import oop.semesterprojekt.enp.OOP_Semesterprojekt.service.LebensmittelproduktService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class WEBLebensmittelproduktController {

    @Autowired
    LebensmittelproduktService lebensmittelproduktService;

    @RequestMapping( value= "/lebensmittel.html")
    public String alleLebensmittel( Model model ) {

        List<Lebensmittelprodukt> alleLebensmittel = lebensmittelproduktService.getAllLebensmittelprodukt();
        model.addAttribute("alleLebensmittel", alleLebensmittel);
        return "lebensmittel.html";
    }
}
