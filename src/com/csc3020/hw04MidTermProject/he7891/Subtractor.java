package csc3020.hw04MidTermProject.he7891;

// Inheritance Item Step 5
public class Subtractor extends CalculateBase {
    @Override
    void calculate(double leftVal, double rightVal) {
        setResult(leftVal - rightVal);
    }
}
