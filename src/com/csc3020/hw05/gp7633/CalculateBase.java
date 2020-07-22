package csc3020.hw05.gp7633;

public abstract class CalculateBase {
    static double leftVal;
    static double rightVal;
    static double result;

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
    }
}
