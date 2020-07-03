package com.csc3020.hw04MidTermProject.gg8219;

//Inherit from CalculateBase class
public class Subtractor extends CalculateBase {
    public Subtractor(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    //Implement subtraction in its calculate method
    @Override
    public double calculate() {
        return this.result = this.leftVal-this.rightVal;
    }
}
