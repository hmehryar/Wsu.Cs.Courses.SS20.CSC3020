package homework6.em0608;

public class Subtractor extends CalculateBase {


    public Subtractor(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    @Override
    public void calculate() {
        setResult(leftVal - rightVal);

    }

}