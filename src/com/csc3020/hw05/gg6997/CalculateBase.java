package csc3020.hw05.gg6997;

abstract class CalculateBase {
    //declare variables
    double leftValue;
    double rightValue;
    double result;

    //setters
    public void setLeftVal(double leftVal)
    {
        this.leftValue = leftVal;
    }
    public void setRightVal(double rightVal)
    {
        this.rightValue = rightVal;
    }
    public void setResult(double result)
    {
        this.result = result;
    }

    //getters
    public double getLeftVal()
    {
        return leftValue;
    }
    public double getRightVal()
    {
        return rightValue;
    }
    public double getResult()
    {
        return result;
    }

    //constructor to use this keyword to differentiate instance variable from local variable
    //takes two values
    CalculateBase(double leftVal, double rightVal){
        this.leftValue = leftVal;
        this.rightValue = rightVal;
    }

    //abstract method calculate to go through with calculation
    //inherited by adder, subtractor,... to plug in values and compute
    abstract double calculate();
}
