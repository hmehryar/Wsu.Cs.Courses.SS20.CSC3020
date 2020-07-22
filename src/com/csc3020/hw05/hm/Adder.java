package csc3020.hw05.hm;

public class Adder extends CalculateBase{
    public Adder() {
    }

    public Adder(double leftValue, double rightValue) {
        super(leftValue, rightValue);
    }

    @Override
    public void calculate() {
        double value=getLeftValue()+getRightValue();
        setResult(value);
    }
}
