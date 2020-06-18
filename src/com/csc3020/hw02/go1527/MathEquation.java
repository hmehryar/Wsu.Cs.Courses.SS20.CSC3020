package com.csc3020.hw02.go1527;

public class MathEquation {
    public double leftVals[] = { 100.0d, 25.0d, 225.0d, 11.0d };
    public double rightVals[] = { 50.0d, 92.0d, 17.0d, 3.0d };
    public double results[];
    public char opCode;

    public MathEquation(char operator){
        results = new double[leftVals.length];
        opCode = operator;
    }

    public void execute(){
        double res = 0.0;
        double a,b;
        for (int i = 0; i < leftVals.length; i++) {
            a = leftVals[i];
            b = rightVals[i];
            switch (opCode) {
                case 'a': {
                    res = a + b;
                    break;
                }
                case 's': {
                    res = a - b;
                    break;
                }
                case 'm': {
                    res = a * b;
                    break;
                }
                case 'd': {
                    res = a / b;
                    break;
                }
            }
            results[i] = res;
        }
        if(opCode=='a') {
            System.out.print("Addition Result = ");
        }else if(opCode=='s') {
            System.out.print("Subtraction Result = ");
        }else if(opCode=='m') {
            System.out.print("Multiplication Result = ");
        }else if(opCode=='d') {
            System.out.print("Division Result = ");
        }
        for (int i = 0; i < leftVals.length; i++) {
            System.out.print(results[i] + "\t");
        }
        System.out.println();
    }

}