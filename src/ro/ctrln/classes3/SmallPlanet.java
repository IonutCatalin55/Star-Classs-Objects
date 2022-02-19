package ro.ctrln.classes3;


import java.util.Objects;

// Clasa SmallPlanet nu poate fi publica,doar una poate fi pubica
    public class SmallPlanet { //sa creat o alta clasa cu o singura proprietate
        private String planetName;  //ea poate fi folosita ca proprietate in clasa Star de mai sus dar si invers

        public SmallPlanet(String planetName){
            this.planetName = planetName;
        }
        public SmallPlanet(){

        }

        public void setPlanetName(String planetName) {
            this.planetName = planetName;
        }

        public String getPlanetName() {
            return this.planetName;
        }

    @Override
    public String toString() {
        return "SmallPlanet{" +
                "planetName='" + planetName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmallPlanet that = (SmallPlanet) o;
        return planetName.equals(that.planetName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(planetName);
    }

    //DECLARAREA UNEI METODE
        public String computeSmallPlanetLocation(Star3 smallPlanet, int location){
            return smallPlanet.getStarDescription() + this.getPlanetName() + location;                                                                             //<=== EXISTA ATATA TIMP CAT ESTE APELATA METODA COMPUTESMALLPLANETLOCATION
        }

    }
