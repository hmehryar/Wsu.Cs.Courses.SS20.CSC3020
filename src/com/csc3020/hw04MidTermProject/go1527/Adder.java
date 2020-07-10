package csc3020.hw04MidTermProject.go1527;

public class Adder extends CalculateBase {
    public Adder(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    @Override
    public double calculate() {
        return this.result = this.leftVal + this.rightVal;
    }
}
