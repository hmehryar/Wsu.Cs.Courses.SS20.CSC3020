package csc3020.hw02.gp7633;

public class hw02Source {
    public static void main(String[] args) {
        double leftVals[] = {3.8d, 5.94d ,9.3d ,10.01d};
        double rightVals[] = {2.94d, 11.4d, 8.0d, 5.19d};
        char operator[] = {'+', '-', '*', '/'};

        // Print out arrays
        System.out.print("Left Values: ");
        for (int i = 0; i < leftVals.length; i++) {
            System.out.print(leftVals[i] + "    ");
        }
        System.out.println(" ");
        System.out.print("Right Values: ");
        for (int i = 0; i < rightVals.length; i++) {
            System.out.print(rightVals[i] + "    ");

        }
        MathEquation addition = new MathEquation(leftVals, rightVals, '+');
        addition.execute();

        MathEquation subtraction = new MathEquation(leftVals, rightVals, '-');
        subtraction.execute();

        MathEquation multiplication = new MathEquation(leftVals, rightVals, '*');
        multiplication.execute();

        MathEquation division = new MathEquation(leftVals, rightVals, '/');
        division.execute();
    }
}
