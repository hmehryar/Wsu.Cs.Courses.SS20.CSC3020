package homework6.em0608;

public class Adder extends CalculateBase {
        double sum;


    public Adder(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    @Override
    public void calculate() {
        setResult(leftVal + rightVal);

    }

}
