package ro.ctrln;

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
        System.out.println("Velocity is " + xWingStarfighter.computewarpSpeed(3,1000));
        System.out.println(xWingStarfighter);




    }

}
