package csc3020.hw03.fy2906;

public class MathEquation {
    private double leftValue;
    private double rightValue;
    private char opCode;
    private double result;

    public MathEquation() {}

    public MathEquation(double left) {
        this();
        leftValue = left;
    }

    public MathEquation(double left, double right) {
        this(left);
        rightValue = right;
    }

    public MathEquation(double left, double right, char op) {
        this(left, right);
        opCode = op;
    }

    public double getLeftValue() {
        return leftValue;
    }

    public void setLeftValue(double leftValue) {
        this.leftValue = leftValue;
    }

    public double getRightValue() {
        return rightValue;
    }

    public void setRightValue(double rightValue) {
        this.rightValue = rightValue;
    }

    public char getOpCode() {
        return opCode;
    }

    public void setOpCode(char opCode) {
        this.opCode = opCode;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public void execute() {
        switch (opCode) {
            //this switch statement takes the operator input and performs the correct operation
            case 'a':
                //this case performs the addition operation
                result = leftValue + rightValue;
                break;
            case 's':
                //this case performs the subtraction operation
                result = leftValue - rightValue;
                break;
            case 'd':
                //this case performs the division operation
                if (rightValue == 0)
                    System.out.println("Can not divide by zero.");
                else
                    result = leftValue / rightValue;
                break;
            case 'm':
                //this case performs the multiplication operation
                result = leftValue * rightValue;
                break;
            default:
                //this case executes if an invalid operator is in the array
                System.out.println("Invalid operation.");
                break;
        }
    }
}
