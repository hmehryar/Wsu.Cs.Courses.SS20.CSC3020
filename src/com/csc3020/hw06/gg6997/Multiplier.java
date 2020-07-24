package csc3020.hw06.gg6997;

import csc3020.hw06.gg6997.CalculateBase;

//Class extends to take values given and calculate needed operation
public class Multiplier extends csc3020.hw06.gg6997.CalculateBase {

    //constructor uses super to refer to parent object CalculateBase's values
    public Multiplier(double leftValue, double rightValue) {
        super(leftValue, rightValue);
    }

    //calculate method for addition
    //override needed to tell compiler we are overriding the method, not making a new method
    //override the calculate method instantiated in CalculateBase to do multiplication
    @Override
    public void calculate() {
        double value=getLeftValue()*getRightValue();
        setResult(value);
    }
}
