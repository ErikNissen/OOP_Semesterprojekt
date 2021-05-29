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
    ProduktRepository produktRepository; // <- Das ist eine Bean

    public List<Produkt> getAllProdukt() {

        List<Produkt> produkte = new ArrayList<Produkt>();
        produktRepository.findAll().forEach(produkt -> produkte.add(produkt));

        return produkte;
    }

    public Produkt getProduktById(int id) {
        return produktRepository.findById(id).get();
    }

    public Produkt saveOrUpdateProdukt(Produkt produkt) { // TO DO: In der Doku erläutern, dass sowohl Save als auch Update funktionieren
        return produktRepository.save(produkt);
    }

    public void delete(int id) {
        produktRepository.deleteById(id);
    }


    /*
    public static Produkt getProduktByName(String name) {
        long i, j, k;
        Produkt produkt = null;
        j = repo_te.count();
        for(i = 0; i <= j; i++) {
            for(k = j; k >= 0; k--) {
                if(k == i) {
                    break;
                }
                if(repo_tl.findById((int) i).get().getProdukt_Name().contains(name)) {
                    produkt = repo_tl.findById((int) i).get();
                    break;
                }else {
                    if(repo_te.findById((int) k).get().getProdukt_Name().contains(name)) {
                        produkt = repo_tl.findById((int) k).get();
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
     */
}
