package com.csc3020.hw06.gv7006;

class MathEquation {
    private double leftVal;
    private double rightVal;
    private char opCode;
    private double result;

    public MathEquation(char opCode) {
        setOpCode(opCode);
    }

    public MathEquation(double leftVal, double rightVal, char opCode) {
        this(opCode);
        setLeftVal(leftVal);
        setRightVal(rightVal);
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
        if (!(opCode == '+' || opCode == '-' || opCode == '*' || opCode == '/'
                || opCode == 'a' || opCode == 's' || opCode == 'm' || opCode == 'd')) {
            throw new IllegalArgumentException(String.format("Operation '%c' not defined", opCode));
        }
        this.opCode = opCode;
    }

    public double getResult() {
        return result;
    }

    private void setResult(double result) {
        this.result = result;
    }

    public void execute() {
        double result = Double.NaN;  // bad value
        switch (opCode) {
            case '+', 'a':
                result = leftVal + rightVal;
                break;
            case '-', 's':
                result = leftVal - rightVal;
                break;
            case '*', 'm':
                result = leftVal * rightVal;
                break;
            case '/', 'd':
                if (rightVal == 0) throw new ArithmeticException("Division by 0 disallowed");
                result = leftVal / rightVal;
                break;
        }
        setResult(result);
    }

    public void execute(double leftVal, double rightVal) {
        double result = Double.NaN;  // bad value
        switch (opCode) {
            case '+', 'a':
                result = leftVal + rightVal;
                break;
            case '-', 's':
                result = leftVal - rightVal;
                break;
            case '*', 'm':
                result = leftVal * rightVal;
                break;
            case '/', 'd':
                if (rightVal == 0) throw new ArithmeticException("Division by 0 disallowed");
                result = leftVal / rightVal;
                break;
        }
        setResult(result);
    }

    public void execute(int leftVal, int rightVal) {
        double result = Double.NaN;  // bad value
        switch (opCode) {
            case '+', 'a':
                result = leftVal + rightVal;
                break;
            case '-', 's':
                result = leftVal - rightVal;
                break;
            case '*', 'm':
                result = leftVal * rightVal;
                break;
            case '/', 'd':
                if (rightVal == 0) throw new ArithmeticException("Division by 0 disallowed");
                result = leftVal / rightVal;
                break;
        }
        setResult(result);
    }
}
