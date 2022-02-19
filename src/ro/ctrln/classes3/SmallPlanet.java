package ro.ctrln.classes3;


// Clasa SmallPlanet nu poate fi publica,doar una poate fi pubica
    class SmallPlanet { //sa creat o alta clasa cu o singura proprietate
        private String planetName;  //ea poate fi folosita ca proprietate in clasa Star de mai sus dar si invers

        public SmallPlanet(){
        }

        public void setPlanetName(String planetName) {
            this.planetName = planetName;
        }

        public String getPlanetName() {
            return this.planetName;
        }


        //DECLARAREA UNEI METODE
        public String computeSmallPlanetLocation(Star3 smallPlanet, int location){
            return smallPlanet.getStarDescription() + this.getPlanetName() + location;                                                                             //<=== EXISTA ATATA TIMP CAT ESTE APELATA METODA COMPUTESMALLPLANETLOCATION
        }

    }
