package com.csc3020.hw06.gi3399;
//Author: George Esho

public class Subtractor extends CalculateBase {

    public Subtractor(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    @Override
    public void calculate() {
        this.setResult(this.getLeftVal() - this.getRightVal());
    }
}
