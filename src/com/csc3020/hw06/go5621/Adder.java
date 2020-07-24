package com.csc3020.hw06.go5621;

//*
// Author: Patricia Liu
// Homework 6: Adder
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
