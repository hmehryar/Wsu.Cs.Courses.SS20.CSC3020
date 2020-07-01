package com.csc3020.hw04MidTermProject.gi3399;
//Author: George Esho

public class Divider extends CalculateBase{

    public Divider(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    @Override
    public void calculate() {
        this.setResult(this.getLeftVal() / this.getRightVal());
        System.out.println("result = "+ this.getResult());
    }
}
