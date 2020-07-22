package com.csc3020.lecture23.he7891;
/*
 * Author: Nathan Tattrie
 * Student ID: he7891
 * Homework Assignment 06
 * Subtractor.java
 * */

public class Subtractor extends CalculateBase {
    @Override
    void calculate(double leftVal, double rightVal) {
        setResult(leftVal - rightVal);
    }
}
