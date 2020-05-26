package com.csc3020.hw01.he7891;

public class Hw01Source {

    public static void main(String[] args) {

        // Calculator Engine
        System.out.println("");
        char op = 'd';
        float[] leftVals = {100.0f, 25.0f, 225.0f, 11.0f};
        float[] rightVals = {50.0f, 92.0f, 17.0f, 3.0f};

        for (int i = 0; i < rightVals.length; i++) {
            switch (op) {
                case 'a':
                    if (i == 0) {
                        System.out.print("ADDITION: ");
                    }
                    System.out.print(leftVals[i] + rightVals[i]);
                    if (i < rightVals.length - 1) {
                        System.out.print(", ");
                    }
                    break;
                case 's':
                    if (i == 0) {
                        System.out.print("SUBTRACTION: ");
                    }
                    System.out.print(leftVals[i] - rightVals[i]);
                    if (i < rightVals.length - 1) {
                        System.out.print(", ");
                    }
                    break;
                case 'd':
                    if (i == 0) {
                        System.out.print("DIVISION: ");
                    }
                    if (rightVals[i] != 0) {
                        System.out.print(leftVals[i] / rightVals[i]);
                    }
                    else {
                        System.out.println("DIVIDE BY 0 ERROR!");
                    }
                    if (i < rightVals.length - 1) {
                        System.out.print(", ");
                    }
                    break;
                case 'm':
                    if (i == 0) {
                        System.out.print("MULTIPLICATION: ");
                    }
                    System.out.print(leftVals[i] * rightVals[i]);
                    if (i < rightVals.length - 1) {
                        System.out.print(", ");
                    }
                    break;

                default:
                    System.out.println("Incorrect or no operation set.");
            }
        }
    }
}
