package com.csc3020.hw04MidTermProject.hc7391;

public class Divider extends CalculateBase {


    Divider(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    @Override
    public void calculate() {

        setResult((getLeftVal()/getRightVal()));
    }
}
