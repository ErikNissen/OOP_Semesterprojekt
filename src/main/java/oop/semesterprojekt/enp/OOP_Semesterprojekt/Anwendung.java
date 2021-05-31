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
		final String produktId = objektdatenbank.erstelleProdukt("http://localhost:8080/produkt");

		// CREATE Lebensmittelprodukt
		final String lebensmittelproduktId = objektdatenbank.erstelleLebensmittelprodukt("http://localhost:8080/lebensmittel");

		// CREATE Elektronikprodukt
		final String elektronikproduktId = objektdatenbank.erstelleElektronikprodukt("http://localhost:8080/elektronik");

		// READ Produkt
		objektdatenbank.liesProdukt(produktId);

		// READ Lebensmittelprodukt
		objektdatenbank.liesLebensmittelprodukt(lebensmittelproduktId);

		// READ Elektronikprodukt
		objektdatenbank.liesElektronikprodukt(elektronikproduktId);

		// UPDATE Produkt
		objektdatenbank.aktualisiereProdukt(produktId);

		// UPDATE Lebensmittelprodukt
		objektdatenbank.aktualisiereLebensmittelprodukt(lebensmittelproduktId);

		// UPDATE Elektronikprodukt
		objektdatenbank.aktualisiereElektronikprodukt(elektronikproduktId);

		// DELETE Produkt
		objektdatenbank.loescheProdukt(produktId);

		// DELETE Lebensmittelprodukt
		objektdatenbank.loescheLebensmittelprodukt(lebensmittelproduktId);

		// DELETE Elektronikprodukt
		objektdatenbank.loescheElektronikprodukt(elektronikproduktId);

		objektdatenbank.liesAlleObjekte();
	}
}
