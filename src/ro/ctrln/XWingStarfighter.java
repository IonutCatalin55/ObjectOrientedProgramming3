package ro.ctrln;

public class XWingStarfighter implements Starship {

    private String destination;
    private  int lightYearsToDestination;

    // Trebuie sa scrie implementari pt toate metodele nondefault ale interfetei
    @Override
    public void warp() {
        System.out.println("XWingStarfighter este acum in viteza warp");
    }

    @Override
    public void setStarshipDestination(String destination) {

        switch (destination) {
            case "Base" :
                this.destination = "Tattoine";
                break;
            case  "Empire" :
                this.destination = "Coruscant";
                break;
            default :
                this.destination = "Unknown";
        }

    }

    @Override
    public double computewarpSpeed(int warpSpeed, int lightYearsToDstination) {
        this.lightYearsToDestination = lightYearsToDstination; // cand calculam o functie nu sunt de dorit efecte laterale ==>sa setat in interiorul metodei
        return Math.pow(warpSpeed,3) * Math.pow(10,8);
    }//avem eroare,ne obliga sa facem clasa abstracta sau sa implementam metodele Starship

    @Override
    public String toString() {
        return "XWingStarfighter{" +
                "destination='" + destination + '\'' +
                ", lightYearsToDestination=" + lightYearsToDestination +
                '}';
    }
}
