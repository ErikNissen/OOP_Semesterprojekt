package oop.semesterprojekt.enp.OOP_Semesterprojekt.service;

import java.util.ArrayList;
import java.util.List;

import oop.semesterprojekt.enp.OOP_Semesterprojekt.model.Produkt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import oop.semesterprojekt.enp.OOP_Semesterprojekt.model.Elektronikprodukt;
import oop.semesterprojekt.enp.OOP_Semesterprojekt.repository.ElektronikproduktRepository;

@Service
public class ElektronikproduktService {

    @Autowired
    ElektronikproduktRepository elektronikproduktRepository;

    public List<Elektronikprodukt> getAllElektronik() {

        List<Elektronikprodukt> elektronikprodukte = new ArrayList<Elektronikprodukt>();
        elektronikproduktRepository.findAll().forEach(elektronikprodukt -> elektronikprodukte.add(elektronikprodukt));

        return elektronikprodukte;
    }

    public Produkt getElektronikproduktById(int id) {
        return elektronikproduktRepository.findById(id).get();
    }

    public void saveOrUpdateElektronikprodukt(Elektronikprodukt elektronikprodukt) {
        elektronikproduktRepository.save(elektronikprodukt);
    }

    public void delete(int id) {
        elektronikproduktRepository.deleteById(id);
    }

}
