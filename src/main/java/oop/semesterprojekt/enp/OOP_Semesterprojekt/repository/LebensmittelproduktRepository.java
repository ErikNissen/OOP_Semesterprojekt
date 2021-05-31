package oop.semesterprojekt.enp.OOP_Semesterprojekt.repository;

import oop.semesterprojekt.enp.OOP_Semesterprojekt.model.Lebensmittelprodukt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LebensmittelproduktRepository extends JpaRepository<Lebensmittelprodukt, Integer> {

    Lebensmittelprodukt findByBezeichnung(String bezeichnung);


}
