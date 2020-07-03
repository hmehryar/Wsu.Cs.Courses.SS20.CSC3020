package com.csc3020.hw04MidTermProject.gg8219;

//Inherit from CalculateBase class
class Multiplier extends CalculateBase {
    public Multiplier(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    //Implement Multiplication in its calculate method.
    @Override
    public double calculate() {
        return this.result = this.leftVal*this.rightVal;
    }
}
