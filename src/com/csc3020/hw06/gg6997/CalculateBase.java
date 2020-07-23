package csc3020.hw06.gg6997;

//only must be inherited from another class
public class CalculateBase {
    private double leftValue;
    private double rightValue;
    private double result;

    //getters and setters
    public double getLeftValue() {
        return leftValue;
    }

    public void setLeftValue(double leftValue) {
        this.leftValue = leftValue;
    }

    public double getRightValue() {
        return rightValue;
    }

    public void setRightValue(double rightValue) {
        this.rightValue = rightValue;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public CalculateBase() {
    }

    //constructor to use this keyword to differentiate instance variable from local variable
    //takes two values
    public CalculateBase(double leftValue, double rightValue) {
        this();
        this.leftValue = leftValue;
        this.rightValue = rightValue;
    }

    //inherited by adder, subtractor,... to plug in values and compute
    public void calculate() {

    }
}
