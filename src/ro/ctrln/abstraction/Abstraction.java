package ro.ctrln.abstraction;

public class Abstraction {
    public static void main(String[] args) {

        // clasele abstracte nu pot fi instantiate ,ele trebuie mai intai mostente in clasele copil si dupa aceea sa folosim clasele copil
        //Trooper trooper = new Trooper(); fals
        StormTrooper stormTrooper = new StormTrooper();
        System.out.println(stormTrooper.warCry());
        stormTrooper.fight(" de toate");
    }
}
