package csc3020.hw04MidTermProject.fy2906;

public class Adder extends CalculateBase{

    public Adder(double leftValue, double rightValue) {
        super(leftValue, rightValue);
    }

    @Override
    public void calculate() {
        setResult(getLeftValue() + getRightValue());
    }
}
