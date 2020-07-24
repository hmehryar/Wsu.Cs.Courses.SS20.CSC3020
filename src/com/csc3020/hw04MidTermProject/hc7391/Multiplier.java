package com.csc3020.hw04MidTermProject.hc7391;

public class Multiplier extends CalculateBase {

    public Multiplier(double leftVal, double rightVal){
        super(leftVal, rightVal);
    }

    @Override
    public void calculate(){

        setResult((getLeftVal()*getRightVal()));
    }
}
