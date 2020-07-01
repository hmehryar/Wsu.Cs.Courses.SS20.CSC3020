package com.csc3020.hw03.gv7006;

public class MathEquation {
    private double leftVal;
    private double rightVal;
    private char opCode;
    private double result;

    public MathEquation(double leftVal, double rightVal, char opCode) {
        this(opCode);
        setLeftVal(leftVal);
        setRightVal(rightVal);
    }

    private MathEquation(char opCode) {
        setOpCode(opCode);
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

    public char getOpCode() {
        return opCode;
    }

    public void setOpCode(char opCode) {
        if (!(opCode == '+' || opCode == '-' || opCode == '*' || opCode == '/')) {
            throw new IllegalArgumentException(String.format("Operation '%c' not defined", opCode));
        }
        this.opCode = opCode;
    }

    public void execute() {
        double result = Double.NaN;  // bad value
        switch (opCode) {
            case '+':
                result = leftVal + rightVal;
                break;
            case '-':
                result = leftVal - rightVal;
                break;
            case '*':
                result = leftVal * rightVal;
                break;
            case '/':
                if (rightVal == 0) throw new ArithmeticException("Division by 0 disallowed");
                result = leftVal / rightVal;
                break;
            default:
        }
        setResult(result);
    }
    
    public double getResult() {
        return result;
    }
    
    private void setResult(double result) {
        this.result = result;
    }
}
