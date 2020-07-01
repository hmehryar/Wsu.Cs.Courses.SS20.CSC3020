package com.csc3020.hw04MidTermProject.gv7006;

class Adder extends CalculateBase {
    public Adder(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }
    
    @Override
    public void calculate() {
        setResult(getLeftVal() + getRightVal());
    }
}
