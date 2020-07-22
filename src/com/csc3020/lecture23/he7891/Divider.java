package com.csc3020.lecture23.he7891;
/*
 * Author: Nathan Tattrie
 * Student ID: he7891
 * Homework Assignment 06
 * Divider.java
 * */

public class Divider extends CalculateBase {
    @Override
    void calculate(double leftVal, double rightVal) {
        if (rightVal != 0) {
            setResult(leftVal / rightVal);
        } else {
            System.out.println("DIVIDE BY 0 ERROR!");
        }
    }
}
