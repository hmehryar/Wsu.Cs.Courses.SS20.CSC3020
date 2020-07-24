package com.csc3020.hw06.go5334;

public class Subtractor extends CalculateBase {

    public Subtractor() {
    }
    public Subtractor(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }
    @Override
    public void calculate() {
        double value=getLeftVal()-getRightVal();
        setResult(value);
    }
}