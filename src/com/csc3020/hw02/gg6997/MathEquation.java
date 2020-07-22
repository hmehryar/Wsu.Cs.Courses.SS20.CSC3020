package csc3020.hw02.gg6997;

/**
 * Calculator Engine v3
 * Author: Manraj Singh
 * Email: manrajsingh@wayne.edu
 * Date: 5/29/2020
 * Description: Create a calculator engine utilizing classes and methods
 * */

public class MathEquation {
        //declare private variables only accessible by a class that can call it in
        private double leftVals[] = {150.0, 75.5, 37.5, 421.3};
        private double rightVals[] = {120.0, 120.2, 65.3, 200.8};
        private double result[];
        private char operator;

        //result array is given size of left array
        //op comes into play in the other class to instantiate an operator to each value in the calculate array
        MathEquation(char op){
            result = new double[leftVals.length];
            operator = op;
        }

        //execute method performs computations with switch statement and if's
        public void execute() {
            //declare left, right, and answer variables
            double l;
            double r;
            double answer = 0.0;

            //goes through each value in arrays and does all 4 operations on each position of array
            for (int index = 0; index < leftVals.length; index++) {
                //l and r are equal to the values in the left and right array, easier to write
                l = leftVals[index];
                r = rightVals[index];

                //switch statement performs each operation on the array indexes
                switch (operator) {
                    case '+': {
                        answer = l + r;
                        break;
                    }
                    case '-': {
                        answer = l - r;
                        break;
                    }
                    case '*': {
                        answer = l * r;
                        break;
                    }
                    case '/': {
                        answer = l / r;
                        break;
                    }
                    //java automatically generated a default statement as a suggestion
                    default:
                        throw new IllegalStateException("Unexpected value: " + operator);
                }
                //result array stores the answer to each operation
                result[index] = answer;
            }

            //when the switch goes through each case, the if statement prints out type of operation
            if (operator == '+') {
                System.out.print("Addition Result= ");
            } else if (operator == '-') {
                System.out.print("Subtraction Result= ");
            } else if (operator == '/') {
                System.out.print("Division Result= ");
            } else if (operator == '*') {
                System.out.print("Multiplication Result= ");
            }

            //for loop prints out answer to 4 calculations of each type, then goes back to switch statement
            for (int i = 0; i < leftVals.length; i++) {
                System.out.printf(String.valueOf(result[i]) + ", ");
            }
            System.out.println(" ");
        }
    }
