package com.cs3020.HW01.av7071;

public class Hw01Source {
    public static void main(String[] args) {
        char[] operations = {'a', 's', 'd', 'm'};
        double[] leftVal = {100.0, 25.0, 225.0, 11.0};
        double[] rightVal = {50.0, 92.0, 17.0, 3.0};
        double[] addition = new double[leftVal.length];
        double[] subtraction = new double[leftVal.length];
        double[] multiplication = new double[leftVal.length];
        double[] division = new double[leftVal.length];

        /**Print Left Array Values**/
        System.out.printf("\nLeft Values: ");
        for(int jVal = 0; jVal < leftVal.length; jVal++) {
            System.out.printf(leftVal[jVal] + "   ");
        }

        /**Print Right Array Values**/
        System.out.printf("\n\nRight Values: ");
        for(int jVal = 0; jVal < rightVal.length; jVal++) {
            System.out.printf(rightVal[jVal] + "   ");
        }

        /**Nested Switch Statement to loop through each Switch Case (a, s, d, m)**/
        for(int iVal = 0; iVal < operations.length; iVal++) {
            switch(operations[iVal]){
                case 'a':
                    System.out.printf("\n\nAddition Result: ");
                    for(int kVal = 0; kVal < leftVal.length; kVal++) {
                        addition[kVal] = leftVal[kVal] + rightVal[kVal];
                        System.out.printf(addition[kVal] + "   ");
                    }
                    break;
                case 's':
                    System.out.printf("\n\nSubtraction Result: ");
                    for(int lVal = 0; lVal < leftVal.length; lVal++) {
                        subtraction[lVal] = leftVal[lVal] - rightVal[lVal];
                        System.out.printf(subtraction[lVal] + "   ");
                    }
                    break;
                case 'd':
                    System.out.printf("\n\nDivision Result: ");
                    for(int mVal = 0; mVal < leftVal.length; mVal++) {
                        division[mVal] = leftVal[mVal] / rightVal[mVal];
                        System.out.printf(division[mVal] + "   ");
                    }
                    break;
                case 'm':
                    System.out.printf("\n\nMultiplication Result: ");
                    for(int nVal = 0; nVal < leftVal.length; nVal++) {
                        multiplication[nVal] = leftVal[nVal] * rightVal[nVal];
                        System.out.printf(multiplication[nVal] + "   ");
                    }
                    System.out.printf("\n");
                    break;
            }
        }
    }
}