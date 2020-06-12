package com.csc3020.hw01.fy2906;

public class Hw01Source {
    public static void main(String[] args) {
        //initialize arrays of doubles
        double leftArray[] = {100.0, 25.0, 225.0, 11.0};
        double rightArray[] = {50.0, 92.0, 17.0, 3.0};
        char operator[] = {'a', 's', 'd', 'm'};

        //outputs values of leftArray
        System.out.print("Left Values = ");
        for (int i = 0; i < leftArray.length; i++) {
            System.out.print(leftArray[i] + "\t");
        }
        System.out.println();

        //outputs values of rightArray
        System.out.print("Right Values = ");
        for (int i = 0; i < rightArray.length; i++) {
            System.out.print(rightArray[i] + "\t");
        }
        System.out.println();

        //switch statement that performs mathematical operations between the two arrays
        for (char op : operator) {
            switch (op) {
                case 'a':
                    //this case performs the addition operation and outputs the result
                    System.out.print("Addition Result = ");
                    for (int j = 0; j < leftArray.length; j++) {
                        System.out.print(leftArray[j] + rightArray[j] + "\t");
                    }
                    System.out.println();
                    break;
                case 's':
                    //this case performs the subtraction operation and outputs the result
                    System.out.print("Subtraction Result = ");
                    for (int j = 0; j < leftArray.length; j++) {
                        System.out.print(leftArray[j] - rightArray[j] + "\t");
                    }
                    System.out.println();
                    break;
                case 'd':
                    //this case performs the division operation and outputs the result
                    System.out.print("Division Result = ");
                    for (int j = 0; j < leftArray.length; j++) {
                        //if denominator is zero
                        if (rightArray[j] == 0) {
                            System.out.print("Can't divide by zero" + "\t");
                        }
                        //if denominator is anything other than zero
                        else {
                            System.out.print(leftArray[j] / rightArray[j] + "\t");
                        }
                    }
                    System.out.println();
                    break;
                case 'm':
                    //this case performs the multiplication operation and outputs the result
                    System.out.print("Multiplication Result = ");
                    for (int j = 0; j < leftArray.length; j++) {
                        System.out.print(leftArray[j] * rightArray[j] + "\t");
                    }
                    System.out.println();
                    break;
                default:
                    //this case executes if an invalid operator is in the array
                    System.out.println("Invalid operation.");
            }
        }
    }
}
