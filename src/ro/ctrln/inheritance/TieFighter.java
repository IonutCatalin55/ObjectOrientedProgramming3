package ro.ctrln.inheritance;

public class TieFighter implements Starship {
    private String destination;


    @Override
    public void warp() {
        System.out.println("TieFifgter is now in warp Speed");
    }

    @Override
    public void setStarshipDestination(String destination) {
        this.destination = destination;

    }

    @Override
    public double computewarpSpeed(int warpSpeed, int lightYearsToDstination) {
        return warpSpeed * 5 * Math.pow(10,8);
    }

    @Override
    public String toString() {
        return "TieFighter{" +
                "destination='" + destination + '\'' +
                '}';
    }
}
