package com.csc3020.hw02.go3480;

public class MathEquation {
    public double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
    public double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
    public char opCode;
    public double[] results = new double[4];

    public MathEquation(char opCode) {
        this.opCode = opCode;
    }

    public void execute() {
    // switch syntax
    switch (opCode) {
        case 'a':
            System.out.print("\nAddition Result=");
            for (int j = 0; j < leftVals.length; j++) {
                results[j] = leftVals[j] + rightVals[j];
            }
            break;
        case 's':
            System.out.print("\nSubtraction Result=");
            for (int j = 0; j < leftVals.length; j++) {
                results[j] = leftVals[j] - rightVals[j];
            }
            break;
        case 'd':
            System.out.print("\nDivision Result=");
            for (int j = 0; j < leftVals.length; j++) {
                results[j] = leftVals[j] / rightVals[j];
            }
            break;
        case 'm':
            System.out.print("\nMultiplication Result=");
            for (int j = 0; j < leftVals.length; j++) {
                results[j] = leftVals[j] * rightVals[j];
            }
            break;
        default:
            System.out.println("Invalid input!");
            break;
     }
    }
}
