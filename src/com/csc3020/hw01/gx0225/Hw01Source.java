package com.csc3020.hw01.gx0225;

public class Hw01Source {
    public static void main(String[] args) {
        double[] leftVal = {100.0, 25.0, 225.0, 11.0};
        double[] rightVal = {50.0, 92.0, 17.0, 3.0};

        System.out.print("LeftVals = ");
        for (int i = 0; i < leftVal.length; i++){
            System.out.print(leftVal[i] + " ");

        }
        System.out.print("\nRightVals = ");
        for (int i = 0; i < rightVal.length; i++){
            System.out.print(rightVal[i] + " ");
        }

        char[] operator = {'a','b','c','d'};
        for (int i = 0; i < operator.length; i++){

            switch(operator[i]) {
                case 'a':
                    System.out.print("\nAddition Result = ");
                    for (int j = 0; j < operator.length; j++){
                        System.out.print(leftVal[j]+rightVal[j]+" ");
                    }

                    break;
                case 'b':
                    System.out.print("\nSubtraction Result= ");
                    for (int j = 0; j < operator.length; j++){
                        System.out.print(leftVal[j]-rightVal[j]+" ");
                    }

                    break;
                case 'c':
                    System.out.print("\nDivision Result = ");
                    for (int j = 0; j < operator.length; j++){
                        System.out.print(leftVal[j]/rightVal[j]+" ");
                    }

                    break;
                case 'd':
                    System.out.print("\nMultiplication Result = ");
                    for (int j = 0; j < operator.length; j++){
                        System.out.print(leftVal[j]*rightVal[j]+" ");
                    }

                    break;
                default:
                    System.out.println("Error: Invalid operation");
            }

        }

    }
}
