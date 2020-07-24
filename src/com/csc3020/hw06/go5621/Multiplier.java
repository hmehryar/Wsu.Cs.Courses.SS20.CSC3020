package com.csc3020.hw06.go5621;

//*
// Author: Patricia Liu
// Homework 6: Multiplier
// */
public class Multiplier extends CalculateBase {
    public Multiplier(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    @Override
    public void calculate() {
        result = leftVal * rightVal;
    }
}
