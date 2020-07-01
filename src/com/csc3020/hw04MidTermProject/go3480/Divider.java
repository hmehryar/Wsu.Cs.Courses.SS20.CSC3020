package csc3020.hw04MidTermProject.go3480;

public class Divider extends CalculateBase {
    public Divider(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    @Override
    void calculate() {
        if (getRightVal() != 0)
            setResult(getLeftVal() / getRightVal());
        else
            setResult(0);
    }
}
