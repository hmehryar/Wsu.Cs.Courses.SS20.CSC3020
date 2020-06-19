package com.csc3020.hw01.gg8219;

//Ashraf Uddin

public class Hw01Source {
    public static void main(String[] args) {

        char[] arr = new char[]{'a', 's', 'm', 'd'};
        //Two double arrays which have the same sizes and initialized with arbitrary numbers
        double []leftVal = new double[]{100.0, 25.0, 225.0, 11.0};
        double []rightVal = new double[]{50.0, 92.0, 17.0, 3.0};

        System.out.println("LeftVals = 101.0, 26.0, 226.0, 12.0");
        System.out.println("RightVals = 49.0, 91.0, 16.0, 2.0");

        //For loop
        for (int i=0; i<=4; i++) {

            switch (arr[i]) { //Switch
                case 'a': //Addition
                    System.out.print("Addition Result = ");
                    for (int j = 0; j < 4; j++) {
                        System.out.print(leftVal[j] + rightVal[j] + " ");
                    }
                    System.out.println();
                    break;

                case 's': //Subtraction
                    System.out.print("Subtraction Result = ");
                    for (int j = 0; j < 4; j++) {
                        System.out.print(leftVal[j] - rightVal[j] + " ");
                    }
                    System.out.println();
                    break;

                case 'm': //Multiplication
                    System.out.print("Multiplication Result = ");
                    for (int j = 0; j < 4; j++) {
                        System.out.print(leftVal[j] * rightVal[j] + " ");
                    }
                    System.out.println();
                    break;
                case 'd': //Division
                    System.out.print("Division Result = ");
                    for (int j = 0; j < 4; j++) {
                        System.out.print(leftVal[j] / rightVal[j] + " ");
                    }
                    System.out.println();
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
        }
    }
}
