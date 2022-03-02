package ro.ctrln.abstraction;

import ro.ctrln.util.ProjectUtils;

public abstract class Trooper { //sa adaugat cuvantul cheie abstract

    private int numberOfCapabilities;

    public int getNumberOfCapabilities() {
        return this.numberOfCapabilities;
    }

    public void setNumberOfCapabilities(int numberOfCapabilities) {
        this.numberOfCapabilities = numberOfCapabilities;
    }

    public void fight(String enamy){
        // Aplicam metoda printmesage din projectUtil
        ProjectUtils.printMesage("Luptam ");
        System.out.println("Fighting the enamy" + enamy);
    }

    //  IN CLASE ABSTRACTE PUTEM SAU NU SA AVEM METODE ABSTRACTE
    public abstract String warCry();
}
