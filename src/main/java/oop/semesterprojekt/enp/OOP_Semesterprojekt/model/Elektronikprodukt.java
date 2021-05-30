package oop.semesterprojekt.enp.OOP_Semesterprojekt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
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

    @Column
    private Date garantieZeit;

    @Column
    private boolean hatSchalter;

    @Column
    private boolean netzwerkfaehig;

    @Column
    private int anzahlSignalleuchten;

    /**
     *
     * @return
     */
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

    /**
     *
     * @return
     */
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

    /**
     *
     * @return
     */
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

    /**
     *
     * @return
     */
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

    /**
     *
     * @return
     */
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

    /**
     *
     * @return
     */
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

    /**
     *
     * @return
     */
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

    /**
     *
     * @return
     */
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
