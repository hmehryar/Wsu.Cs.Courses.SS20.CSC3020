package csc3020.hw04MidTermProject.gp7633;

public abstract class CalculateBase {
    private double leftVal;
    private double rightVal;
    double result;

    // Get left value (Accessor)
    double getLeftVal() {
        return leftVal;
    }

    // Get right value (Accessor)
    double getRightVal() {
        return rightVal;
    }

    // Get result (Accessor)
    double getResult() {
        return result;
    }

    // Set left value (Mutator)
    void setLeftVal(double val) {
        leftVal = val;
    }

    // Set right value (Mutator)
    void setRightVal(double val) {
        rightVal = val;
    }

    // Constructor
    public CalculateBase(double lVal, double rVal) {
        leftVal = lVal;
        rightVal = rVal;
    }

    // Default constructor with chain
    CalculateBase() {
        this(-1.0d,-1.0d);
    }

    void calculate() {
        System.out.println("result=");
    }
}
