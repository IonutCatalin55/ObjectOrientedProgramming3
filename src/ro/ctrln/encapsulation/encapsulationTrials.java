package ro.ctrln.encapsulation;

    /*
    ===> Metodele publice dintr o superclasa(clasa parinte) trbuie declarate tot publice in subclase
    ===> Metodele protected intr o superclasa pot fi declarate fie public fie protected in subclase
    ===> Proprietatile declarate public sau protected intr o superclasa sunt mostenite in clasele copil
    ===> Metodele si prop[rietatile private nu sunt mostenite deloc
    ===> Clasele declarate finale nu pot fi mostenite
    ===> Clasele pot fi declarate private daca sunt declarate clase interioare
     */


import ro.ctrln.inheritance.FalconHeavy;

public class encapsulationTrials {
    public static void main(String[] args) {
        FalconHeavy falconHeavy = new FalconHeavy();
        falconHeavy.setBattleshipName("FalconHeavy Encapsulation");
        falconHeavy.escapeProcedure(4);

    }



}
