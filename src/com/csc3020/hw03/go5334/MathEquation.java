package com.csc3020.hw03.go5334;

public class MathEquation {
    private char opCode;
    double leftVal,rightVal;
    MathEquation(double leftVal,double rightVal,char mathOperation){
        opCode = mathOperation;

        switch (opCode) {
            case '/': {
                System.out.print("Division : ");
                break;
            }
            case '+': {
                System.out.print("Addition : ");
                break;
            }
            case '-': {
                System.out.print("Subtractoin : ");
                break;
            }
            case '*': {
                System.out.print("Multiplication : ");
                break;
            }
        }
        this.leftVal = leftVal;
        this.rightVal = rightVal;
        System.out.println(leftVal+","+rightVal);
    }
    public void execute(){
        double calculation = 0.0;
        switch (opCode) {
            case '+': {
                calculation = leftVal + rightVal;
                break;
            }
            case '-': {
                calculation = leftVal - rightVal;
                break;
            }
            case '*': {
                calculation = leftVal * rightVal;
                break;
            }
            case '/': {
                calculation = leftVal / rightVal;
                break;
            }
        }
        System.out.println("result : "+ calculation);
    }
}