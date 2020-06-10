package com.csc3020.hw02.go5334;

public class MathEquation {
    private double LeftVals[] = { 100.0, 25.0, 225.0, 11.0 };
    private double RightVals[] = { 50.0, 92.0, 17.0, 3.0 };
    private double output[];
    private char opcode;
    MathEquation(char mathoperation){
        output = new double[LeftVals.length];
        opcode = mathoperation;
    }

    public void execute(){
        double calculation = 0.0;
        for (int i = 0; i < LeftVals.length; i++) {

            switch (opcode) {
                case '+': {
                    calculation = LeftVals[i] + RightVals[i];
                    break;
                }
                case '-': {
                    calculation = LeftVals[i] - RightVals[i];
                    break;
                }
                case '*': {
                    calculation = LeftVals[i] * RightVals[i];
                    break;
                }
                case '/': {
                    calculation = LeftVals[i] / RightVals[i];
                    break;
                }
            }
            output[i] = calculation;
        }

        if(opcode=='+') {
            System.out.print("Addition Result = ");
        }

        else if(opcode=='-') {
            System.out.print("Subtraction Result = ");
        }

        else if(opcode=='/') {
            System.out.print("Division Result = ");
        }

        else if(opcode=='*') {
            System.out.print("Multiplication Result = ");
        }

        for (int i = 0; i < LeftVals.length; i++) {
            System.out.printf("%.1f ",output[i]);
        }

        System.out.println("\n");
    }
}
