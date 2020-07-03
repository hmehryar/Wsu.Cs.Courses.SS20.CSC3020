package csc3020.hw04MidTermProject.gp7633;

public class Hw04MidTermSource {
    public static void main(String[] args) {

        // Using Overloads
        System.out.println("Using Overloads");
        System.out.println(" ");

        // First object of MathEquation (double)
        MathEquation oMathEquation1 = new MathEquation('d');
        oMathEquation1.Execute(9.0d,4.0d);
        System.out.println("result=" + oMathEquation1.result);

        // Second object of MathEquation (int)
        MathEquation oMathEquation2 = new MathEquation('d');
        oMathEquation2.Execute(9,4);
        System.out.println("result=" + oMathEquation2.result);

        // Define array
        CalculateBase[] oCalculateBase = new CalculateBase[4];

        // Divider
        oCalculateBase[0] = new Divider(100,50);
        oCalculateBase[0].calculate();

        // Adder
        oCalculateBase[1] = new Adder(25,92);
        oCalculateBase[1].calculate();

        // Subtractor
        oCalculateBase[2] = new Subtractor(225,17);
        oCalculateBase[2].calculate();

        // Multiplier
        oCalculateBase[3] = new Multiplier(11,3);
        oCalculateBase[3].calculate();

        // Using inheritance
        System.out.println(" ");
        System.out.println("Using Inheritance");
        System.out.println(" ");
        System.out.println("result=" + oCalculateBase[0].getResult());
        System.out.println("result=" + oCalculateBase[1].getResult());
        System.out.println("result=" + oCalculateBase[2].getResult());
        System.out.println("result=" + oCalculateBase[3].getResult());
    }
}
