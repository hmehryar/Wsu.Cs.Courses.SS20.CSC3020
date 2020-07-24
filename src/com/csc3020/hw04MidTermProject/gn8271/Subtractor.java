package csc3020.hw04MidTermProject.gn8271;

public class Subtractor extends CalculateBase {

    public Subtractor(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    public void calculate() {
        setResult(getLeftVal() - getRightVal());
    }
}
