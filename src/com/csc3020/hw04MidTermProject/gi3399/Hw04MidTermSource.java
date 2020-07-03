package com.csc3020.hw04MidTermProject.gi3399;

public class Hw04MidTermSource {
    public static void main(String[] args) {
        MathEquation division1 = new MathEquation('d');
        MathEquation division2 = new MathEquation('d');

        //Overload
        System.out.println("Using Overloads");
        System.out.println();
        division1.execute(9.0, 4.0);
        division2.execute(9, 4);
        System.out.println();

        //Inheritance
        CalculateBase[] calculator = new CalculateBase[4];
        calculator[0] = new Divider(100, 50);
        calculator[1] = new Adder(25, 92);
        calculator[2] = new Subtractor(225, 17);
        calculator[3] = new Multiplier(11, 3);
        System.out.println("Using Inheritance");
        System.out.println();

        for (int i = 0; i < calculator.length; i++) {
            calculator[i].calculate();
        }
    }


}
