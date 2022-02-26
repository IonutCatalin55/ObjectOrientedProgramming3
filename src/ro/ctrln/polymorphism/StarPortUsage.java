package ro.ctrln.polymorphism;

import ro.ctrln.inheritance.*;

public class StarPortUsage {

    public static void main(String[] args) {
        FalconHeavy falconHeavy =new FalconHeavy();
        falconHeavy.setBattleshipName("FalconHeavy");
        TieFighter tieFighter = new TieFighter();
        tieFighter.setStarshipDestination("Pluto");
        XWingStarfighter xWingStarfighter = new XWingStarfighter();
        xWingStarfighter.setStarshipDestination("Planeta Marte");


        StarPort starPort = new StarPort();

        falconHeavy.setDestination("Mercur");
        starPort.setStarship(falconHeavy);
        starPort.flyToSpace();
        System.out.println(starPort);

        starPort.setStarship(xWingStarfighter);
        starPort.flyToSpace();
        System.out.println(starPort);

        starPort.setStarship(tieFighter);
        starPort.flyToSpace();
        System.out.println(starPort);

        //DEFINIREA OBIECTELOR DE TIPUL STARSHIP (ACEST OBIECT ESTE O INTERFATA SI NU POATE FI INSTANTIAT DIRECT)
        // NE FOLOSIM DE CLASELE CARE IMPLEMENTEAZA ACEASTA INTERFATA
        Starship starshipOne = new FalconHeavy();
        //avem referinta clasei parinte Starship dar folosim constructorul clasei copil FalconHeavy
        // (clasa care implementeaza sau mosteneste respectiva interfata)

        Starship starshipTwo = new XWingStarfighter();
        Starship starshipThree = new TieFighter();

        //Starship starshipFour = new Battleship(); ===> ierarhi de clase diferite,incompatibile care nu se intalnesc

        Battleship battleshipOne = new FalconHeavy();
        Battleship battleshipTwo = new ImperialStarDestroyer();

        //starPort.setStarship(battleshipOne);
        // genereaza o eroare de compilare ==> pe metoda setStarship trebuie sa timitem
        // un obiect starship si nu battleship

       //FalconHeavy falconHeavy1 = new Battleship();// eroare decompilare castul se poate face doar de la un obiect parinte
        // la unul copil si nu invers

        starPort.setStarship(starshipOne);
        starPort.flyToSpace();
        starPort.setStarship(starshipTwo);
        starPort.flyToSpace();
        starPort.setStarship(starshipThree);
        starPort.flyToSpace();


    }
}
