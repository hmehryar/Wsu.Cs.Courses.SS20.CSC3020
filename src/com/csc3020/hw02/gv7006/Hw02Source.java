package com.csc3020.hw02.gv7006;

public class Hw02Source {
    public static void main(String[] args) {
        double[] lVals = { 100, 25, 225, 11 };
        double[] rVals = { 50, 92, 17, 3 };
        char[] opCodes = { '+', '-', '*', '/' };
        double[][] results = new double[4][4];

        MathEquation[][] mathEqs = new MathEquation[4][4];

        System.out.println("Left Values:");
        for (double lVal : lVals) {
            System.out.printf("%f\t", lVal);
        }
        System.out.println();

        System.out.println("Right Values:");
        for (double rVal : rVals) {
            System.out.printf("%f\t", rVal);
        }
        System.out.println();

        for (int i = 0; i < opCodes.length; i++) {
            switch (opCodes[i]) {
                case '+':
                    System.out.println("Addition:\t");
                    break;
                case '-':
                    System.out.println("Subtraction:\t");
                    break;
                case '*':
                    System.out.println("Multiplication:\t");
                    break;
                case '/':
                    System.out.println("Division:\t");
            }

            for (int j = 0; j < lVals.length; j++) {
                mathEqs[i][j] = create(lVals[j], rVals[j], opCodes[i]);
                results[i][j] = mathEqs[i][j].execute();

                if (Double.isNaN(results[i][j])) {
                    System.out.println("Undefined\t");
                } else {
                    System.out.printf("%f\t", results[i][j]);
                }
            }
            System.out.println();
        }
    }

    public static MathEquation create(double lVal, double rVal, char opCode) {
        return new MathEquation(lVal, rVal, opCode);
    }
}
