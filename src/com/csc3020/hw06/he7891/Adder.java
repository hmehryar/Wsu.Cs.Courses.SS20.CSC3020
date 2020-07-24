package csc3020.hw06.he7891;
/*
 * Author: Nathan Tattrie
 * Student ID: he7891
 * Homework Assignment 06
 * Adder.java
 * */

public class Adder extends CalculateBase {
    @Override
    void calculate(double leftVal, double rightVal) {
        setResult(leftVal + rightVal);
    }
}
