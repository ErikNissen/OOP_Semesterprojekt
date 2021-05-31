package oop.semesterprojekt.enp.OOP_Semesterprojekt.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Date;

@Entity
public class Lebensmittelprodukt extends Produkt {

    @DateTimeFormat(pattern="yyy-MM-dd")
    @Column
    private Date mindeshaltbarkeitsdatum;

    @Column
    private boolean vegan;

    @Column
    private boolean vegetarisch;

    @Column
    private boolean tierisch;

    @Column
    private boolean glutenfrei;

    @Column
    private boolean laktosefrei;

    @Column
    private boolean zuckerfrei;

    @Column
    private String[] inhaltsstoffe;

    public Date getMindeshaltbarkeitsdatum() {

        return mindeshaltbarkeitsdatum;
    }

    /**
     *
     * @param mindeshaltbarkeitsdatum
     */
    public void setMindeshaltbarkeitsdatum(Date mindeshaltbarkeitsdatum) {

        this.mindeshaltbarkeitsdatum = mindeshaltbarkeitsdatum;
    }

    public boolean isVegan() {

        return vegan;
    }

    /**
     *
     * @param vegan
     */
    public void setVegan(boolean vegan) {

        this.vegan = vegan;
    }

    public boolean isVegetarisch() {

        return vegetarisch;
    }

    /**
     *
     * @param vegetarisch
     */
    public void setVegetarisch(boolean vegetarisch) {

        this.vegetarisch = vegetarisch;
    }

    public boolean isTierisch() {

        return tierisch;
    }

    /**
     *
     * @param tierisch
     */
    public void setTierisch(boolean tierisch) {

        this.tierisch = tierisch;
    }

    public boolean isGlutenfrei() {

        return glutenfrei;
    }

    /**
     *
     * @param glutenfrei
     */
    public void setGlutenfrei(boolean glutenfrei) {

        this.glutenfrei = glutenfrei;
    }

    public boolean isLaktosefrei() {

        return laktosefrei;
    }

    /**
     *
     * @param laktosefrei
     */
    public void setLaktosefrei(boolean laktosefrei) {

        this.laktosefrei = laktosefrei;
    }

    public boolean isZuckerfrei() {

        return zuckerfrei;
    }

    /**
     *
     * @param zuckerfrei
     */
    public void setZuckerfrei(boolean zuckerfrei) {

        this.zuckerfrei = zuckerfrei;
    }

    public String[] getInhaltsstoffe() {

        return inhaltsstoffe;
    }

    /**
     *
     * @param inhaltsstoffe
     */
    public void setInhaltsstoffe(String[] inhaltsstoffe) {

        this.inhaltsstoffe = inhaltsstoffe;
    }

}