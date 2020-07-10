package hw04MidTermProject.ee7708;

public class Divider extends CalculateBase {
    public Divider(double leftValue, double rightValue) {
        super(leftValue, rightValue);
        setLeftValue(leftValue);
        setRightValue(rightValue);
    }

    @Override
    public void calculate() {
        if (this.getRightValue() == 0) {
            throw new IllegalArgumentException("Denominator Cannot be 0");
        }
        this.setResult(this.getLeftValue() / this.getRightValue());
    }
}
