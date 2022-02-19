package ro.ctrln.classes3;

import java.util.Objects;

public class Planet {
    private  String planetName;
    private  int numberOfOceans;
    private double mass;
    private short numberOfMoons;

    public Planet(String planetName, int numberOfOceans, double mass, short numberOfMoons) {
        super();  // refera clasa parinte Object; TREBUIE SA FIE PE PRIMA LINIE A CONSTRUCTORULUI
        this.planetName = planetName;
        this.numberOfOceans = numberOfOceans;
        this.mass = mass;
        this.numberOfMoons = numberOfMoons;
    }
    public Planet() {
    }

    public String getPlanetName() {
        return planetName;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    public int getNumberOfOceans() {
        return numberOfOceans;
    }

    public void setNumberOfOceans(int numberOfOceans) {
        this.numberOfOceans = numberOfOceans;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public short getNumberOfMoons() {
        return numberOfMoons;
    }

    public void setNumberOfMoons(short numberOfMoons) {
        this.numberOfMoons = numberOfMoons;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Planet planet = (Planet) o;
        return numberOfOceans == planet.numberOfOceans && Double.compare(planet.mass, mass) == 0 && numberOfMoons == planet.numberOfMoons && planetName.equals(planet.planetName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(planetName, numberOfOceans, mass, numberOfMoons);
    }

    @Override
    public String toString() {
        return "Planet{" +
                "planetName='" + planetName + '\'' +
                ", numberOfOceans=" + numberOfOceans +
                ", mass=" + mass +
                ", numberOfMoons=" + numberOfMoons +
                '}';
    }
}
