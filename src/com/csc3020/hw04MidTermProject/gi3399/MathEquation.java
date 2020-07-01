package com.csc3020.hw04MidTermProject.gi3399;
//Author: George Esho

public class MathEquation {
    public double leftVal;
    public double rightVal;
    public char operator;
    public double result;

    public MathEquation() {
        leftVal = 0.0;
        rightVal = 0.0;
        operator = ' ';
        result = 0.0;
    }

    public MathEquation(char op) {
        this();
        this.operator = op;
    }

    public double getLeftVal() {
        return leftVal;
    }

    public void setLeftVal(double leftVal) {
        this.leftVal = leftVal;
    }

    public double getRightVal() {
        return rightVal;
    }

    public void setRightVal(double rightVal) {
        this.rightVal = rightVal;
    }

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public void execute(double leftVal, double rightVal) {
        switch(this.getOperator()) {
            case 'a':
                this.setResult(leftVal + rightVal);
                System.out.println("result = "+ this.getResult());
                break;
            case 's':
                this.setResult(leftVal - rightVal);
                System.out.println("result = "+ this.getResult());
                break;
            case 'm':
                this.setResult(leftVal * rightVal);
                System.out.println("result = "+ this.getResult());
                break;
            case 'd':
                this.setResult(leftVal / rightVal);
                System.out.println("result = "+ this.getResult());
                break;
        }
    }

    public void execute(int leftVal, int rightVal) {
        switch(this.getOperator()) {
            case 'a':
                this.setResult(leftVal + rightVal);
                System.out.println("result = "+ this.getResult());
                break;
            case 's':
                this.setResult(leftVal - rightVal);
                System.out.println("result = "+ this.getResult());
                break;
            case 'm':
                this.setResult(leftVal * rightVal);
                System.out.println("result = "+ this.getResult());
                break;
            case 'd':
                this.setResult(leftVal / rightVal);
                System.out.println("result = "+ this.getResult());
                break;
        }
    }


}
