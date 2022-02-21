package ro.ctrln;

public class ImperialStarDestroyer extends Battleship {

    private int numberoOfDecks;

    public void setNumberoOfDecks(int numberoOfDecks) {
        this.numberoOfDecks = numberoOfDecks;
    }

    public int getNumberoOfDecks(){
        return numberoOfDecks ;
    }

    @Override
    public String toString() {
        return "ImperialStarDestroyer{" +
                "numberoOfDecks=" + numberoOfDecks +
                " ,battleshipname: " + getBattleshipName() +
                " ,battleshipCapacity: " + getBattleshipCapacity() +
                '}';
    }
}
