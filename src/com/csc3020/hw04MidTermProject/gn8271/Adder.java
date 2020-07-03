package hw04MidTermProject.gn8271;

public class Adder extends CalculateBase {

    public Adder(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    public void calculate() {
        setResult(getLeftVal() + getRightVal());
    }
}
