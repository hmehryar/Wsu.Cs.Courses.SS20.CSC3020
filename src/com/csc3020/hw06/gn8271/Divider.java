package csc3020.hw06.gn8271;

// Homework 05
// Author: Raisa Zaman
public class Divider extends CalculateBase {

    public Divider(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    public void calculate() {
        setResult(getLeftVal() / getRightVal());
    }

}
