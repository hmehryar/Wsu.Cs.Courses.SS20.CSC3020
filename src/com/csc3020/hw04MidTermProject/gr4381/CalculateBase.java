package csc3020.hw04MidTermProject.gr4381;
// Author: Matthew Martin
public abstract class CalculateBase { // Inheritance 1.
    // Inheritance 2.
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
    //

    // Methods
    protected abstract void calculate(); // Inheritance 3.
}
