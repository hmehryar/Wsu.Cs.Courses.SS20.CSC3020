package com.csc3020.hw01.em0608;

/**
 * Calculator Homework Assignment
 * Author: Kelly Maisel
 * Email: em0608@wayne.com
 * */


public class HW01Source {
    public static void main(String[] args) {

        //Input:
        //double leftValue, rightValue
        //char character: v, a, s, d, m
        //Output: operation result

        //Input:
        double[] leftValue = {100.0, 25.0, 225.0, 11.0};
        double[] rightValue = {50.0, 92.0, 17.0, 3.0};
        char[] character = {'v', 'a', 's', 'd', 'm'};


        //Output
        //For-loop runs through each character in the array
        for(int i = 0; i < character.length; i++ ){
            switch (character[i]) {
                //Prints the left and right values
                case 'v':
                    System.out.print("LeftVals= ");
                    for (int index = 0; index < leftValue.length; index++) {
                        System.out.print(leftValue[index] + " ");
                    }
                    System.out.println(" ");
                    System.out.print("RightVals= ");
                    for (int index = 0; index < leftValue.length; index++) {
                        System.out.print(rightValue[index] + " ");
                    }
                    System.out.println(" ");
                    break;

                //Prints the addition result
                case 'a':
                    System.out.print("Addition Result= ");
                    for (int index = 0; index < leftValue.length; index++) {
                        System.out.print((leftValue[index] + rightValue[index]) + " ");
                    }
                    System.out.println(" ");
                    break;

                //Prints the subtraction result
                case 's':
                    System.out.print("Subtraction Result= ");
                    for (int index = 0; index < leftValue.length; index++) {
                        System.out.print((leftValue[index] - rightValue[index]) + " ");
                    }
                    System.out.println(" ");
                    break;

                //Prints the division result
                case 'd':
                    System.out.print("Division Result= ");
                    for (int index = 0; index < leftValue.length; index++) {
                        System.out.print((leftValue[index] / rightValue[index]) + " ");
                    }
                    System.out.println(" ");
                    break;

                //Prints the multiplication result
                case 'm':
                    System.out.print("Multiplication Result= ");
                    for (int index = 0; index < leftValue.length; index++) {
                        System.out.print((leftValue[index] * rightValue[index]) + " ");
                    }
                    System.out.println(" ");
                    break;

                //Prints if the code has an error
                default:
                    System.out.println("Code Error. Please try again");
            }
        }
    }
}




