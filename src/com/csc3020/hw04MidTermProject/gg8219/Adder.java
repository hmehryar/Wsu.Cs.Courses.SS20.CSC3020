package com.csc3020.hw04MidTermProject.gg8219;

//Inherit from CalculateBase class
public class Adder extends CalculateBase {
    public Adder(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    //Implement addition in its calculate method
    @Override
    public double calculate() {
        return this.result = this.leftVal+this.rightVal;
    }
}
