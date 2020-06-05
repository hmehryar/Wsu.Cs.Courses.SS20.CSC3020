package com.csc3020.hw01.go3480;

public class Hw01Source {
    public static void main(String[] args) {
        //array
        double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
        double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
        char[] opCode = {'a', 's', 'd', 'm'};
        double[] results = new double[4];

        // for-loop
        System.out.print("LeftVals=");
        for (double val : leftVals) {
            System.out.print(val + "\t");
        }

        System.out.print("\nRightVals=");
        for (double val : rightVals) {
            System.out.print(val + "\t");
        }

        // for-loop
        for (int i = 0; i < opCode.length; i++) {
            // switch syntax
            switch (opCode[i]) {
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
            for (double result : results) {
                System.out.print(result+"\t");
            }
        }
    }
}
