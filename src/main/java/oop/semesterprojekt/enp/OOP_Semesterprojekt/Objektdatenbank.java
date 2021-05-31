package oop.semesterprojekt.enp.OOP_Semesterprojekt;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

/**
 * Die Klasse "Objektdatenbank" kann in nutzende Systeme eingebunden werden. "Objektdatenbank" implementiert Methoden,
 * um mittels REST-Api-Calls Daten zu speichern, zu aktualisieren, auszulesen und zu löschen.<br><br>
 *
 * Hinweis: Der Übersicht wegen werden nur Methoden kommentiert, die mit der Klasse Produkt in Zusammenhang stehen. Die
 * CRUD-Operationen für die Klassen Lebensmittelprodukt und Elektronikprodukt funktionieren auf dieselbe Weise.
 */
public class Objektdatenbank {

    // Methode willkommen() erzeugt Bildschirmausgaben im Terminal
    public void willkommen() {

        System.out.println();
        System.out.println("### WILLKOMMEN ###");
        System.out.println("OOP-Semesterprojekt von Erik, Nico und Pascal");
        System.out.println();
        System.out.println("In dieser Beispielanwendung werden die CRUD-Operationen ausgefuehrt fuer Objekte der Klasse Produkt");

    }

    // CREATE Produkt
    /**
     *
     * @param url URL der REST-Schnittstelle
     * @return In "response" steht die ID des angelegten Produkts.
     *
     * Wird verwendet in Anwendung.java
     * Mit "final String produktId = objektdatenbank.erstelleProdukt("http://localhost:8080/produkt");" wird eine
     * Produkt-ID gespeichert, um die über diese ID identifizierten Objekte auszulesen, zu aktualisieren oder zu löschen
     */
    public String erstelleProdukt( final String url ) {

        RestTemplate restTemplate = new RestTemplate();
        final String requestJsonCreateProduct = "{\"bezeichnung\":\"Testprodukt\", " +
                                                "\"preis\":\"123.456\", " +
                                                "\"gewicht\":\"789.101\", " +
                                                "\"hersteller\":\"OOP\", " +
                                                "\"fertigungsTag\":\"2021-05-29\", " +
                                                "\"lagerungsTemperatur\":\"20.21\" }";

        HttpHeaders headers = new org.springframework.http.HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> entity = new HttpEntity<String>(requestJsonCreateProduct, headers);

        System.out.println();
        System.out.println("### CREATE: Es wird ein generisches Produkt angelegt");
        System.out.println("...");
        final String response = restTemplate.postForObject(url, entity, String.class);
        System.out.println("Ein Produkt wurde erfolgreich angelegt");

        System.out.println(response);

        return response;
    }

    // CREATE Lebensmittelprodukt
    public String erstelleLebensmittelprodukt( final String url ) {

        RestTemplate restTemplate = new RestTemplate();
        final String requestJsonCreateLebensmittelprodukt = "{\"bezeichnung\":\"Lebensmittelprodukt\", " +
                                                            "\"preis\":\"123.456\", " +
                                                            "\"gewicht\":\"789.101\", " +
                                                            "\"hersteller\":\"Käpt'n Iglo\", " +
                                                            "\"fertigungsTag\":\"2021-05-29\", " +
                                                            "\"lagerungsTemperatur\":\"20.21\", " +
                                                            "\"mindesthaltbarkeitsdatum\":\"2021-05-30\", " +
                                                            "\"vegan\":\"true\", " +
                                                            "\"vegetarisch\":\"true\", " +
                                                            "\"tierisch\":\"true\", " +
                                                            "\"glutenfrei\":\"true\", " +
                                                            "\"laktosefrei\":\"true\", " +
                                                            "\"zuckerfrei\":\"true\", " +
                                                            "\"inhaltsstoffe\":[\"Liebe\", \"Hoffnung\", \"Einhornblut\"] }";

        HttpHeaders headers = new org.springframework.http.HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> entity = new HttpEntity<String>(requestJsonCreateLebensmittelprodukt, headers);

        System.out.println();
        System.out.println("### CREATE: Es wird ein Lebensmittelprodukt angelegt");
        System.out.println("...");
        final String response = restTemplate.postForObject(url, entity, String.class);
        System.out.println("Ein Lebensmittelprodukt wurde erfolgreich angelegt");

        return response;

    }

