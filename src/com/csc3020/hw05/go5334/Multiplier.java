package com.csc3020.hw05.go5334;

public class Multiplier extends CalculateBase{
    public Multiplier() {
    }

    public Multiplier(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    @Override
    public void calculate() {
        double value=getLeftValue()*getRightValue();
        setResult(value);
    }
}