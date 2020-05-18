package com.csc3020.hw01.gz0715;

public class Hw01Source {
    public static void main(String[] args) {
        float[] left = {100.0f, 25.0f, 225.0f, 11.0f};
        float[] right = {50.0f, 92.0f, 17.0f, 3.0f};
        double result;

        // Output array values
        System.out.print("Left:");
        for (float fVal : left) {
            System.out.print("\t" + fVal);
        }
        System.out.print("\nRight:");
        for (float fVal : right) {
            System.out.print("\t" + fVal);
        }

        for (int operator = 0; operator < 4; operator++) { // Operator is looped
            // outputs current operation
            switch (operator) {
                case 0 -> System.out.print("\n\nAddition:");
                case 1 -> System.out.print("\nSubtraction:");
                case 2 -> System.out.print("\nMultiplication:");
                case 3 -> System.out.print("\nDivision:");
                default -> System.out.print("ERROR: something is wrong!");
            }
            for (int index = 0; index < right.length; index++) { // indexes arrays
                // calculate per operator loop
                switch (operator) {
                    case 0 -> { // addition
                        result = left[index] + right[index];
                        System.out.print("\t" + result);
                    }
                    case 1 -> { // subtraction
                        result = left[index] - right[index];
                        System.out.print("\t" + result);
                    }
                    case 2 -> { // multiplication
                        result = left[index] * right[index];
                        System.out.print("\t" + result);
                    }
                    case 3 -> { // division
                        result = left[index] / right[index];
                        System.out.print("\t" + result);
                    }
                    default -> System.out.println("ERROR: something is wrong!");
                }
            }
        }
    }
}
