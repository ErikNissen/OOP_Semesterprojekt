package oop.semesterprojekt.enp.OOP_Semesterprojekt.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import oop.semesterprojekt.enp.OOP_Semesterprojekt.model.Elektronikprodukt;
import oop.semesterprojekt.enp.OOP_Semesterprojekt.repository.ElektronikproduktRepository;

@Service
public class ElektronikproduktService {

    @Autowired
    ElektronikproduktRepository elektronikproduktRepository;

    // CREATE or UPDATE
    public Elektronikprodukt saveOrUpdateElektronikprodukt(Elektronikprodukt elektronikprodukt) {

        return elektronikproduktRepository.save(elektronikprodukt);
    }

    // READ: alle Elektronikprodukte werden ausgegeben
    public List<Elektronikprodukt> getAllElektronik() {

        List<Elektronikprodukt> elektronikprodukte = new ArrayList<Elektronikprodukt>();
        elektronikproduktRepository.findAll().forEach(elektronikprodukt -> elektronikprodukte.add(elektronikprodukt));

        return elektronikprodukte;
    }

    // READ: ein Elektronikprodukt wird ausgegeben; id einmalig
    public Elektronikprodukt getElektronikproduktById(int id) {

        return elektronikproduktRepository.findById(id).get();
    }

    // READ: ein oder mehrere Produkte mit der gesuchten Bezeichnung werden ausgegeben
    public Elektronikprodukt getElektronikproduktByName(String name) {

        return elektronikproduktRepository.findByBezeichnung(name);
    }

    // DELETE
    public void delete(int id) {

        elektronikproduktRepository.deleteById(id);
    }

}