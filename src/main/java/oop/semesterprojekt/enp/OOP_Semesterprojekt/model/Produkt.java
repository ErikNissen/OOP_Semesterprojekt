package oop.semesterprojekt.enp.OOP_Semesterprojekt.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

/** Generelle Oberklasse Produkt.
 * @authors Erik, Nico und Pascal
 */
@Entity
@Table
public class Produkt {

    @Id
    @GeneratedValue
    @Column
    private int id;

    @Column
    private String bezeichnung;

    @Column
    private double preis;

    @Column
    private double gewicht;

    @Column
    private String hersteller;

    @DateTimeFormat(pattern="yyy-MM-dd")
    @Column
    private Date fertigungsTag;

    @Column
    private double lagerungsTemperatur;

    /**
     *
     * @return Produkt-ID
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id Produkt-ID. Primärschlüssel für alle Produkte und Produktarten.
     *           Sollte eine eindeutige, positive Ganzzahl sein
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public String getBezeichnung() {
        return bezeichnung;
    }

    /**
     *
     * @param bezeichnung
     */
    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }


    /**
     *
     * @return
     */
    public double getPreis() {
        return preis;
    }

    /**
     *
     * @param preis
     */
    public void setPreis(double preis) {
        this.preis = preis;
    }

    /**
     *
     * @return
     */
    public double getGewicht() {
        return gewicht;
    }

    /**
     *
     * @param gewicht
     */
    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    /**
     *
     * @return
     */
    public String getHersteller() {
        return hersteller;
    }

    /**
     *
     * @param hersteller
     */
    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    /**
     *
     * @return
     */
    public Date getFertigungsTag() {
        return fertigungsTag;
    }

    /**
     *
     * @param fertigungsTag
     */
    public void setFertigungsTag(Date fertigungsTag) {
        this.fertigungsTag = fertigungsTag;
    }

    /**
     *
     * @return
     */
    public double getLagerungsTemperatur() {
        return lagerungsTemperatur;
    }

    /**
     *
     * @param lagerungsTemperatur
     */
    public void setLagerungsTemperatur(double lagerungsTemperatur) {

        this.lagerungsTemperatur = lagerungsTemperatur;
    }
}
