package com.csc3020.hw05.go5334;

public class Divider extends CalculateBase {
    public Divider() {
    }

    public Divider(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    @Override
    public void calculate() {
        if(getRightValue()==0){
            setResult(0);
            return;
        }
        double value=getLeftValue()/getRightValue();
        setResult(value);
    }
}

