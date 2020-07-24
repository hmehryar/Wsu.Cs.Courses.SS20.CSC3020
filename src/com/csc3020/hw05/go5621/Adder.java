package com.csc3020.hw05.go5621;
//*
// Author: Patricia Liu
// Homework 5: Adder
// */
public class Adder extends CalculateBase {

    public Adder(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    @Override
    public void calculate() {
        result = leftVal + rightVal;
    }
}
