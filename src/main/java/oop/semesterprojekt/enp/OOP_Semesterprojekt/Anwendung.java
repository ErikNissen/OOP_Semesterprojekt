package oop.semesterprojekt.enp.OOP_Semesterprojekt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * <h1>OOP-Semesterprojekt</h1>
 * Die Anwendung erstellt ein Objekt der Klasse Objektdatenbank und führt mittels dieser Methoden aus, welche die CRUD-
 * Operationen (Create, Read, Update, Delete) abbilden. Die einzelnen Vorgänge werden im Terminal ausgegeben.
 *
 * @author Erik Nissen, Nico Johnsen, Pascal Groß
 */
@SpringBootApplication
@ComponentScan(basePackages = {"oop.semesterprojekt.enp.OOP_Semesterprojekt"})
public class Anwendung {

	public static void main(String[] args) {

		SpringApplication.run(Anwendung.class, args);

		Objektdatenbank objektdatenbank = new Objektdatenbank();

		objektdatenbank.willkommen();

		// CREATE Produkt
		// Daten werden über eine REST-Schnittstelle verarbeitet
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

		/*
		 * Bis hierhin wurde jeweils ein Objekt erstellt, ausgelesen, aktualisiert und wieder gelöscht
		 * Damit trotzdem noch Daten vorhanden sind, werden weitere Objekte erstellt
		 */
		for(int i = 0; i < 5; i++) {

			objektdatenbank.erstelleProdukt("http://localhost:8080/produkt");
			objektdatenbank.erstelleLebensmittelprodukt("http://localhost:8080/lebensmittel");
			objektdatenbank.erstelleElektronikprodukt("http://localhost:8080/elektronik");

		}

		/*
		 * Erzeugt eine Ausgabe im Terminal.
		 * Bitte beachten: ggf. entsteht ein Scollbalken, welcher nach rechts zu ziehen ist.
		 */
		objektdatenbank.liesAlleObjekte();
		/*
		 * Für eine übersichtlichere Ausgabe, bitte folgendes verwenden, nachdem die Anwendung gestartet
		 * wurde:
		 *
		 * http://localhost:8080/produkt.html oder
		 *
		 * http://localhost:8080/h2-console/
		 *
		 * 	Dabei sicherstellen, dass in JDBC URL "jdbc:h2:./src/main/resources/datenbank" steht
		 * 	anschließend auf "Connect" klicken
		 * 	anschließend links auf "PRODUKT" klicken
		 * 	anschließend über dem SQL-Statement auf "RUN" klicken
		 */
	}
}
