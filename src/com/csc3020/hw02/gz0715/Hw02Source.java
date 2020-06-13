package com.csc3020.hw02.gz0715;

public class Hw02Source {
    public static void main(String[] args) {
        // Variables
        int size = 4, count = 0;
        float[] left = {100.0f, 25.0f, 225.0f, 11.0f};
        float[] right = {50.0f, 92.0f, 17.0f, 3.0f};
        char[] opCodes = {'a', 's', 'm', 'd'};
        double[] results = new double[size*4]; // size times number of operators
        MathEquation[] Equation;

        // Calculations & Storage
        for (int i = 0; i < size; i++) {
            Equation = new MathEquation[size];
            for (int j = 0; j < size; j++) {
                Equation[j] = create(left[j], right[j], opCodes[i]);
                results[count++] = Equation[j].execute();
            }
        }

        // Output left & right arrays
        System.out.print("Left:");
        for (float fVal : left) {
            System.out.print("\t" + fVal);
        }
        System.out.print("\nRight:");
        for (float fVal : right) {
            System.out.print("\t" + fVal);
        }

        // Output results
        count = 0;
        for (int i = 0; i < size; i++) {
            switch (opCodes[i]) {
                case 'a' -> System.out.print("\n\nAddition:");
                case 's' -> System.out.print("\nSubtraction:");
                case 'm' -> System.out.print("\nMultiplication:");
                case 'd' -> System.out.print("\nDivision:");
                default -> System.out.print("ERROR: something is wrong!");
            }
            for (int j = 0; j < size; j++) {
                System.out.print("\t" + results[count++]);
            }
        }
    }

    public static MathEquation create(float left, float right, char opCode) {
        return new MathEquation(left, right, opCode);
    }
}
