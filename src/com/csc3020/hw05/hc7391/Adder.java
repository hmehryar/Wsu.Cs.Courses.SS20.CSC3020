package csc3020.hw05.hc7391;

public class Adder extends CalculateBase {

    public Adder(){

    }

    public Adder(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    @Override
    public void calculate() {

      setResult((getLeftVal()+getRightVal()));
    }
}
