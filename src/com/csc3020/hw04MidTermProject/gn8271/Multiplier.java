package hw04MidTermProject.gn8271;

public class Multiplier extends CalculateBase {

    public Multiplier(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    public void calculate() {
        setResult(getLeftVal() * getRightVal());
    }
}
