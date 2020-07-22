package csc3020.hw06.hm;

public class Subtractor extends CalculateBase {

    public Subtractor() {
    }
    public Subtractor(double leftValue, double rightValue) {
        super(leftValue, rightValue);
    }
    @Override
    public void calculate() {
        double value=getLeftValue()-getRightValue();
        setResult(value);
    }
}
