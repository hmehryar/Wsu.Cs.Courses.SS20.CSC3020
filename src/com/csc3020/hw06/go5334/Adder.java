package com.csc3020.hw06.go5334;

public class Adder extends CalculateBase{
    public Adder() {
    }

    public Adder(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    @Override
    public void calculate() {
        double value=getLeftVal()+getRightVal();
        setResult(value);
    }
}