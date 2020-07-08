package com.csc3020.hw04MidTermProject.gl1193;

public class Divider extends CalculateBase {
    public Divider(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    public double calculate() {
        return this.result = this.leftVal/this.rightVal;
    }

}
