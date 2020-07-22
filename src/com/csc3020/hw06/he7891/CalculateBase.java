package com.csc3020.hw06.he7891;
/*
 * Author: Nathan Tattrie
 * Student ID: he7891
 * Homework Assignment 06
 * CalculateBase.java
 * */

abstract public class CalculateBase {

    // PROPERTIES
    private double leftVal;
    private double rightVal;
    private double result;

    // ACCESSORS
    public double getLeftVal() {
        return leftVal;
    }
    public double getRightVal() {
        return rightVal;
    }
    public double getResult() {
        return result;
    }

    // MUTATORS
    public void setLeftVal(double leftVal) {
        this.leftVal = leftVal;
    }
    public void setRightVal(double rightVal) {
        this.rightVal = rightVal;
    }
    public void setResult(double result) {
        this.result = result;
    }

    // CONSTRUCTORS
    public CalculateBase(){}
    public CalculateBase(double leftVal, double rightVal) {
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    // CALCULATE METHOD
    abstract void calculate(double leftVal, double rightVal);


}
