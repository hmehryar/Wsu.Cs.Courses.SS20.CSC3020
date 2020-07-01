package csc3020.hw04MidTermProject.go3480;

public class Hw04MidTermSource {
    public static void main(String[] args) {
        MathEquation oMathEquation = new MathEquation('d');
        oMathEquation.execute(9.0d,4.0d);

        MathEquation oMathEquation2 = new MathEquation('d');
        oMathEquation2.execute(9,4);

        System.out.println("Using Overloads\n");
        System.out.println("result="+oMathEquation.getResult());
        System.out.println("result="+oMathEquation2.getResult());

        CalculateBase[] calculators = {
                new Divider(100, 50),
                new Adder(25, 92),
                new Subtractor(225, 17),
                new Multiplier(11, 3)
        };

        System.out.println("\nUsing Inheritance\n");
        for (CalculateBase calculator : calculators) {
            calculator.calculate();
            System.out.println("result="+calculator.getResult());
        }
    }
}
