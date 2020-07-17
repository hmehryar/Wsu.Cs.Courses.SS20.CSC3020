package com.csc3020.hw05.gi3399;
//Author: George Esho

public class Multiplier extends CalculateBase {

    public Multiplier(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    @Override
    public void calculate() {
        this.setResult(this.getLeftVal() * this.getRightVal());
    }
}
