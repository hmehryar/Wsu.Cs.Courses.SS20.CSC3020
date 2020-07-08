package com.csc3020.hw04MidTermProject.gl1193;

public class Hw04MidTermSource {

    public static void main(String[] args) {
        //part1
        MathEquation calculate = new MathEquation();
        calculate.execute(9d, 4d, 'd');

        MathEquation calculate1 = new MathEquation();
        calculate1.execute(9,4,'d');

//        MathEquation calculate2 = new MathEquation(9,4,'d');
//        calculate2.execute();
//
//        MathEquation calculate3 = new MathEquation(9,4,'d');
//        calculate3.execute();



        //part2
        CalculateBase calculators[];
        calculators = new CalculateBase[4];

        //Initialize the array
        calculators[0] = new Divider(100, 50);
        double division = calculators[0].calculate();

        calculators[1] = new Adder(25, 92);
        double addition = calculators[1].calculate();

        calculators[2] = new Subtractor(225, 17);
        double subtraction = calculators[2].calculate();

        calculators[3] = new Multiplier(11, 3);
        double multiplication = calculators[3].calculate();

        System.out.println("Using Inheritance");
        System.out.println("result: "+division);
        System.out.println("result: "+addition);
        System.out.println("result: "+subtraction);
        System.out.println("result: "+multiplication);


    }
}
