package com.csc3020.hw02.gv7006;

public class MathEquation {
    public double lVal;
    public double rVal;
    public char opCode;

    public MathEquation(double lVal, double rVal, char opCode) {
        this.lVal = lVal;
        this.rVal = rVal;
        this.opCode = opCode;
    }

    public double execute() {
        double result = Double.NaN;  // bad value
        boolean validOp = true;
        switch (opCode) {
            case '+':
                result = lVal + rVal;
                break;
            case '-':
                result = lVal - rVal;
                break;
            case '*':
                result = lVal * rVal;
                break;
            case '/':
                if (rVal == 0) {
                    validOp = false;
                } else {
                    result = lVal / rVal;
                }
                break;
            default:
                validOp = false;
        }

        return result;
    }
}
