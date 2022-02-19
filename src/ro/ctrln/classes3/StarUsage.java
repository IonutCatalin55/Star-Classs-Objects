package ro.ctrln.classes3;

import java.math.BigDecimal;

public class StarUsage {

    public static void main(String[] args) {
        //crearea unui obiect al clasei
        Star3 star3 = new Star3();// Numele clase(tipul de data folosit) + Numele variabilei =
        // =(primeste valoarea) new(cuvant cheie) + invocam costructorul clasei Star3
        //constructorul este cel implicit == CTRL + CLIC pe el si ne duce unde il avem definit

        //setam pe rand cele 5 proprietati ale obiectului star
        star3.setStarDescription("Aceasta este steaua Kepler ");
        star3.setDiametre(1000);
        star3.setSatellites(15);
        star3.setMass(new BigDecimal(2500)); //<=== parametri cu tipuri de date primitive se transmit prin valoare
        star3.setSmallPlanet(new SmallPlanet()); //<=== proprietatile care au tipuri de date clase sunt transmise prin referinta

        System.out.println(star3);// afiseaza ceva ce nu putem citi avem nevooe de met. toString

        // definirea de obiect cu constructorul star dar care primeste 4 parametri
        Star3 mars = new Star3("Aceasta este steaua Mars ", 4000, 6, new BigDecimal(400));

        //A 5 propietate a clase Star3 nu este definita in acest constructor
        // dar se pate defini in interiorul obiectului nostru Ex:
        mars.setSmallPlanet(new SmallPlanet());
        System.out.println(mars);

        SmallPlanet star3Planet = new SmallPlanet(); //obiect creat pt obiectul star3
        star3Planet.setPlanetName("Numele planetei din jurul stelei ");

        SmallPlanet marsPlanet = new SmallPlanet(); // obiect creat pt obiectul mars
        marsPlanet.setPlanetName("Numele planetei din jurul Marte ");

        star3.setSmallPlanet(star3Planet);
        mars.setSmallPlanet(marsPlanet);

        System.out.println(star3Planet.computeSmallPlanetLocation(star3, 20));
        System.out.println(marsPlanet.computeSmallPlanetLocation(mars, 30));


    }

}
