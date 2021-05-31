package oop.semesterprojekt.enp.OOP_Semesterprojekt.repository;

import oop.semesterprojekt.enp.OOP_Semesterprojekt.model.Elektronikprodukt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ElektronikproduktRepository extends JpaRepository<Elektronikprodukt, Integer> {

    Elektronikprodukt findByBezeichnung(String bezeichnung);

}
