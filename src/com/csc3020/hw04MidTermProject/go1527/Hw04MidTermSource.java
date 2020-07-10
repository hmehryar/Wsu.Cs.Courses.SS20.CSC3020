package csc3020.hw04MidTermProject.go1527;

public class Hw04MidTermSource {
    public static void main(String[] args) {

        //Overloading:
        //Printing Overloading
        System.out.println("Using Overloads\n");
        MathEquation oMathEquation1 = new MathEquation('d');
        oMathEquation1.execute(9.0, 4.0);
        MathEquation oMathEquation2 = new MathEquation('d');
        oMathEquation2.execute(9, 4);

        //Inheritance:
        //Array of CalculateBase
        CalculateBase calculators[];
        calculators = new CalculateBase[4];

        //Initiating constructors and calling methods
        calculators[0] = new Divider(100, 50);
        double division = calculators[0].calculate();

        calculators[1] = new Adder(25, 92);
        double addition = calculators[1].calculate();

        calculators[2] = new Subtractor(225, 17);
        double subtraction = calculators[2].calculate();

        calculators[3] = new Multiplier(11, 3);
        double multiplication = calculators[3].calculate();

        //Printing Inheritance
        System.out.println("\nUsing Inheritance\n");
        System.out.println("result=" + division);
        System.out.println("result=" + addition);
        System.out.println("result=" + subtraction);
        System.out.println("result=" + multiplication);

    }
}
