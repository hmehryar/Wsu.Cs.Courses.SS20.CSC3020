package com.csc3020.hw04MidTermProject.go5334;

class Hw04MidTermSource
{
    public static void main(String[] args)
    {
        MathEquation math = new MathEquation('d');
        math.execute(9.0, 4.0);
        math.execute(9, 4);

        CalculateBase calculators[];
        calculators = new CalculateBase[4];

        calculators[0] = new Divider(100, 50);

        double division = calculators[0].calculate();

        calculators[1] = new Adder(25, 92);

        double addition = calculators[1].calculate();

        calculators[2] = new Subtractor(225, 17);

        double subtraction = calculators[2].calculate();

        calculators[3] = new Multiplier(11, 3);

        double multiplication = calculators[3].calculate();


        System.out.println("\nUsing Inheritance");
        System.out.println("\nresult="+division);
        System.out.println("\nresult="+addition);
        System.out.println("\nresult="+subtraction);
        System.out.println("\nresult="+multiplication);


    }
}