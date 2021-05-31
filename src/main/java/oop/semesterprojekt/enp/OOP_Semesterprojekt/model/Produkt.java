package oop.semesterprojekt.enp.OOP_Semesterprojekt.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

/**
 * Die generelle Oberklasse enthält ausschließlich Attribute, Getter und Setter. Die daraus abgeleiteten Klassen sind
 * nach demselben Schema aufgebaut und werden deswegen nicht näher dokumentiert.<br><br>
 *
 * Die generelle Oberklasse ist auf Wunsch unserer Kunden nicht abstract. Viele Unternehmen betreiben sogenannte
 * "Innovation Hubs" und haben ausdrücklich den Wunsch geäußert, generische Produkte in der Tabelle anlegen zu können, um
 * dann immer noch entscheiden zu können, ob das in Zukunft ein Elektronikartikel wird oder etwas zu essen.<br><br>
 *
 * Außerdem erfolgt in den Klassen über JPA-Annotationen und Hibernate ein Mapping in eine Datenbank.
 * Die JPA-Annotationen werden bei der jeweils ersten Verwendung kommentiert, in den
 * Subklassen Elektronikprodukt und Lebensmittelprodukt dann als gegeben betrachtet.
 */
@Entity // Definiert die Klasse als JPA-Entitäts-Klasse. Dadurch kann die Klasse z.B. via Hibernate zu einer Datenbank gemapped werden
@Table( name = "Produkt") // optionale Annotation. Der Tabellenname wird dem Entitäts-Klassen-Namen entnommen
public class Produkt {

    @Id // nach Entity die zweite Pflicht-Annotation. Die Id-Annotation spezifiziert den Primärschlüssel der Entität
    @GeneratedValue(strategy = GenerationType.IDENTITY) // optionale Annotation. Spezifiziert wie Werte für den Primärschlüssel generiert werden. Es gibt vier "id-generation-strategies"
    @Column( unique = true) // optionale Annotation. Hier erfolgt das Mapping zwischen einem Attribut einer Entität und einer Datenbank-Tabellen-Spalte. Es können Einstellungen wie name, length, nullable und unique vorgenommen werden
    private int id;

    @Column
    private String bezeichnung;

    @Column
    private double preis;

    @Column
    private double gewicht;

    @Column
    private String hersteller;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    @Column
    private Date fertigungsTag;

    @Column
    private double lagerungsTemperatur;

    public int getId() {

        return id;
    }

    /**
     *
     * @param id Produkt-ID. Primärschlüssel für alle Produkte und Produktarten.
     *           Sollte eine eindeutige, positive Ganzzahl sein
     */
    public void setId(int id) {

        if( id > 0 ) {
            this.id = id;
        } else {
            System.err.println("FEHLER: ID darf nicht kleiner oder gleich 0 sein.");
        }
    }

    public String getBezeichnung() {

        return bezeichnung;
    }

    /**
     *
     * @param bezeichnung Bezeichnung. Sollte nur aus alphanumerischen Werten bestehen.
     */
    public void setBezeichnung(String bezeichnung) {

        this.bezeichnung = bezeichnung;
    }

    public double getPreis() {

        return preis;
    }

    /**
     *
     * @param preis Preis. Sollte mindestens kostenlos sein (ergo: eine Fließkommazahl größer oder gleich 0.0)
     */
    public void setPreis(double preis) {

        if( preis >= 0.0 ) {

            this.preis = preis;
        } else {
            System.err.println("FEHLER: Der Preis darf nicht weniger als kostenlos sein.");
        }
    }

    public double getGewicht() {

        return gewicht;
    }

    /**
     *
     * @param gewicht Gewicht. Sollte eine positive Fließkommazahl sein
     */
    public void setGewicht(double gewicht) {

        if( gewicht > 0.0 ) {

            this.gewicht = gewicht;
        } else {
            System.err.println("FEHLER: Das Gewicht darf nicht weniger als 0.0 sein");
        }
    }

    public String getHersteller() {

        return hersteller;
    }

    /**
     *
     * @param hersteller Hersteller. Sollte nur aus alphanumerischen Werten bestehen
     */
    public void setHersteller(String hersteller) {

        this.hersteller = hersteller;
    }

    public Date getFertigungsTag() {

        return fertigungsTag;
    }

    /**
     *
     * @param fertigungsTag Fertigungstag. Format: YYYY-MM-DD
     */
    public void setFertigungsTag(Date fertigungsTag) {

        this.fertigungsTag = fertigungsTag;
    }

    public double getLagerungsTemperatur() {

        return lagerungsTemperatur;
    }

    /**
     *
     * @param lagerungsTemperatur Lagerungstemperatur. Darf sowohl positive als auch negative Werte im Rahmen des physikalisch möglichen annehmen
     */
    public void setLagerungsTemperatur(double lagerungsTemperatur) {

        if( ( lagerungsTemperatur >= -273.15 ) && ( lagerungsTemperatur <= 4000000000000.0) ) {
            this.lagerungsTemperatur = lagerungsTemperatur;
        } else {
            System.err.println("FEHLER: Der absolute Nullpunkt liegt bei -273.15 Grad Celsius. Die jemals höchste von Wissenschaftlern erzeugte Temperatur liegt bei vier Billionen Grad Celsius.");
        }
    }
}