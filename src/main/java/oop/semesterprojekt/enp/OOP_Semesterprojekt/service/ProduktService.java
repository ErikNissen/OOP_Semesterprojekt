package oop.semesterprojekt.enp.OOP_Semesterprojekt.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import oop.semesterprojekt.enp.OOP_Semesterprojekt.model.Produkt;
import oop.semesterprojekt.enp.OOP_Semesterprojekt.repository.ProduktRepository;

@Service
public class ProduktService {

    @Autowired
    ProduktRepository produktRepository;

    // CREATE or UPDATE
    public Produkt saveOrUpdateProdukt(Produkt produkt) {

        return produktRepository.save(produkt);
    }

    // READ: alle Produkte werden ausgegeben
    public List<Produkt> getAllProdukt() {

        List<Produkt> produkte = new ArrayList<Produkt>();
        produktRepository.findAll().forEach(produkt -> produkte.add(produkt));

        return produkte;
    }

    // READ: ein Produkt wird ausgegeben; id einmalig
    public Produkt getProduktById(int id) {

        return produktRepository.findById(id).get();
    }

    // READ: ein oder mehrere Produkte mit der gesuchten Bezeichnung werden ausgegeben
    public Produkt getProduktByName(String name) {

        return produktRepository.findByBezeichnung(name);
    }

    // DELETE
    public void delete(int id) {

        produktRepository.deleteById(id);
    }

}