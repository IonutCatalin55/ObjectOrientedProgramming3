package ro.ctrln.encapsulation;

public /*final*/ class Pod {    // Daca declaram Pod final nu mai poate fi mostenita in EscapePod

    private  class Plane{} // In tnteriorul clasei publice poate fi declarata o clasa privata
    private class FlyingMachine extends Plane{} // se pot mosteni clase interioare doar in interiorul clasei
  }

// default privat package acces modifier
//aici apare modificatorul de acces default === cand nu pun un modificator de acces
/*private*/ class TieFighterPod{ } // daca punem o clasa private in afara clasei public de mai sus avem eroare
