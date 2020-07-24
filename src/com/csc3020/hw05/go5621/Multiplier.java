package com.csc3020.hw05.go5621;
//*
// Author: Patricia Liu
// Homework 5: Multiplier
// */
public class Multiplier extends CalculateBase{
    public Multiplier(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    @Override
    public void calculate() {
        result = leftVal * rightVal;
    }
}
