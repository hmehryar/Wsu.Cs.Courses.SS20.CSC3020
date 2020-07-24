package csc3020.hw04MidTermProject.ee7708;

public class Subtractor extends CalculateBase {
    public Subtractor(double leftValue, double rightValue) {
        super(leftValue, rightValue);
        setLeftValue(leftValue);
        setRightValue(rightValue);
    }

    @Override
    public void calculate() {
        this.setResult(this.getLeftValue() - this.getRightValue());
    }
}