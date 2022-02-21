package ro.ctrln;

import java.util.Random;

public interface Starship {

    void warp(); //moduri de declarare
    void  setStarshipDestination(String destination); //nu returnaza mnimic                <<=============NU AVEM VOIE SA SCRIEM IMPLEMENTAREA ADICA===> {}
    double computewarpSpeed(int warpSpeed,int lightYearsToDstination); //returneaza un rezultat double
    default int productionId(){
        Random r = new Random();
        return 4 * r.nextInt();                                            //  <<========aici avem voie inplementare pt ca le am declarat default
                                                    //  <<======== va fi static si final in toate clasele unde v om inplementa interfata
    }


}
