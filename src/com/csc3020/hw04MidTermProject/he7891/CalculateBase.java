package csc3020.hw04MidTermProject.he7891;
/*
 * Author: Nathan Tattrie
 * Student ID: he7891
 * Homework Assignment 04
 * CalculateBase.java
 * */

// Inheritance Item Step 1
abstract public class CalculateBase {

    // Inheritance Item Step 2
    // PROPERTIES
    private double leftVal;
    private double rightVal;
    private double result; // Why did we have to initialize this??

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

    // Inheritance Item Step 3
    // CALCULATE METHOD
    abstract void calculate(double leftVal, double rightVal);


}
