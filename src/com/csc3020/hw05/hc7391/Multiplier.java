package csc3020.hw05.hc7391;

public class Multiplier extends CalculateBase {

    public Multiplier(){

    }

    public Multiplier(double leftVal, double rightVal){
        super(leftVal, rightVal);
    }

    @Override
    public void calculate(){

        setResult((getLeftVal()*getRightVal()));
    }
}
