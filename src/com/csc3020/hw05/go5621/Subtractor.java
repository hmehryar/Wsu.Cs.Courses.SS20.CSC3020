package com.csc3020.hw05.go5621;
//*
// Author: Patricia Liu
// Homework 5: Subtractor
// */
public class Subtractor extends CalculateBase{
    public Subtractor(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    @Override
    public void calculate() {
        result = leftVal - rightVal;
    }
}
