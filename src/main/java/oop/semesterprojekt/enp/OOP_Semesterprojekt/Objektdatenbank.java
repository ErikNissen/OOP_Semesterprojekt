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

    // CREATE Produkt
    public void erstelleProdukt( final String url ) {

        RestTemplate restTemplate = new RestTemplate();
        final String requestJsonCreateProduct = "{\"id\":\"1\", " +
                                                "\"bezeichnung\":\"Testprodukt\", " +
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
        restTemplate.postForObject(url, entity, String.class);
        System.out.println("Ein Produkt wurde erfolgreich angelegt");

    }

    // CREATE Lebensmittelprodukt
    public void erstelleLebensmittelprodukt( final String url ) {

        RestTemplate restTemplate = new RestTemplate();
        final String requestJsonCreateLebensmittelprodukt = "{\"id\":\"2\", " +
                                                            "\"bezeichnung\":\"Lebensmittelprodukt\", " +
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
        restTemplate.postForObject(url, entity, String.class);
        System.out.println("Ein Lebensmittelprodukt wurde erfolgreich angelegt");

    }

    // CREATE Elektronikprodukt
    public void erstelleElektronikprodukt( final String url ) {

        RestTemplate restTemplate = new RestTemplate();
        final String requestJsonCreateElektronikprodukt =   "{\"id\":\"3\", " +
                                                            "\"bezeichnung\":\"Elektronikprodukt\", " +
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
        restTemplate.postForObject(url, entity, String.class);
        System.out.println("Ein Elektronikprodukt wurde erfolgreich angelegt");

    }

    // READ Produkt
    public void liesProdukt() {

        RestTemplate restTemplate = new RestTemplate();

        System.out.println();
        System.out.println("### READ: Es wird ein generisches Produkt ausgelesen");
        System.out.println("...");
        System.out.println(restTemplate.getForObject("http://localhost:8080/produkt/1", String.class));
        System.out.println("Ein Produkt wurde erfolgreich ausgelesen");

    }

    // READ Lebensmittelprodukt
    public void liesLebensmittelprodukt() {

        RestTemplate restTemplate = new RestTemplate();

        System.out.println();
        System.out.println("### READ: Es wird ein Lebensmittelprodukt ausgelesen");
        System.out.println("...");
        System.out.println(restTemplate.getForObject("http://localhost:8080/lebensmittel/2", String.class));
        System.out.println("Ein Lebensmittelprodukt wurde erfolgreich ausgelesen");

    }

    // READ Elektronikprodukt
    public void liesElektronikprodukt() {

        RestTemplate restTemplate = new RestTemplate();

        System.out.println();
        System.out.println("### READ: Es wird ein Elektronikprodukt ausgelesen");
        System.out.println("...");
        System.out.println(restTemplate.getForObject("http://localhost:8080/elektronik/3", String.class));
        System.out.println("Ein Elektronikprodukt wurde erfolgreich ausgelesen");

    }

    // UPDATE Produkt
    public void aktualisiereProdukt() {

        RestTemplate restTemplate = new RestTemplate();
        final String url = "http://localhost:8080/produkt";
        final String requestJsonUpdateProduct = "{\"id\":\"1\", " +
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
        System.out.println(restTemplate.getForObject("http://localhost:8080/produkt/1", String.class));
        System.out.println("Das Produkt wurde erfolgreich aktualisiert.");

    }

    // UPDATE Lebensmittelprodukt
    public void aktualisiereLebensmittelprodukt() {

        RestTemplate restTemplate = new RestTemplate();
        final String url = "http://localhost:8080/lebensmittel";
        final String requestJsonUpdateLebensmittelprodukt = "{\"id\":\"2\", " +
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
        System.out.println(restTemplate.getForObject("http://localhost:8080/lebensmittel/2", String.class));
        System.out.println("Das Lebensmittelprodukt wurde erfolgreich aktualisiert.");

    }

    // UPDATE Elektronikprodukt
    public void aktualisiereElektronikprodukt() {

        RestTemplate restTemplate = new RestTemplate();
        final String url = "http://localhost:8080/elektronik";
        final String requestJsonUpdateElektronikprodukt =   "{\"id\":\"3\", " +
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
        System.out.println(restTemplate.getForObject("http://localhost:8080/elektronik/3", String.class));
        System.out.println("Das Elektronikprodukt wurde erfolgreich aktualisiert.");

    }

    // DELETE Produkt
    public void loescheProdukt() {

        RestTemplate restTemplate = new RestTemplate();

        System.out.println();
        System.out.println("### DELETE: Es wird ein Produkt geloescht.");
        System.out.println("...");
        restTemplate.delete("http://localhost:8080/produkt/1");
        System.out.println("Das Produkt wurde erfolgreich geloescht.");

    }

    // DELETE Lebensmittelprodukt
    public void loescheLebensmittelprodukt() {

        RestTemplate restTemplate = new RestTemplate();

        System.out.println();
        System.out.println("### DELETE: Es wird ein Lebensmittelprodukt geloescht.");
        System.out.println("...");
        restTemplate.delete("http://localhost:8080/lebensmittel/2");
        System.out.println("Das Lebensmittelprodukt wurde erfolgreich geloescht.");

    }

    // DELETE Elektronikprodukt
    public void loescheElektronikprodukt() {

        RestTemplate restTemplate = new RestTemplate();

        System.out.println();
        System.out.println("### DELETE: Es wird ein Elektronikprodukt geloescht.");
        System.out.println("...");
        restTemplate.delete("http://localhost:8080/elektronik/3");
        System.out.println("Das Produkt wurde erfolgreich geloescht.");

    }

    public void liesAlleObjekte() {

        RestTemplate restTemplate = new RestTemplate();

        System.out.println();
        System.out.println("### READ: Es werden alle Produkte ausgelesen");
        System.out.println("...");
        System.out.println(restTemplate.getForObject("http://localhost:8080/produkt", String.class));
        System.out.println("Alle Produkte wurden erfolgreich ausgelesen.");

    }
}
