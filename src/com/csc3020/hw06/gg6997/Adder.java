package csc3020.hw06.gg6997;

//Class extends to take values given and calculate needed operation
public class Adder extends csc3020.hw06.gg6997.CalculateBase {

    //constructor uses super to refer to parent object CalculateBase's values
    public Adder(double leftValue, double rightValue) {
        super(leftValue, rightValue);
    }

    //calculate method for addition
    //override needed to tell compiler we are overriding the method, not making a new method
    //override the calculate method instantiated in CalculateBase to do addition
    @Override
    public void calculate() {
        double value=getLeftValue()+getRightValue();
        setResult(value);
    }
}
