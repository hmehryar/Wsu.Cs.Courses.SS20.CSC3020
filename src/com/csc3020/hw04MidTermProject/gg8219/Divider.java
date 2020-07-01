package com.csc3020.hw04MidTermProject.gg8219;

//Inherit from CalculateBase class
class Divider extends CalculateBase {
    public Divider(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    //Implement Division in its calculate method.
    @Override
    public double calculate() {
        return this.result = this.leftVal/this.rightVal;
    }
}
