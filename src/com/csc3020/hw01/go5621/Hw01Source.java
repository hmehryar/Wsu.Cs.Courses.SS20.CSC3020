package com.csc3020.hw01.go5621;
//*
// Author: Patricia Liu
// Homework 1
// */
public class Hw01Source {
    public static void main(String[] args) {
        float[] leftVals = {100.0f, 25.0f, 225.0f, 11.0f};
        float[] rightVals = {50.0f, 92.0f, 17.0f, 3.0f};
        float result;

        int size = leftVals.length;

        char[] opCode = {'a', 's', 'd', 'm'};

        //Print input values
        System.out.print("Left Values = ");
        for (int i = 0; i < size; i++) {
            System.out.print(leftVals[i]);
            System.out.print(" ");
        }
        System.out.print("\nRight Values = ");
        for (int i = 0; i < size; i++) {
            System.out.print(rightVals[i]);
            System.out.print(" ");
        }


        //Perform operations and print results
        for (char operator : opCode) {
            switch (operator){
                case 'a':
                    System.out.print("\nAddition Result = \t");
                    for (int i = 0; i < size; i++) {
                        System.out.print(leftVals[i] + rightVals[i]);
                        System.out.print(" ");
                    }
                    break;
                case 's':
                    System.out.print("\nSubtraction Result = \t");
                    for (int i = 0; i < size; i++) {
                        System.out.print(leftVals[i] - rightVals[i]);
                        System.out.print(" ");
                    }
                    break;
                case 'd':
                    System.out.print("\nDivision Result = \t");
                    for (int i = 0; i < size; i++) {
                        if (rightVals[i] != 0) {
                            System.out.print(leftVals[i] / rightVals[i]);
                        } else {
                            System.out.print("Undefined");
                        }
                        System.out.print(" ");
                    }
                    break;
                case 'm':
                    System.out.print("\nMultiplication Result = \t");
                    for (int i = 0; i < size; i++) {
                        System.out.print(leftVals[i] * rightVals[i]);
                        System.out.print(" ");
                    }
                    break;
                default:
                    System.out.println("Invalid Operation");
                    break;
            }
        }
    }
}
