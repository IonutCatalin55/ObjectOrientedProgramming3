package ro.ctrln.inheritance;

import java.util.Random;

public interface Starship {

    // putem defini constante ===> variabile de instanta da nu de clasa
    public  int FIRST_INT = 1;

    static int SECOND_INT = 2;         // =========> public,static,final sunt implicite in interfete

    static final int THIRD_INT = 3;

    void warp(); //moduri de declarare
    void  setStarshipDestination(String destination); //nu returnaza  nimic                <<=============NU AVEM VOIE SA SCRIEM IMPLEMENTAREA ADICA===> {}
    double computewarpSpeed(int warpSpeed,int lightYearsToDstination);//returneaza un rezultat double
    default int productionId(){ // default metoda inplicita care ne permute sa returnam ceva
        Random r = new Random();
        return FIRST_INT *(SECOND_INT - THIRD_INT ) * r.nextInt();                                            //  <<========aici avem voie inplementare pt ca le am declarat default
                                                    //  <<======== va fi static si final in toate clasele unde v om inplementa interfata
    }


}
