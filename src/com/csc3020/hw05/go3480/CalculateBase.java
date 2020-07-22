package csc3020.hw05.go3480;

public abstract class CalculateBase {
    private double leftVal, rightVal, result;

    public CalculateBase(double leftVal, double rightVal) {
        setLeftVal(leftVal);
        setRightVal(rightVal);
    }

    abstract void calculate();

    public double getLeftVal() {
        return leftVal;
    }
    public void setLeftVal(double leftVal) {
        this.leftVal = leftVal;
    }

    public double getRightVal() {
        return rightVal;
    }
    public void setRightVal(double rightVal) {
        this.rightVal = rightVal;
    }

    public double getResult() {
        return result;
    }
    public void setResult(double result) {
        this.result = result;
    }
}
