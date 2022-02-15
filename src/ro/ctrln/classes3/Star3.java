package ro.ctrln.classes3;

import java.math.BigDecimal;

public class Star3 { //o singura clasa poate fi publica

    private String starDescription; //parametrii clasei pe care ai vom defini pentru fiecare obiect instantiat cu valorile proprii
    private int diametre;
    private int satellites;
    private BigDecimal mass; // clic pe BigDecimal & ctrl & space shortcut pentru a afla variantele pt BigDecimal
    private SmallPlanet smallPlanet;

    /*  public Star3() {} //constructorul implicit default

    public Star3(String starDescription3, int diametre3, int satellites3, BigDecimal mass3){
        this.starDescription = starDescription3;
        this.diametre = diametre3;
        this.satellites = satellites3;
        this.mass = mass3;
    } // fiecarui parametru al clasei star3 i se atribuie un parametru al obiectului star3

    public String getStarDescription() {
        return starDescription
    }

    public int getDiametre() {
        return diametre;
    }

    public int getSatellites() {
        return satellites
    }

    public BigDecimal getMass() {
        return mass;
    }

    public void setStarDescription(String starDescription) {
        this.starDescription = starDescription; // cuvantul this. ajuta java sa inteleaga ca ne referim la proprtietatea obiectului curent si
    }                                             // si nu la parametrul metodei setStarDescription

    public void setDiametre(int diametre) {
        this.diametre = diametre;
    }

    public void setSatellites(int satellites) {
        this.satellites = satellites;
    }

    public void setMass(BigDecimal mass) {
        this.mass = mass;
    } */

//  PARTEA DE MAI SUS A FOST SCRISA MANUAL,
//  SE POATE GENERA AUTOMAT ACEST COD DIN MENIUL CODE - GENERATE CONSTRUCTORI, SET-ERE, GET-ERE, EQUALS SI HASHCODE


    public Star3() {
    }

    public Star3(String starDescription, int diametre, int satellites, BigDecimal mass) {
        this.starDescription = starDescription;
        this.diametre = diametre;
        this.satellites = satellites;
        this.mass = mass;
    }

    public String getStarDescription() {
        return starDescription;
    }

    public void setStarDescription(String starDescription) {
        this.starDescription = starDescription;
    }

    public int getDiametre() {
        return diametre;
    }

    public void setDiametre(int diametre) {
        this.diametre = diametre;
    }

    public int getSatellites() {
        return satellites;
    }

    public void setSatellites(int satellites) {
        this.satellites = satellites;
    }

    public BigDecimal getMass() {
        return mass;
    }

    public void setMass(BigDecimal mass) {
        this.mass = mass;
    }
}

// Clasa SmallPlanet nu poate fi publica,doar una poate fi pubica
class SmallPlanet { //sa creat o alta clasa cu o singura proprietate
    private String planetName;  //ea poate fi folosita ca proprietate in clasa Star de mai sus dar si invers
}

