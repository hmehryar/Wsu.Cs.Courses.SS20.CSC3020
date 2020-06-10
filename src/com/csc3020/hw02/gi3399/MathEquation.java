package com.csc3020.hw02.gi3399;
//Author: George Esho

public class MathEquation {
    public double[] leftVal= new double[4];
    public double[] rightVal = new double[4];
    public char[] operator = new char[4];
    public double[] result = new double[4];

    public void execute(){
        //switch according to operator
        for (int i = 0; i < 4; i++) {
            switch (operator[i]) {
                case 'a':
                    System.out.print("Addition Result = ");
                    for (int f = 0; f < 4; f++) {
                        result[f] = leftVal[f] + rightVal[f];
                        System.out.print(result[f] + "\t");
                    }
                    System.out.println();
                    break;
                case 's':
                    System.out.print("Subtraction Result = ");
                    for (int f = 0; f < 4; f++) {
                        result[f] = leftVal[f] - rightVal[f];
                        System.out.print(result[f] + "\t");
                    }
                    System.out.println();
                    break;
                case 'm':
                    System.out.print("Multiplication Result = ");
                    for (int f = 0; f < 4; f++) {
                        result[f] = leftVal[f] * rightVal[f];
                        System.out.print(result[f] + "\t");
                    }
                    System.out.println();
                    break;
                case 'd':
                    System.out.print("Division Result = ");
                    for (int f = 0; f < 4; f++) {
                        if (rightVal[f] == 0.0){
                            System.out.println("ERROR: CANNOT DIVIDE BY 0");
                            break;
                        }
                        result[f] = leftVal[f] / rightVal[f];
                        System.out.print(result[f] + "\t");
                    }
                    System.out.println();
                    break;
            }
        }

    }


}
