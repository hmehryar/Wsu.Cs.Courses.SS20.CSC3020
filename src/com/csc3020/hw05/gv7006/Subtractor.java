package com.csc3020.hw05.gv7006;

class Subtractor extends CalculateBase {
    public Subtractor(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }
    
    @Override
    public void calculate() {
        setResult(getLeftVal() - getRightVal());
    }
}

