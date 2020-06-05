package com.csc3020.hw01.hc7391;
//Author: Bryan Vinson (HC7391)
//CSC 3020: HW01
//This program demonstrates if-else, array, for and while loop concepts to create a basic calculator
//NOTE: This program utilizes two print functions that demonstrate if-else and switch concepts
public class HW01Source {

    public static void main(String[] args)
    {

        //variable initialization
        double[] leftVals = {20, 40, 60};
        double[] rightVals = {2, 3, 7};
        char[] code = {'a', 's', 'm','d'};


        //Using for loop to print intial array values
        System.out.println("Printing initial values:");
        System.out.print("Left Values = ");

        for(int i = 0; i < leftVals.length; i++)
        {
            System.out.print(leftVals[i] + " ");
        }

        System.out.println();
        System.out.print("Right Values = ");

        for(int i = 0; i < leftVals.length; i++)
        {
            System.out.print(rightVals[i] + " ");
        }

       /*This example contains a for loop that iterates through the char array. The char value
       is passed to a function containing an if-else chain that will evaluate the char value
       and perform the appropriate calculation.
      */
        System.out.println("\n");
        System.out.print("Printing out result using for loop:");

        for(int i = 0; i < code.length; i++)
        {

            printResult(code[i],leftVals,rightVals);

        }// end for loop


        /*This example contains a while loop that iterates through the char array. The char value
       is passed to a function containing a switch statement that will evaluate the char value
       and perform the appropriate calculation.*/
        System.out.println("\n");
        System.out.print("Now printing same result using a while loop:");

        int counter = 0;
        while (counter < code.length)
        {

            printResult2(code[counter],leftVals,rightVals);
            counter++;

        } //end while loop

    }

    //This function uses if-else chain to evaluate the char value and perform the appropriate calculation
    public static void printResult(char cValue, double[] x, double[] y)
    {
        int arraySize = 3;
        System.out.println();
        double result = 0;

        if(cValue == 'a')
        {
            System.out.print("Addition Result = ");
            for(int j = 0; j < arraySize; j++)
            {
                result = x[j] + y[j];
                System.out.print(result + " ");
            }
        }else if (cValue == 's')
        {
            System.out.print("Subtraction Result = ");
            for (int j = 0; j < arraySize; j++)
            {
                result = x[j] - y[j];
                System.out.print(result + " ");
            }
        }else if (cValue == 'm')
        {
            System.out.print("Multiplication Result = ");
            for (int j = 0; j < arraySize; j++)
            {
                result = x[j] * y[j];
                System.out.print(result + " ");
            }
        }else if (cValue == 'd')
        {
            System.out.print("Division Result = ");
            for (int j = 0; j < arraySize; j++) {
                result = x[j] / y[j];
                System.out.print(result + " ");
            }
        }else
        {
            System.out.println("Error");
        }
    }


    //This function uses a switch statement to evaluate the char code to perform the appropriate calculation
    public static void printResult2(char cValue, double[] x, double[] y)
    {
        int arraySize = 3;
        System.out.println();
        double result = 0;

        switch(cValue)
        {
            case 'a':
                System.out.print("Addition Result = ");
                for(int j = 0; j < arraySize; j++)
                {
                    result = x[j] + y[j];
                    System.out.print(result + " ");
                }
                break;
            case 's':
                System.out.print("Subtraction Result = ");
                for(int j = 0; j < arraySize; j++)
                {
                    result = x[j] - y[j];
                    System.out.print(result + " ");
                }
                break;
            case 'm':
                System.out.print("Multiplication Result = ");
                for(int j = 0; j < arraySize; j++)
                {
                    result = x[j] * y[j];
                    System.out.print(result + " ");
                }
                break;
            case 'd':
                System.out.print("Division Result = ");
                for(int j = 0; j < arraySize; j++)
                {
                    result = x[j] / y[j];
                    System.out.print(result + " ");
                }
                break;
            default:
                System.out.println("Error");
                break;

        }//end switch
    }
}
