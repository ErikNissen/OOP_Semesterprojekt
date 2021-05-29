package oop.semesterprojekt.enp.OOP_Semesterprojekt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"oop.semesterprojekt.enp.OOP_Semesterprojekt"})
public class Anwendung {

	public static void main(String[] args) {

		SpringApplication.run(Anwendung.class, args);

		/**
		 * ODB wird als Klasse realisiert, die in nutzende Systeme eingebunden werden kann
		 */
		Objektdatenbank objektdatenbank = new Objektdatenbank();

		objektdatenbank.willkommen();

		// CREATE Produkt
		objektdatenbank.erstelleObjekt();

		// READ Produkt
		objektdatenbank.liesObjekt();

		// UPDATE Produkt
		objektdatenbank.aktualisiereObjekt();

		// DELETE Produkt
		//objektdatenbank.loescheObjekt();

		objektdatenbank.liesAlleObjekte();
	}
}
