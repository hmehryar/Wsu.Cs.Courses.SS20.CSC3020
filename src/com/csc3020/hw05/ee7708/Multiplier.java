package csc3020.hw05.ee7708;

public class Multiplier extends CalculateBase {
    public Multiplier(double leftValue, double rightValue) {
        super(leftValue, rightValue);
        setLeftValue(leftValue);
        setRightValue(rightValue);
    }

    @Override
    public void calculate() {
        if (this.getLeftValue() == 0 || this.getRightValue() == 0) {
            this.setResult(0);
        }
        else this.setResult(this.getLeftValue() * this.getRightValue());
    }
}
