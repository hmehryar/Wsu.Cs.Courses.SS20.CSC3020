package com.csc3020.hw04MidTermProject.gl1193;

public class Subtractor extends CalculateBase {

    public Subtractor(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    public double calculate() {
        return result=this.leftVal-rightVal;
    }
}
