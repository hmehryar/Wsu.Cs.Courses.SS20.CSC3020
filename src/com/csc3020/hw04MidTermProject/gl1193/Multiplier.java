package com.csc3020.hw04MidTermProject.gl1193;

public class Multiplier extends  CalculateBase {
    public Multiplier(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    public double calculate(){
        return this.result=leftVal*rightVal;
    }

}
