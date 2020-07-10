package csc3020.hw04MidTermProject.go1527;

public class Multiplier extends CalculateBase {
    public Multiplier(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    @Override
    public double calculate() {
        return this.result = this.leftVal * this.rightVal;
    }
}
