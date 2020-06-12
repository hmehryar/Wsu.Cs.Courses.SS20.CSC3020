package com.csc3020.hw02.hc7391;
//CSC 3020
//Author: Bryan Vinson (ID: HC7391)
//This program further develops the calculator from HW01. The program utilizes an object that stores values
// and performs operations on those values. Additionally a method is used to create those objects.
public class hw02source {

    public static void main(String[] args)
    {
        //set array size to avoid magic numbers
        int mEquationArraySize = 4;
        int resultArraySize = 4;

        //initialize values
        double[] leftVals = {20,40, 60, 80};
        double[] rightVals = {2, 3, 7, 9};
        char[]opCode = {'a','s','m','d'};
        double[]result = new double[resultArraySize];

        MathEquation[] equationInstances = new MathEquation[mEquationArraySize];

//Printing original values similar to homework 1
        System.out.print("Left Values: ");
        for (int i = 0; i < leftVals.length ; i++)
        {
            System.out.print(leftVals[i]+" ");
        }
        System.out.println();

        System.out.print("Right Values: ");
        for (int i = 0; i < rightVals.length ; i++)
        {
            System.out.print(rightVals[i]+" ");
        }
        System.out.println("\n");

//Outer loop keeps track of the index for the opCode array. Inner loop uses create() function to create object
//and store into MathEquation array. Inner loop also calls the execute function and stores result into result array.
//Finally, in the outer loop, a print function prints a header and prints values stored in result array

        for (int opIndex = 0; opIndex < opCode.length ; opIndex++)
        {
            for (int j = 0; j < opCode.length; j++)
            {
                equationInstances[j] = create(leftVals[j], rightVals[j], opCode[opIndex]);
                result[j] = equationInstances[j].execute();
            }
            printResults(opCode[opIndex], result);
        }//end outer for loop

    }//end main


//This function creates an object of the MathEquation class. The function takes three parameters and passes
//values into the object's setters.
    public static  MathEquation create(double l, double r, char c)
    {
        MathEquation oMathEquation = new MathEquation();
        oMathEquation.setLeftVal(l);
        oMathEquation.setRightVal(r);
        oMathEquation.setOpCode(c);

        return oMathEquation;
    }
//This function takes in an opCode and the results array. A switch evaluates the opCode and prints the appropriate
//header. A for loop prints the values in the result array for that operation.
    public static void printResults(char opCode, double[] results)
    {
        switch(opCode)
        {
            case 'a':
                System.out.print("Addition Results: ");
                break;
            case 's':
                System.out.print("Subtraction Results: ");
                break;
            case 'm':
                System.out.print("Multiplication Results: ");
                break;
            case 'd':
                System.out.print("Division Results: ");
                break;
            default:
                System.out.println("Error Processing opCode ");
                break;
        }//end switch

        for (int i = 0; i < results.length ; i++)
        {
            System.out.print(results[i]+ " ");
        }

        System.out.println();
    }
}
