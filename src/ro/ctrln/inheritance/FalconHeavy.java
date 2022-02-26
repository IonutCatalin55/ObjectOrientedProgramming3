package ro.ctrln.inheritance;

public class FalconHeavy extends Battleship implements Starship, Rocket{

    private String destination;


    @Override
    public void warp() {
        System.out.println("FalconHeavy is not in warp speed");
    }

    @Override
    public void setStarshipDestination(String destination) {
        this.destination = getBattleshipName() + "ghoes to" + destination;
    }

    @Override
    public double computewarpSpeed(int warpSpeed, int lightYearsToDstination) {
        return 0;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDestination() {
        return this.destination;
    }

    @Override
    public String toString() {
        return "FalconHeavy{" +
                "destination='" + destination + '\'' +
                " battleshipName " + getBattleshipName() +
                " battleshipcCapacity " + getBattleshipCapacity() +
                '}';
    }

    @Override
    public void launchCountdown() {
        for (int i = 10; i >= 0 ; i--) {

            System.out.println("Launch sequence : " + i);
        }
    }

}
