package csc3020.hw05.he7891;

public class Divider extends CalculateBase {
    @Override
    void calculate(double leftVal, double rightVal) {
        if (rightVal != 0) {
            setResult(leftVal / rightVal);
        } else {
            System.out.println("DIVIDE BY 0 ERROR!");
        }
    }
}
