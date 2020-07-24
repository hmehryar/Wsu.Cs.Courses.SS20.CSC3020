package csc3020.hw03.he7891;
/*
 * Author: Nathan Tattrie
 * Student ID: he7891
 * Homework Assignment 03
 * Hw03Source.java
 * */

public class Hw03Source {
    /*
    * 3. Instead of using create method, you shall use the MathEquation class constructor to
    *    instantiate the objects in the main method.
    * 4. Instead of using double arrays as inputs, you shall implement 4 operations, and
    *    show the results in the output as below:
    *    -Inputs:
    *       Division: 100, 50
    *       Addition: 25, 92
    *       Subtraction: 225, 17
    *       Multiplication: 11, 3
    * */

    public static void main(String[] args) {

        MathEquation divisionMathEquation = new MathEquation(100.0f, 50.0f, 'd');
        divisionMathEquation.execute(divisionMathEquation);

        MathEquation additionMathEquation = new MathEquation(25.0f, 92.0f, 'a');
        additionMathEquation.execute(additionMathEquation);

        MathEquation subtractionMathEquation = new MathEquation(225.0f, 17.0f, 's');
        subtractionMathEquation.execute(subtractionMathEquation);

        MathEquation multiplicationMathEquation = new MathEquation(11.0f, 3.0f, 'm');
        multiplicationMathEquation.execute(multiplicationMathEquation);

    }
}
