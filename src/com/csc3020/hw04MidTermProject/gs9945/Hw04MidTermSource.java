package com.csc3020.hw04MidTermProject.gs9945;

public class Hw04MidTermSource {

    public static void main(String[] args) {

        System.out.println("Using Overloads:");
        MathEquation newObj = new MathEquation('/');

        newObj.execute(9.0,4.0);
        newObj.execute(9,4);

        ////////////////////////////////////////////////////////////////////////////
        System.out.println("");
        System.out.println("Using Inheritance:");


        CalculateBase[] calculators = new CalculateBase[4];

        calculators[0] = new Divider(100,50);
        calculators[1] = new Adder(25,92);
        calculators[2] = new Subtractor(225,17);
        calculators[3] = new Multiplier(11,3);

        for (int i = 0; i < calculators.length; i++) {
            calculators[i].calculate();
            System.out.println("Result: " + calculators[i].getResult());
        }



    }

}
