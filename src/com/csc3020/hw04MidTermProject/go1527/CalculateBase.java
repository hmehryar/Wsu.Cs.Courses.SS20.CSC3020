package csc3020.hw04MidTermProject.go1527;

//Abstract Class CalculateBase
public abstract class CalculateBase {
    double leftVal, rightVal, result;

    //Setters
    public void setLeftVal(double leftVal) {
        this.leftVal = leftVal;
    }

    public void setRightVal(double rightVal) {
        this.rightVal = rightVal;
    }

    public void setResult(double result) {
        this.result = result;
    }

    //Getters
    public double getLeftVal() {
        return leftVal;
    }

    public double getRightVal() {
        return rightVal;
    }

    public double getResult() {
        return result;
    }

    //Constructor
    CalculateBase(double leftVal, double rightVal) {
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    //Calculate Abstract Method
    abstract double calculate();

}
