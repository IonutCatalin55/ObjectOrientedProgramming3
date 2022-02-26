package ro.ctrln.inheritance;

public class Inheritance {
    public static void main(String[] args) {

        Battleship battleship = new Battleship();
        battleship.setBattleshipCapacity(20000);
        battleship.setBattleshipName("Terran Battleship");

        System.out.println(battleship);

        ImperialStarDestroyer imperialStarDestroyer = new ImperialStarDestroyer();
        imperialStarDestroyer.setBattleshipName("Imperial Star Destroyer");
        imperialStarDestroyer.setBattleshipCapacity(30000);
        imperialStarDestroyer.setNumberoOfDecks(30);

        System.out.println(imperialStarDestroyer);

       // Starship starship = new Starship(); clasa abstracta   NU POATE FI INSTANTAIATA

        XWingStarfighter xWingStarfighter = new XWingStarfighter();
        xWingStarfighter.setStarshipDestination("Base");
        System.out.println("Velocity for XWingStarfighter is " + xWingStarfighter.computewarpSpeed(3,1000));
        xWingStarfighter.warp();
        System.out.println(xWingStarfighter);


        TieFighter tieFighter = new TieFighter();
        tieFighter.setStarshipDestination("Earth");
        System.out.println("velocity for tie is " + tieFighter.computewarpSpeed(3,2000));
        tieFighter.warp();
        System.out.println(tieFighter);

        FalconHeavy falconHeavy = new FalconHeavy();
        falconHeavy.setBattleshipName("FalconHeavy ");
        falconHeavy.setBattleshipCapacity(10);
        falconHeavy.setStarshipDestination(" Moon");
        System.out.println("Falconheavy is " + falconHeavy); //trebuie adaugate in metoda tostring parametri mosteniti pe care i vrem afisati

        falconHeavy.setStarshipDestination("Mars");
        System.out.println("Falconheavy is " + falconHeavy);

        falconHeavy.launchCountdown();





    }

}
