package csc3020.hw04MidTermProject.fy2906;

public class Hw04MidTermSource {
    public static void main(String[] args) {
        //using overloading
        System.out.println("Using Overloads");
        System.out.println();

        MathEquation test1 = new MathEquation('d');
        test1.execute(9d, 4d);
        System.out.println("Result = " + test1.getResult());

        MathEquation test2 = new MathEquation('d');
        test2.execute(9, 4);
        System.out.println("Result = " + test2.getResult());

        //using inheritance
        CalculateBase[] calculators = new CalculateBase[4];
        calculators[0] = new Divider(100d, 50d);
        calculators[1] = new Adder(25d, 92d);
        calculators[2] = new Subtractor(225d, 17d);
        calculators[3] = new Multiplier(11d, 3d);

        System.out.println();
        System.out.println("Using Inheritance");
        System.out.println();

        for (int i = 0; i < calculators.length; i++) {
            calculators[i].calculate();
            System.out.println("Result = " + calculators[i].getResult());
        }

    }
}
