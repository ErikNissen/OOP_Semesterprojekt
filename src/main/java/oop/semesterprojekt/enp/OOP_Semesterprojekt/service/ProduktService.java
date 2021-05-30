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

    public List<Produkt> getAllProdukt() {

        List<Produkt> produkte = new ArrayList<Produkt>();
        produktRepository.findAll().forEach(produkt -> produkte.add(produkt));

        return produkte;
    }

    public Produkt getProduktById(int id) {
        return produktRepository.findById(id).get();
    }

    public Produkt saveOrUpdateProdukt(Produkt produkt) {
        return produktRepository.save(produkt);
    }

    public void delete(int id) {
        produktRepository.deleteById(id);
    }

    public Produkt getProduktByName(String name) {
        long i, j, k;
        Produkt produkt = null;
        j = produktRepository.count();
        for(i = 0; i <= j; i++) {
            for(k = j; k >= 0; k--) {
                if(k == i) {
                    break;
                }
                if(produktRepository.findById((int) i).get().getBezeichnung().contains(name)) {
                    produkt = produktRepository.findById((int) i).get();
                    break;
                }else {
                    if(produktRepository.findById((int) i).get().getBezeichnung().contains(name)) {
                        produkt = produktRepository.findById((int) k).get();
                        break;
                    }
                    continue;
                }
            }
        }
        if(produkt == null) {
            System.out.print("Produkt wurde nicht gefunden.");
            return null;
        }
        return produkt;
    }
}