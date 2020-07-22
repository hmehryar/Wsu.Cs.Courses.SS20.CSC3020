package csc3020.hw05.hc7391;

public abstract class CalculateBase {
    private double leftVal;
    private double rightVal;
    private double result;

    //constructor
    public CalculateBase(){

    }

    public CalculateBase(double leftVal, double rightVal){
        this();
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }
    //setters
    public void setLeftVal(double leftVal) { this.leftVal = leftVal; }

    public void setRightVal(double rightVal) { this.rightVal = rightVal; }

    public void setResult(double result) { this.result = result; }

    //getters

    public double getLeftVal() { return leftVal; }

    public double getRightVal() { return rightVal; }

    public double getResult() { return result; }

    public abstract void calculate();
}
