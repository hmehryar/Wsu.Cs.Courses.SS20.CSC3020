package com.csc3020.hw01.gs9945;

public class hw01source {

    public static void main(String[] args){
        System.out.println("");
        System.out.println("Kristopher Covert's Calculator");
        System.out.println("");


        double rightVals[] = new double[4];
        double leftVals[] = new double[4];
        double answers[] = new double[4];
        char signs[] = new char[4];
        double answer = 0.0;

        char temp = 'a';

        signs[0] = '+';
        signs[1] = '-';
        signs[2] = '*';
        signs[3] = '/';


        for(int i = 0; i < 4; i++){
            leftVals[i] = i * 5;
            rightVals[i] = i * 2;
        }

        System.out.println("LeftVals: ");
        for(var x = 0; x < 4; x++){
            System.out.print(leftVals[x]+ "  ");
        }
        System.out.println("");

        System.out.println("rightVals: ");
        for(var y = 0; y < 4; y++){
            System.out.print(rightVals[y]+ "  ");
        }

        for(int k = 0; k < 4; k++) {

            temp = signs[k];

            switch (temp) {
                case '+':
                    System.out.println("");
                    System.out.println("");
                    for(var l = 0; l < 4; l++) {
                        answers[l] = leftVals[l] + rightVals[l];
                    }
                    System.out.println("Addition Results:");
                    break;
                case '-':
                    System.out.println("");
                    System.out.println("");
                    for(var m = 0; m < 4; m++) {
                        answers[m] = leftVals[m] - rightVals[m];
                    }
                    System.out.println("Subtraction Results:");
                    break;
                case '*':
                    System.out.println("");
                    System.out.println("");
                    for(var n = 0; n < 4; n++) {
                        answers[n] = leftVals[n] * rightVals[n];
                    }
                    System.out.println("Multiplication Results:");
                    break;
                case '/':
                    System.out.println("");
                    System.out.println("");
                    for(var o = 1; o < 4; o++) {
                        answers[o] = leftVals[o] / rightVals[o];
                    }
                    System.out.println("Division Results:");
                    break;
                default:
                    System.out.println("Not good");

            }
            for(int p = 0; p < 4; p++){
                System.out.print(answers[p]);
                System.out.print("  ");
            }

        }

    }

}
