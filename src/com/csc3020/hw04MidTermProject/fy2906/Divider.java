package csc3020.hw04MidTermProject.fy2906;

public class Divider extends CalculateBase{

    public Divider(double leftValue, double rightValue) {
        super(leftValue, rightValue);
    }

    @Override
    public void calculate() {
        if (getRightValue() == 0)
            System.out.println("Can not divide by zero.");
        else
            setResult(getLeftValue() / getRightValue());
    }
}