    // CREATE Elektronikprodukt
    public String erstelleElektronikprodukt( final String url ) {

        RestTemplate restTemplate = new RestTemplate();
        final String requestJsonCreateElektronikprodukt =   "{\"bezeichnung\":\"Elektronikprodukt\", " +
                                                            "\"preis\":\"123.456\", " +
                                                            "\"gewicht\":\"789.101\", " +
                                                            "\"hersteller\":\"Samsung\", " +
                                                            "\"fertigungsTag\":\"2021-05-29\", " +
                                                            "\"lagerungsTemperatur\":\"20.21\", " +
                                                            "\"schutzklasse\":\"1.1\", " +
                                                            "\"stromverbrauch\":\"123.45\", " +
                                                            "\"leistung\":\"321.98\", " +
                                                            "\"anschlussart\":\"kabelgebunden\", " +
                                                            "\"garantieZeit\":\"2022-12-31\", " +
                                                            "\"hatSchalter\":\"true\", " +
                                                            "\"netzwerkfaehig\":\"true\", " +
                                                            "\"anzahlSignalleuchten\":\"32\" }";

        HttpHeaders headers = new org.springframework.http.HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> entity = new HttpEntity<String>(requestJsonCreateElektronikprodukt, headers);

        System.out.println();
        System.out.println("### CREATE: Es wird ein Elektronikprodukt angelegt");
        System.out.println("...");
        final String response = restTemplate.postForObject(url, entity, String.class);
        System.out.println("Ein Elektronikprodukt wurde erfolgreich angelegt");

        return response;

    }

    // READ Produkt

    /**
     *
     * @param produktId Entgegengenommen wird eine Produkt-ID, um damit vollständig die REST-Schnittstelle aufzurufen
     *                  Der REST-Call erfolgt in Zeile 143
     */
    public void liesProdukt(String produktId) {

        RestTemplate restTemplate = new RestTemplate();

        System.out.println();
        System.out.println("### READ: Es wird ein generisches Produkt ausgelesen");
        System.out.println("...");
        System.out.println(restTemplate.getForObject("http://localhost:8080/produkt/" + produktId, String.class));
        System.out.println("Ein Produkt wurde erfolgreich ausgelesen");

    }

    // READ Lebensmittelprodukt
    public void liesLebensmittelprodukt(String lebensmittelproduktId) {

        RestTemplate restTemplate = new RestTemplate();

        System.out.println();
        System.out.println("### READ: Es wird ein Lebensmittelprodukt ausgelesen");
        System.out.println("...");
        System.out.println(restTemplate.getForObject("http://localhost:8080/lebensmittel/" + lebensmittelproduktId, String.class));
        System.out.println("Ein Lebensmittelprodukt wurde erfolgreich ausgelesen");

    }

    // READ Elektronikprodukt
    public void liesElektronikprodukt(String elektronikproduktId) {

        RestTemplate restTemplate = new RestTemplate();

        System.out.println();
        System.out.println("### READ: Es wird ein Elektronikprodukt ausgelesen");
        System.out.println("...");
        System.out.println(restTemplate.getForObject("http://localhost:8080/elektronik/" + elektronikproduktId, String.class));
        System.out.println("Ein Elektronikprodukt wurde erfolgreich ausgelesen");

    }

    // UPDATE Produkt

    /**
     *
     * @param produktId Entgegengenommen wird eine Produkt-ID, um damit einen vollständigen REST-Call durchzuführen
     *                  Aufruf der REST-Schnittstelle erfolgt in Zeile 201
     */
    public void aktualisiereProdukt(String produktId) {

        RestTemplate restTemplate = new RestTemplate();
        final String url = "http://localhost:8080/produkt/";
        final String requestJsonUpdateProduct = "{\"id\":\""+produktId+"\", " +
                                                "\"bezeichnung\":\"aktualisiertes Testprodukt\", " +
                                                "\"preis\":\"123.456\", " +
                                                "\"gewicht\":\"789.101\", " +
                                                "\"hersteller\":\"OOP\", " +
                                                "\"fertigungsTag\":\"2021-05-29\", " +
                                                "\"lagerungsTemperatur\":\"20.21\" }";
        HttpHeaders headers = new org.springframework.http.HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<String> update = new HttpEntity<String>(requestJsonUpdateProduct, headers);
        restTemplate.postForObject(url, update, String.class);

        System.out.println();
        System.out.println("### UPDATE: Die Bezeichnung des Produkts wird aktualisiert. Das aktualisierte Produkt wird ausgegeben.");
        System.out.println("...");
        System.out.println(restTemplate.getForObject("http://localhost:8080/produkt/" + produktId, String.class));
        System.out.println("Das Produkt wurde erfolgreich aktualisiert.");

    }

    // UPDATE Lebensmittelprodukt
    public void aktualisiereLebensmittelprodukt(String lebensmittelproduktId) {

        RestTemplate restTemplate = new RestTemplate();
        final String url = "http://localhost:8080/lebensmittel";
        final String requestJsonUpdateLebensmittelprodukt ="{\"id\":\""+lebensmittelproduktId+"\", " +
                                                            "\"bezeichnung\":\"aktualisiertes Lebensmittelprodukt\", " +
                                                            "\"preis\":\"123.456\", " +
                                                            "\"gewicht\":\"789.101\", " +
                                                            "\"hersteller\":\"Käpt'n Iglo\", " +
                                                            "\"fertigungsTag\":\"2021-05-29\", " +
                                                            "\"lagerungsTemperatur\":\"20.21\", " +
                                                            "\"mindesthaltbarkeitsdatum\":\"2021-05-30\", " +
                                                            "\"vegan\":\"true\", " +
                                                            "\"vegetarisch\":\"true\", " +
                                                            "\"tierisch\":\"true\", " +
                                                            "\"glutenfrei\":\"true\", " +
                                                            "\"laktosefrei\":\"true\", " +
                                                            "\"zuckerfrei\":\"true\", " +
                                                            "\"inhaltsstoffe\":[\"Liebe\", \"Hoffnung\", \"Einhornblut\"] }";

        HttpHeaders headers = new org.springframework.http.HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<String> update = new HttpEntity<String>(requestJsonUpdateLebensmittelprodukt, headers);
        restTemplate.postForObject(url, update, String.class);

        System.out.println();
        System.out.println("### UPDATE: Die Bezeichnung des Lebensmittelprodukts wird aktualisiert. Das aktualisierte Lebensmittelprodukt wird ausgegeben.");
        System.out.println("...");
        System.out.println(restTemplate.getForObject("http://localhost:8080/lebensmittel/" + lebensmittelproduktId, String.class));
        System.out.println("Das Lebensmittelprodukt wurde erfolgreich aktualisiert.");

    }

