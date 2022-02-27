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

    @Override // ADNOTARE ===> MARCAM FAPTUL CA ACEAST METODA ESTE SUPRASCRISA
    public void launchCountdown() {
        for (int i = 10; i >= 0 ; i--) {

            System.out.println("Launch sequence : " + i);
        }
    }
// aceasta metoda este mostenita din clasa parinte Battleship si este suprascrisa
    @Override
public void escapeProcedure(int escapePods){
        super.escapeProcedure(escapePods);
        System.out.println("We are in FalconHeavy now!");
        System.out.println("Escape procedure initiated in Falcon Heavy class with " + escapePods + " escap epods");
    }

    public String escapeProcedure(boolean activated) {
        return activated ? "Escape procedure initiated" : "Escape procedure abort";
    }

    public void escapeProcedure(int escapePods, boolean activated) {
        escapeProcedure(activated);
        if(activated){
            escapeProcedure(escapePods);
        }
    }

    // VarArgs == variable arguments ===> " ... "(asa se scrie in rubrica unde introducem parametri)
    // Transmitem un nr variabil de parametri metodei noastre
    public void escapeProcedure(boolean ... activated){
        for (boolean active : activated){
            System.out.println("Activation sequence " + active);
        }

    }

    public void escapeProcedure(){
        System.out.println("Whaiting for the escape procedure ");
    }
}
