package csc3020.hw04MidTermProject;

public class Hw04MidTermSource {
    public static void main(String[] args) {

        //Overload Code
        MathEquation doubleEquationOp = new MathEquation('d');
        doubleEquationOp.execute(9.0d, 4.0d);

        MathEquation intEquationOp = new MathEquation('d');
        intEquationOp.execute(9,4);

        System.out.println("Using Overloads" + "\n");
        System.out.println("Result= " + doubleEquationOp.getDoubleResults());
        System.out.println("Result= " + intEquationOp.getIntResults());


        //Inheritance Code
        System.out.println("\n" + "Using Inheritance" + "\n");

        CalculateBase[] calculators = new CalculateBase[4];
        calculators[0] = new Divider(100,50);
        calculators[0].calculate();

        calculators[1] = new Adder(25,92);
        calculators[1].calculate();

        calculators[2] = new Subtractor(225, 17);
        calculators[2].calculate();

        calculators[3] = new Multiplier(11,3);
        calculators[3].calculate();

    }
}
