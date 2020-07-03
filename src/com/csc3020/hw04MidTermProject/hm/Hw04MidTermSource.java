package csc3020.hw04MidTermProject.hm;

public class Hw04MidTermSource {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Using Overloads");
        System.out.println();

        double leftDouble=9.0d;
        double rightDouble=4.0d;
        int leftInt=9;
        int rightInt=4;
        MathEquation equationOverload=new MathEquation('d');

        equationOverload.execute(leftDouble,rightDouble);
        System.out.print("result=");
        System.out.println(equationOverload.getResult());

        equationOverload.execute(leftInt,rightInt);
        System.out.print("result=");
        System.out.println(equationOverload.getResult());



        System.out.println();
        System.out.println("Using Inheritance");
        System.out.println();

        CalculateBase[] calculators={
                new Divider(100.0d,50.0d),
                new Adder(25.0d,92.0d),
                new Subtractor(225.0d,17.0d),
                new Multiplier(11.0d,3.0d)
        };

        for (CalculateBase calculator:calculators) {
            calculator.calculate();
            System.out.print("result = ");
            System.out.println(calculator.getResult());
        }

    }

}
