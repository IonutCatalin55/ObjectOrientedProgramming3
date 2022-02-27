package ro.ctrln.misc;

import ro.ctrln.inheritance.FalconHeavy;

public class OverloadingUsage {
    public static void main(String[] args) {

        FalconHeavy falconHeavy = new FalconHeavy();
        falconHeavy.escapeProcedure(5);
        System.out.println("===========================");
        System.out.println(falconHeavy.escapeProcedure(true));
        System.out.println("===========================");
        falconHeavy.escapeProcedure(4,true);
        System.out.println("===========================");
        falconHeavy.escapeProcedure(2,false);
        System.out.println("===========================");
        falconHeavy.escapeProcedure();
        falconHeavy.escapeProcedure(true, false, true, true);  //
    }
}
