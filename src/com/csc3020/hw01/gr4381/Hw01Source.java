package csc3020.hw01.gr4381;

//
// Author: Matthew Martin
// Date: 2020-05-17
// Homework 01
//

public class Hw01Source {
    public static void main(String[] args) {

        double array1[] = {22.5, -6.0, 15.4, 83.3};
        double array2[] = {0.8, 104.7, 24.0, 8.8};
        char op[] = {'a', 's', 'm', 'd'};


        System.out.println("First array:");
        for (double element:array1) { // loop to print the first array
            System.out.print(element);
            System.out.print('\t'); // tab between elements
        }
        System.out.println(); // end line after printing the array

        System.out.println("Second array:");
        for (double element:array2) { // loop to print the second array
            System.out.print(element);
            System.out.print('\t');
        }
        System.out.println();

        for (char operator:op) {
            switch (operator){
                case 'a':
                    System.out.println("Addition results:");
                    for (int index = 0; index < array1.length; index++){ // loop to print the sum of the paired array elements
                        System.out.print(array1[index] + array2[index]);
                        System.out.print('\t');
                    }
                    break;
                case 's':
                    System.out.println("Subtraction results:");
                    for (int index = 0; index < array1.length; index++){ // loop to print the difference of the paired array elements
                        System.out.print(array1[index] - array2[index]);
                        System.out.print('\t');
                    }
                    break;
                case 'm':
                    System.out.println("Multiplication results:");
                    for (int index = 0; index < array1.length; index++){ // loop to print the product of the paired array elements
                        System.out.print(array1[index] * array2[index]);
                        System.out.print('\t');
                    }
                    break;
                case 'd':
                    System.out.println("Division results:");
                    for (int index = 0; index < array1.length; index++){ // loop to print the quotient of the paired array elements
                        if (array2[index] == 0){ // test for 0 divisor
                            System.out.print("undefined");
                        } else {
                            System.out.print(array1[index] / array2[index]);
                        }
                        System.out.print('\t');
                    }
                    break;

            } // end switch
            System.out.println();
        } // end operator loop

    }
}
