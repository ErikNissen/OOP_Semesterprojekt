package oop.semesterprojekt.enp.OOP_Semesterprojekt.repository;

import oop.semesterprojekt.enp.OOP_Semesterprojekt.model.Elektronikprodukt;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ElektronikproduktRepository extends JpaRepository<Elektronikprodukt, Integer> {

    List<Elektronikprodukt> findByBezeichnung(String bezeichnung);

}