    // UPDATE Elektronikprodukt
    public void aktualisiereElektronikprodukt(String elektronikproduktId) {

        RestTemplate restTemplate = new RestTemplate();
        final String url = "http://localhost:8080/elektronik";
        final String requestJsonUpdateElektronikprodukt =   "{\"id\":\""+elektronikproduktId+"\", " +
                                                            "\"bezeichnung\":\"aktualisiertes Elektronikprodukt\", " +
                                                            "\"preis\":\"123.456\", " +
                                                            "\"gewicht\":\"789.101\", " +
                                                            "\"hersteller\":\"Samsung\", " +
                                                            "\"fertigungsTag\":\"2021-05-29\", " +
                                                            "\"lagerungsTemperatur\":\"20.21\", " +
                                                            "\"schutzklasse\":\"1.1\", " +
                                                            "\"stromverbrauch\":\"123.45\", " +
                                                            "\"leistung\":\"321.98\", " +
                                                            "\"anschlussart\":\"kabelgebunden\", " +
                                                            "\"garantieZeit\":\"2022-12-31\", " +
                                                            "\"hatSchalter\":\"true\", " +
                                                            "\"netzwerkfaehig\":\"true\", " +
                                                            "\"anzahlSignalleuchten\":\"32\" }";

        HttpHeaders headers = new org.springframework.http.HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<String> update = new HttpEntity<String>(requestJsonUpdateElektronikprodukt, headers);
        restTemplate.postForObject(url, update, String.class);

        System.out.println();
        System.out.println("### UPDATE: Die Bezeichnung des Elektronikprodukts wird aktualisiert. Das aktualisierte Elektronikprodukt wird ausgegeben.");
        System.out.println("...");
        System.out.println(restTemplate.getForObject("http://localhost:8080/elektronik/" + elektronikproduktId, String.class));
        System.out.println("Das Elektronikprodukt wurde erfolgreich aktualisiert.");

    }

    // DELETE Produkt

    /**
     *
     * @param produktId Entgegengenommen wird eine Produkt-ID, um damit vollständig einen REST-Call durchzuführen
     *                  Aufruf der REST-Schnittstelle erfolgt in Zeile 290
     */
    public void loescheProdukt(String produktId) {

        RestTemplate restTemplate = new RestTemplate();

        System.out.println();
        System.out.println("### DELETE: Es wird ein Produkt geloescht.");
        System.out.println("...");
        restTemplate.delete("http://localhost:8080/produkt/" + produktId);
        System.out.println("Das Produkt wurde erfolgreich geloescht.");

    }

    // DELETE Lebensmittelprodukt
    public void loescheLebensmittelprodukt(String lebensmittelproduktId) {

        RestTemplate restTemplate = new RestTemplate();

        System.out.println();
        System.out.println("### DELETE: Es wird ein Lebensmittelprodukt geloescht.");
        System.out.println("...");
        restTemplate.delete("http://localhost:8080/lebensmittel/" + lebensmittelproduktId);
        System.out.println("Das Lebensmittelprodukt wurde erfolgreich geloescht.");

    }

    // DELETE Elektronikprodukt
    public void loescheElektronikprodukt(String elektronikproduktId) {

        RestTemplate restTemplate = new RestTemplate();

        System.out.println();
        System.out.println("### DELETE: Es wird ein Elektronikprodukt geloescht.");
        System.out.println("...");
        restTemplate.delete("http://localhost:8080/elektronik/" + elektronikproduktId);
        System.out.println("Das Produkt wurde erfolgreich geloescht.");

    }

    // Es wird eine Ausgabe auf dem Bildschirm im Terminal-Fenster erzeugt
    public void liesAlleObjekte() {

        RestTemplate restTemplate = new RestTemplate();

        System.out.println();
        System.out.println("### READ: Es werden alle Produkte ausgelesen");
        System.out.println("...");
        System.out.println(restTemplate.getForObject("http://localhost:8080/produkt", String.class));
        System.out.println("Alle Produkte wurden erfolgreich ausgelesen.");

    }
}