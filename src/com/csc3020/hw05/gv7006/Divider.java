package com.csc3020.hw05.gv7006;

class Divider extends CalculateBase {
    public Divider(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }
    
    @Override
    public void calculate() {
        if (getRightVal() == 0) throw new ArithmeticException("Division by 0 disallowed");
        setResult(getLeftVal() / getRightVal());
    }
}
