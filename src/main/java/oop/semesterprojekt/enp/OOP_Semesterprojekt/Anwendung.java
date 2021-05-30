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
		objektdatenbank.erstelleProdukt("http://localhost:8080/produkt");

		// CREATE Lebensmittelprodukt
		objektdatenbank.erstelleLebensmittelprodukt("http://localhost:8080/lebensmittel");

		// CREATE Elektronikprodukt
		objektdatenbank.erstelleElektronikprodukt("http://localhost:8080/elektronik");

		// READ Produkt
		objektdatenbank.liesProdukt();

		// READ Lebensmittelprodukt
		objektdatenbank.liesLebensmittelprodukt();

		// READ Elektronikprodukt
		objektdatenbank.liesElektronikprodukt();

		// UPDATE Produkt
		objektdatenbank.aktualisiereProdukt();

		// UPDATE Lebensmittelprodukt
		objektdatenbank.aktualisiereLebensmittelprodukt();

		// UPDATE Elektronikprodukt
		objektdatenbank.aktualisiereElektronikprodukt();

		// DELETE Produkt
		objektdatenbank.loescheProdukt();

		// DELETE Lebensmittelprodukt
		objektdatenbank.loescheLebensmittelprodukt();

		// DELETE Elektronikprodukt
		objektdatenbank.loescheElektronikprodukt();

		objektdatenbank.liesAlleObjekte();
	}
}
