package com.csc3020.hw04MidTermProject.gg8219;

public class Hw04MidTermSource {
    public static void main(String[] args) {
        System.out.println("Using Overloads:");
        System.out.println();

        //Instantiate a MathEquation class
        //Use the execute method you developed in step 2
        MathEquation math = new MathEquation('d');
        math.execute(9.0, 4.0);
        math.execute(9, 4);

        //Define an array of CalculateBase class containing 4 element, and name it calculators
        CalculateBase calculators[];
        calculators = new CalculateBase[4];

        //Initialize the array with 4 different instantiation of classes
        calculators[0] = new Divider(100, 50);
        double division = calculators[0].calculate();

        calculators[1] = new Adder(25, 92);
        double addition = calculators[1].calculate();

        calculators[2] = new Subtractor(225, 17);
        double subtraction = calculators[2].calculate();

        calculators[3] = new Multiplier(11, 3);
        double multiplication = calculators[3].calculate();

        System.out.println("-------------------------------------");

        //Print the result of operations in output
        System.out.println("Using Inheritance:");
        System.out.println("\nresult=" + division);
        System.out.println("result=" + addition);
        System.out.println("result=" + subtraction);
        System.out.println("result=" + multiplication);
    }
}
