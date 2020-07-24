package csc3020.hw05.ee7708;

public class Adder extends CalculateBase {

    public Adder(double leftValue, double rightValue) {
        super(leftValue, rightValue);
        setLeftValue(leftValue);
        setRightValue(rightValue);
    }

    @Override
    public void calculate() {
        this.setResult(this.getLeftValue() + this.getRightValue());
    }
}