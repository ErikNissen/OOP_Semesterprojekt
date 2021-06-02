package oop.semesterprojekt.enp.OOP_Semesterprojekt.repository;

import oop.semesterprojekt.enp.OOP_Semesterprojekt.model.Lebensmittelprodukt;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LebensmittelproduktRepository extends JpaRepository<Lebensmittelprodukt, Integer> {

    List<Lebensmittelprodukt> findByBezeichnung(String bezeichnung);

}