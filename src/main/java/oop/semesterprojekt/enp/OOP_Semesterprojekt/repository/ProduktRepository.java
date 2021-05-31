package oop.semesterprojekt.enp.OOP_Semesterprojekt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import oop.semesterprojekt.enp.OOP_Semesterprojekt.model.Produkt;

public interface ProduktRepository extends JpaRepository<Produkt, Integer> {

    Produkt findByBezeichnung(String bezeichnung);
    Produkt findByGewicht(double gewicht);

}
