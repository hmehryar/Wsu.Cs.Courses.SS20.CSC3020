package csc3020.hw06.hm;

public class Divider extends CalculateBase {
    public Divider() {
    }

    public Divider(double leftValue, double rightValue) {
        super(leftValue, rightValue);
    }

    @Override
    public void calculate() {
        if(getRightValue()==0){
            setResult(0);
            return;
        }
        double value=getLeftValue()/getRightValue();
        setResult(value);
    }
}
