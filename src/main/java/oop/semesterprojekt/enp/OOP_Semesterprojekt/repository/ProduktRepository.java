package oop.semesterprojekt.enp.OOP_Semesterprojekt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import oop.semesterprojekt.enp.OOP_Semesterprojekt.model.Produkt;

import java.util.List;

public interface ProduktRepository extends JpaRepository<Produkt, Integer> {

    List<Produkt> findByBezeichnung(String bezeichnung);
    Produkt findByGewicht(double gewicht);

}
