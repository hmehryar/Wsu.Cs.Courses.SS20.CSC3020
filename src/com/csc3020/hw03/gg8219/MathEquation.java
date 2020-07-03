package com.csc3020.hw03.gg8219;

public class MathEquation {
    double leftVal;
    double rightVal;
    private char opCode;

    //MathEquation class constructor
    //Overload
    public MathEquation(double leftVal,double rightVal,char operator){
        this.leftVal = leftVal;
        this.rightVal = rightVal;
        this.opCode = operator;
    }

    //Public method
    public void execute(){
        double results = 0.0d;
        switch (opCode) {
            case '/': { //Division
                System.out.print("Division ");
                results = leftVal / rightVal;
                break;
            }
            case '+': { //Addition
                System.out.print("Addition ");
                results = leftVal + rightVal;
                break;
            }
            case '-': { //Subtraction
                System.out.print("Subtraction ");
                results = leftVal - rightVal;
                break;
            }
            case '*': { //Multiplication
                System.out.print("Multiplication ");
                results = leftVal * rightVal;
                break;
            }
            case 'd':
                if (rightVal == 0) { //Error handling
                    System.out.println("Error: Cannot divide by 0!");
                    results = 0.0d;
                    break;
                }
                results = leftVal / rightVal;
                break;
            default: //Error exception
                System.out.println("Error: Invalid Operation Code!");
                break;
        }
        System.out.println("result: " + results);
    }
}
