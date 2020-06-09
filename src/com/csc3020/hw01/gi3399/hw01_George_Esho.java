package com.csc3020.hw01.gi3399;
//  ASK HAYDAR IF IT'S POSSIBLE TO RUN FILES IN REPOSITORY WITHOUT HAVING TO MAKE SURE EVERY OTHER FILE IS CORRECT
public class hw01_George_Esho {
    public static void main(String[] args) {
        double[] val1 = {100.0, 25.0, 225.0, 11.0};
        double[] val2 = {50.0, 92.0, 17.0, 3.0};
        char[] operator = {'a', 's', 'm', 'd'}; // can be a, s, m, or d
        double result;

        System.out.print("LeftVals = ");
        for (int i = 0; i < 4; i++){
            System.out.print(val1[i] + "\t");
        }
        System.out.println();
        System.out.print("RightVals = ");
        for (int i = 0; i < 4; i++){
            System.out.print(val2[i] + "\t");
        }
        System.out.println();
        for (int i = 0; i < 4; i++){
            switch (operator[i]) {
                case 'a':
                    System.out.print("Addition Result = ");
                    for (int f = 0; f < 4; f++) {
                        result = val1[f] + val2[f];
                        System.out.print(result + "\t");
                    }
                    System.out.println();
                    break;
                case 's':
                    System.out.print("Subtraction Result = ");
                    for (int f = 0; f < 4; f++) {
                        result = val1[f] - val2[f];
                        System.out.print(result + "\t");
                    }
                    System.out.println();
                    break;
                case 'm':
                    System.out.print("Multiplication Result = ");
                    for (int f = 0; f < 4; f++) {
                        result = val1[f] * val2[f];
                        System.out.print(result + "\t");
                    }
                    System.out.println();
                    break;
                case 'd':
                    System.out.print("Division Result = ");
                    for (int f = 0; f < 4; f++) {
                        if (val2[f] == 0.0){
                            System.out.println("ERROR: CANNOT DIVIDE BY 0");
                            break;
                        }
                        result = val1[f] / val2[f];
                        System.out.print(result + "\t");
                    }
                    System.out.println();
                    break;
            }
        }
    }
}
