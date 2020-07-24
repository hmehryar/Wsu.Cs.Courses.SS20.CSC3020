package csc3020.hw04MidTermProject.he7891;
/*
 * Author: Nathan Tattrie
 * Student ID: he7891
 * Homework Assignment 04
 * Hw04MidTermSource.java
 * */

// Overload Item Step 4
public class Hw04MidTermSource {

    public static void main(String[] args) {

        // Using Overloads
        System.out.println("Using Overloads");

        // Overload Item Step 5
        double doubleResult = 0;
        MathEquation oMathEquationDouble = new MathEquation(9.0d, 4.0d, 'd');
        oMathEquationDouble.execute(
                oMathEquationDouble.getLeftValDouble(),
                oMathEquationDouble.getRightValDouble());

        // Overload Item Step 6
        MathEquation oMathEquationInt = new MathEquation(9, 4, 'd');
        oMathEquationInt.execute(
                (int)oMathEquationInt.getLeftValInt(),
                (int)oMathEquationInt.getRightValInt());

        System.out.println();


        // Using Inheritance
        System.out.println("Using Inheritance");

        // Inheritance Item Step 8
        Divider oDivider = new Divider();
        Adder oAdder = new Adder();
        Subtractor oSubtractor = new Subtractor();
        Multiplier oMultiplier = new Multiplier();

        CalculateBase calculators[] = {oDivider, oAdder, oSubtractor, oMultiplier};

        calculators[0].calculate(100d, 50d);
        System.out.println(oDivider.getResult());
        calculators[1].calculate(25d, 92d);
        System.out.println(oAdder.getResult());
        calculators[2].calculate(225d, 17d);
        System.out.println(oSubtractor.getResult());
        calculators[3].calculate(11d, 3d);
        System.out.println(oMultiplier.getResult());

    }
}
