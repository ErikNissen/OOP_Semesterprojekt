package oop.semesterprojekt.enp.OOP_Semesterprojekt.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity
public class Elektronikprodukt extends Produkt {

    @Column
    private String schutzklasse;

    @Column
    private double stromverbrauch;

    @Column
    private double leistung;

    @Column
    private String anschlussart;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    @Column( name = "garantieZeit")
    @Temporal(TemporalType.DATE)
    private Date garantieZeit;

    @Column( name = "hatSchalter")
    private boolean hatSchalter;

    @Column
    private boolean netzwerkfaehig;

    @Column( name = "anzahlSignalleuchten")
    private int anzahlSignalleuchten;

    public String getSchutzklasse() {

        return schutzklasse;
    }

    /**
     *
     * @param schutzklasse
     */
    public void setSchutzklasse(String schutzklasse) {

        this.schutzklasse = schutzklasse;
    }

    public double getStromverbrauch() {

        return stromverbrauch;
    }

    /**
     *
     * @param stromverbrauch
     */
    public void setStromverbrauch(double stromverbrauch) {

        this.stromverbrauch = stromverbrauch;
    }

    public double getLeistung() {

        return leistung;
    }

    /**
     *
     * @param leistung
     */
    public void setLeistung(double leistung) {

        this.leistung = leistung;
    }

    public String getAnschlussart() {

        return anschlussart;
    }

    /**
     *
     * @param anschlussart
     */
    public void setAnschlussart(String anschlussart) {

        this.anschlussart = anschlussart;
    }

    public Date getGarantieZeit() {

        return garantieZeit;
    }

    /**
     *
     * @param garantieZeit
     */
    public void setGarantieZeit(Date garantieZeit) {

        this.garantieZeit = garantieZeit;
    }

    public boolean isHatSchalter() {

        return hatSchalter;
    }

    /**
     *
     * @param hatSchalter
     */
    public void setHatSchalter(boolean hatSchalter) {

        this.hatSchalter = hatSchalter;
    }

    public boolean isNetzwerkfaehig() {

        return netzwerkfaehig;
    }

    /**
     *
     * @param netzwerkfaehig
     */
    public void setNetzwerkfaehig(boolean netzwerkfaehig) {

        this.netzwerkfaehig = netzwerkfaehig;
    }

    public int getAnzahlSignalleuchten() {

        return anzahlSignalleuchten;
    }

    /**
     *
     * @param anzahlSignalleuchten
     */
    public void setAnzahlSignalleuchten(int anzahlSignalleuchten) {

        this.anzahlSignalleuchten = anzahlSignalleuchten;
    }
}
