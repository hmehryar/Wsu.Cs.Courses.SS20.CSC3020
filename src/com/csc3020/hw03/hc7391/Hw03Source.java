package com.csc3020.hw03.hc7391;
//CSC 3020 Homework 3
//Author: Bryan Vinson ID: hc7391
//This program demonstrates knowledge of getters, setters, chaining and constructors to create objects,
//initalize object values and perform operations and print the results.
public class Hw03Source {
    public static void main(String[] args)
    {


//Example 1: Constructor that initializes the left and right values
       MathEquation add = new MathEquation(25.0, 92.0);
       MathEquation subtract = new MathEquation(225.0,17.0);
       MathEquation multiply = new MathEquation(11.0,3.0);

//Example 2: Using setters to initialize values
       MathEquation divide = new MathEquation();
       divide.setOpCode('d');
       divide.setLeftValue(100.0);
       divide.setRightValue(50.0);

//Example 3: Constructor that can initialize opCode, left and right values
// (see MathEquation class for how chaining is utilized)
        add = new MathEquation ('a', 25.0, 92.0);
        subtract = new MathEquation('s',225.0, 17.0);
        multiply = new MathEquation('m',11.0,3.0);
        divide = new MathEquation('d',100.0, 50.0);

//Storing objects in array. Then we can use a loop to execute operations and print results
        int arraySize = 4; //avoid magic numbers
        MathEquation[] array = new MathEquation[arraySize];
        array[0] = add;
        array[1] = subtract;
        array[2] = multiply;
        array[3] = divide;

//Using a for loop to call the execute() and print the results
//NOTE: Examples of getters are used to obtain opCode and print results (see methods below)

        for (int i = 0; i < array.length ; i++)
        {
            array[i].execute();
            printHeader(array, i);
            printResult(array, i);
        }



    }// end public main

//Methods: Since we have studied methods, I thought it would be appropriate remove code from main an
//and place into two methods that print the output. By passing values into these methods, only one loop
//in needed in main.

//This method takes in a MathEquation array and an integer to evaluate the opCode and print
//the appropriate header
    public static void printHeader(MathEquation[] array, int counter)
    {
        switch(array[counter].getOpCode())
        {
            case 'a':
                System.out.print("Addition Result: ");
                break;
            case 's':
                System.out.print("Subtraction Result: ");
                break;
            case 'm':
                System.out.print("Multiplication Result: ");
                break;

            case 'd':
                System.out.print("Division Result: ");
                break;
        }
    }

 // Getter Example: This method takes in a MathEquation array and integer value to evaluate the opCode
//at the given array index and print out the result of the operation using a getter.
    public static void printResult(MathEquation[] array, int counter)
    {
        switch(array[counter].getOpCode())
        {
            case 'a':
                System.out.print(array[counter].getResult());
                break;
            case 's':
                System.out.print(array[counter].getResult());
                break;
            case 'm':
                System.out.print(array[counter].getResult());
                break;

            case 'd':
                System.out.print(array[counter].getResult());
                break;
        }

        System.out.println();
    }

}
