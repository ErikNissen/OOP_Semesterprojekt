package oop.semesterprojekt.enp.OOP_Semesterprojekt.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import oop.semesterprojekt.enp.OOP_Semesterprojekt.model.Lebensmittelprodukt;
import oop.semesterprojekt.enp.OOP_Semesterprojekt.repository.LebensmittelproduktRepository;

@Service
public class LebensmittelproduktService {

    @Autowired
    LebensmittelproduktRepository lebensmittelproduktRepository;

    public List<Lebensmittelprodukt> getAllLebensmittelprodukt() {

        List<Lebensmittelprodukt> lebensmittelprodukte = new ArrayList<Lebensmittelprodukt>();
        lebensmittelproduktRepository.findAll().forEach(lebensmittelprodukt -> lebensmittelprodukte.add(lebensmittelprodukt));

        return lebensmittelprodukte;
    }

    public Lebensmittelprodukt getLebensmittelproduktById(int id) {
        return lebensmittelproduktRepository.findById(id).get();
    }

    public Lebensmittelprodukt saveOrUpdateLebensmittelprodukt(Lebensmittelprodukt lebensmittelprodukt) {
        return lebensmittelproduktRepository.save(lebensmittelprodukt);
    }

    public void delete(int id) { lebensmittelproduktRepository.deleteById(id); }
}
