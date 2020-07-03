package hw04MidTermProject.gg6997;

//abstract class CalculateBase so it can't create objects;
//only must be inherited from another class
abstract class CalculateBase {
    //declare variables
    double leftVal;
    double rightVal;
    double result;

    //setters
    public void setLeftVal(double leftVal)
    {
        this.leftVal = leftVal;
    }
    public void setRightVal(double rightVal)
    {
        this.rightVal = rightVal;
    }
    public void setResult(double result)
    {
        this.result = result;
    }

    //getters
    public double getLeftVal()
    {
        return leftVal;
    }
    public double getRightVal()
    {
        return rightVal;
    }
    public double getResult()
    {
        return result;
    }

    //constructor to use this keyword to differentiate instance variable from local variable
    //takes two values
    CalculateBase(double leftVal, double rightVal){
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    //abstract method calculate to go through with calculation
    //inherited by adder, subtractor,... to plug in values and compute
    abstract double calculate();
}