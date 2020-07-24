package csc3020.hw05.hc7391;

public class Divider extends CalculateBase {

    public Divider(){

    }

    public Divider(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    @Override
    public void calculate() {
        if(getRightVal() == 0){
            setResult(0);
            return;
        }
        setResult((getLeftVal()/getRightVal()));
    }
}
