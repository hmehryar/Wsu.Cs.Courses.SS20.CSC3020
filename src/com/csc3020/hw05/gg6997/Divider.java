package csc3020.hw05.gg6997;

public class Divider extends csc3020.hw05.gg6997.CalculateBase {
    //constructor uses super to refer to parent object CalculateBase's values
    public Divider(double leftValue, double rightValue){
        super(leftValue, rightValue);
    }

    //calculate method for addition
    //override needed to tell compiler we are overriding the method, not making a new method
    //override the calculate method instantiated in CalculateBase to do division
    @Override
    public double calculate(){
        return this.result = this.leftValue / this.rightValue;
    }
}
