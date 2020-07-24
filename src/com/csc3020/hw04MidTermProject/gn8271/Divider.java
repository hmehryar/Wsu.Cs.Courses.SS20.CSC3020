package csc3020.hw04MidTermProject.gn8271;

public class Divider extends CalculateBase {

    public Divider(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    public void calculate() {
        setResult(getLeftVal() / getRightVal());
    }
}
