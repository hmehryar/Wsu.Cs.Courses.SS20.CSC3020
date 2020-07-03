package com.csc3020.hw03.gi3399;
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

    public MathEquation(double left, double right, char op) {
        this();
        this.leftVal = left;
        this.rightVal = right;
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

    public void execute(){
        switch(this.getOperator()) {
            case 'a':
                this.setResult(this.getLeftVal() + this.getRightVal());
                System.out.println("result = "+ this.getResult());
                break;
            case 's':
                this.setResult(this.getLeftVal() - this.getRightVal());
                System.out.println("result = "+ this.getResult());
                break;
            case 'm':
                this.setResult(this.getLeftVal() * this.getRightVal());
                System.out.println("result = "+ this.getResult());
                break;
            case 'd':
                this.setResult(this.getLeftVal() / this.getRightVal());
                System.out.println("result = "+ this.getResult());
                break;
        }

    }


}
