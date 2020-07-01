package csc3020.hw04MidTermProject.go3480;

public class Multiplier extends CalculateBase {
    public Multiplier(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    @Override
    void calculate() {
        setResult(getLeftVal() * getRightVal());
    }
}
