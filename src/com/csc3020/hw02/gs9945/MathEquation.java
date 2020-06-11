package com.csc3020.hw02.gs9945;

public class MathEquation {

    private double rVals[] = new double[4];
    private double lVals[] = new double[4];
    private double answers[] = new double[4];
    private char operation = 'a';

    MathEquation(int v1, int v2, char op){
        for(int i = 0; i < 4; i++){
            lVals[i] = i * v1;
            rVals[i] = i * v2;
        }
        this.operation = op;
    }

    public void execute(){
            switch (operation) {
                case '+':
                    System.out.println("");
                    System.out.println("");
                    for(var l = 0; l < 4; l++) {
                        answers[l] = lVals[l] + rVals[l];
                    }
                    System.out.println("Addition Results:");
                    break;
                case '-':
                    System.out.println("");
                    System.out.println("");
                    for(var m = 0; m < 4; m++) {
                        answers[m] = lVals[m] - rVals[m];
                    }
                    System.out.println("Subtraction Results:");
                    break;
                case '*':
                    System.out.println("");
                    System.out.println("");
                    for(var n = 0; n < 4; n++) {
                        answers[n] = lVals[n] * rVals[n];
                    }
                    System.out.println("Multiplication Results:");
                    break;
                case '/':
                    System.out.println("");
                    System.out.println("");
                    for(var o = 1; o < 4; o++) {
                        answers[o] = lVals[o] / rVals[o];
                    }
                    System.out.println("Division Results:");
                    break;
                default:
                    System.out.println("Switch Statement Is No Good");
            }
            for(int p = 0; p < 4; p++){
                System.out.print(answers[p]);
                System.out.print("  ");
            }
    }
}
