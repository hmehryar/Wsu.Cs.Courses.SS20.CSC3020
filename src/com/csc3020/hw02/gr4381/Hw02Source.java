package com.csc3020.hw02.gr4381;
//
// Author: Matthew Martin
// Date: 2020-05-28
// Homework 02
//
public class Hw02Source {
    public static void main(String[] args){
        double array1[] = {22.5, -6.0, 15.4, 83.3};
        double array2[] = {0.8, 104.7, 24.0, 8.8};
        char operations[] = {'a', 's', 'm', 'd'};

        MathEquation[] mathEquationsArray = new MathEquation[array1.length];

        for (int index = 0; index < array1.length; index++) { // loop to create an object for every element in operand arrays
            mathEquationsArray[index] = create(array1[index], array2[index], 'a');
        }

        System.out.println("Array 1:");
        for (double value:array1) { // loop to print the elements of array 1
            System.out.print(value);
            System.out.print('\t');
        }
        System.out.println(); // end the line after printing array 1

        System.out.println("Array 2:");
        for (double value:array2) { // loop to print the elements of array 2
            System.out.print(value);
            System.out.print('\t');
        }
        System.out.println();

        for(char op:operations){ // loop to find and print the results of each operation in the operator array
            System.out.println("Results for operation \'" + op + "\':");
            for (MathEquation eq:mathEquationsArray) { // loop to pass the operator to every object in the MathEquations array
                eq.execute(op);
                System.out.print(eq.getResult());
                System.out.print('\t');
            }
        System.out.println();
        }


    }
    public static MathEquation create(double lh, double rh, char op){
        MathEquation oMathEquation = new MathEquation(lh, rh, op);
        return oMathEquation;
    }

}
