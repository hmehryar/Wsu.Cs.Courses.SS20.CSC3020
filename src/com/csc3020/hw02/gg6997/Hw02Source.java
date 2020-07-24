package csc3020.hw02.gg6997;

/**
 * Calculator Engine v3
 * Author: Manraj Singh
 * Email: manrajsingh@wayne.edu
 * Date: 5/29/2020
 * Description: Create a calculator engine utilizing classes and methods
 * */

public class Hw02Source {
    public static void main(String[] args) {
        //re-declare value arrays just to output them in a method (taken from 1st hw)
        double leftVals[] = {150.0, 75.5, 37.5, 421.3};
        double rightVals[] = {120.0, 120.2, 65.3, 200.8};

        //Output the array values of the left array
        System.out.print("Left Values=  ");
        for (int index = 0; index < 4; index++) {
            System.out.print(leftVals[index] + ", ");
        }
        System.out.println();

        //Output the array values of the right array
        System.out.print("Right Values= ");
        for (int index = 0; index < 4; index++) {
            System.out.print(rightVals[index] + ", ");
        }
        System.out.println();

        //declare math equation method as an array of 4 values to compute operations
        MathEquation calculate[]=new MathEquation[4];

        //positions 0-4 in the array are computed here and read by the other class
        calculate[0] = new MathEquation('+');
        calculate[1] = new MathEquation('-');
        calculate[2] = new MathEquation('/');
        calculate[3] = new MathEquation('*');

        //for loop goes through each instance above and performs what is in the execute method
        for(int j = 0;j < calculate.length; j++) {
            calculate[j].execute();
        }
    }
}
