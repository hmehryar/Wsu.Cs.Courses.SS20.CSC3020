package csc3020.hw05.gr4381;
// Author: Matthew Martin
public abstract class CalculateBase {
    private double leftVal, rightVal, result;

    //Constructors
    CalculateBase(){};
    CalculateBase(double lv, double rv){
        leftVal = lv;
        rightVal = rv;
    }
    // Accessors and Mutators
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
        calculate();
        return result;
    }
    protected void setResult(double result) {
        this.result = result;
    }

    // Methods
    protected abstract void calculate();
}
