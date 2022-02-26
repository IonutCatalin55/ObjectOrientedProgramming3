package ro.ctrln.polymorphism;

import ro.ctrln.inheritance.Starship;

public class StarPort {

    private Starship starship; //proprietate

    public Starship getStarship() {
        return this.starship;
    }

    public void setStarship(Starship starship) {
        this.starship = starship;
    }

    public void flyToSpace(){ //Metoda
        starship.warp();
    }

    @Override
    public String toString() {
        return "StarPort{" +
                "starship=" + starship +
                '}';
    }
}
