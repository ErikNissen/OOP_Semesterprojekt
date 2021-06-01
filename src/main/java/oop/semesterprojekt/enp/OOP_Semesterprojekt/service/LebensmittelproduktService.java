package oop.semesterprojekt.enp.OOP_Semesterprojekt.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import oop.semesterprojekt.enp.OOP_Semesterprojekt.model.Lebensmittelprodukt;
import oop.semesterprojekt.enp.OOP_Semesterprojekt.repository.LebensmittelproduktRepository;

@Service
public class LebensmittelproduktService {

    @Autowired
    LebensmittelproduktRepository lebensmittelproduktRepository;

    // CREATE or UPDATE
    public Lebensmittelprodukt saveOrUpdateLebensmittelprodukt(Lebensmittelprodukt lebensmittelprodukt) {
        return lebensmittelproduktRepository.save(lebensmittelprodukt);
    }

    // READ: alle Lebensmittelprodukte werden ausgegeben
    public List<Lebensmittelprodukt> getAllLebensmittelprodukt() {

        return lebensmittelproduktRepository.findAll();
    }

    // READ: ein Lebensmittelprodukt wird ausgegeben; id einmalig
    public Lebensmittelprodukt getLebensmittelproduktById(int id) {
        return lebensmittelproduktRepository.findById(id).get();
    }

    // READ: ein oder mehrere Lebensmittelprodukte mit der gesuchten Bezeichnung werden ausgesucht
    public Lebensmittelprodukt getLebensmittelproduktByName(String name) {

        return lebensmittelproduktRepository.findByBezeichnung(name);
    }

    // DELETE
    public void delete(int id) {

        lebensmittelproduktRepository.deleteById(id);
    }
}
