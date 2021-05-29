package oop.semesterprojekt.enp.OOP_Semesterprojekt;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

public class Objektdatenbank {

    public Objektdatenbank (){

    }

    public void willkommen() {

        System.out.println();
        System.out.println("### WILLKOMMEN ###");
        System.out.println("OOP-Semesterprojekt von Erik, Nico und Pascal");
        System.out.println();
        System.out.println("In dieser Beispielanwendung werden die CRUD-Operationen ausgefuehrt fuer Objekte der Klasse Produkt");

    }

    // CREATE
    public void erstelleObjekt() {

        RestTemplate restTemplate = new RestTemplate();
        final String url = "http://localhost:8080/produkt";
        final String requestJsonCreateProduct = "{\"id\":\"1\", \"bezeichnung\":\"Testprodukt\", \"preis\":\"123.456\", \"gewicht\":\"789.101\", \"hersteller\":\"OOP\", \"fertigungsTag\":\"2021-05-29\", \"lagerungsTemperatur\":\"20.21\" }";
        HttpHeaders headers = new org.springframework.http.HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> entity = new HttpEntity<String>(requestJsonCreateProduct, headers);

        System.out.println();
        System.out.println("### CREATE: Es wird ein generisches Produkt angelegt");
        System.out.println("...");
        restTemplate.postForObject(url, entity, String.class);
        System.out.println("Ein Produkt wurde erfolgreich angelegt");

    }

    // READ
    public void liesObjekt() {

        RestTemplate restTemplate = new RestTemplate();

        System.out.println();
        System.out.println("### READ: Es wird ein generisches Produkt ausgelesen");
        System.out.println("...");
        System.out.println(restTemplate.getForObject("http://localhost:8080/produkt/33", String.class));
        System.out.println("Ein Produkt wurde erfolgreich ausgelesen");

    }

    // UPDATE
    public void aktualisiereObjekt() {

        RestTemplate restTemplate = new RestTemplate();
        final String url = "http://localhost:8080/produkt";
        final String requestJsonUpdateProduct = "{\"id\":\"33\", \"bezeichnung\":\"aktualisiertes Testprodukt\", \"preis\":\"123.456\", \"gewicht\":\"789.101\", \"hersteller\":\"OOP\", \"fertigungsTag\":\"2021-05-29\", \"lagerungsTemperatur\":\"20.21\" }";
        HttpHeaders headers = new org.springframework.http.HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<String> update = new HttpEntity<String>(requestJsonUpdateProduct, headers);
        restTemplate.postForObject(url, update, String.class);

        System.out.println();
        System.out.println("### UPDATE: Die Bezeichnung des Produkts wird aktualisiert. Das aktualisierte Produkt wird ausgegeben.");
        System.out.println("...");
        System.out.println(restTemplate.getForObject("http://localhost:8080/produkt/33", String.class));
        System.out.println("Das Produkt wurde erfolgreich aktualisiert.");

    }

    // DELETE
    public void loescheObjekt() {

        RestTemplate restTemplate = new RestTemplate();

        System.out.println();
        System.out.println("### DELETE: Es wird ein Produkt geloescht.");
        System.out.println("...");
        restTemplate.delete("http://localhost:8080/produkt/1");
        System.out.println("Das Produkt wurde erfolgreich geloescht.");

    }

    public void liesAlleObjekte() {

        RestTemplate restTemplate = new RestTemplate();

        System.out.println();
        System.out.println("### READ: Es werden alle generischen Produkte ausgelesen");
        System.out.println("...");
        System.out.println(restTemplate.getForObject("http://localhost:8080/produkt", String.class));
        System.out.println("Alle Produkte wurden erfolgreich ausgelesen.");

    }
}
