package ro.ctrln.inheritance;

import ro.ctrln.util.ProjectUtils;

public class ConstantUsage {

    public static void main(String[] args) {
        System.out.println(Battleship.ID); // o folosim direct pentru ca este statica si finala si apartine clasei
        // si nu de fiecare obiect in parte
        ProjectUtils.printmesage(5); //se afiseaz cu metoda printMesage ID ul

        Battleship battleshipOne = new Battleship();
        Battleship battleshipTwo = new Battleship();
        System.out.println(battleshipOne.ID); //o putem folosi si prin referinta
        System.out.println(battleshipTwo.ID);
    }
}
