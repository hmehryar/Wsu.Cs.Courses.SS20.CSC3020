package csc3020.hw05.go3480;

public class MathEquation {
    private char opCode;
    private double leftVal, rightVal, result;

    public MathEquation() {
        leftVal = 0.0d;
        rightVal = 0.0d;
        opCode = '\u0000'; // null char
        result = 0.0d;
    }
    public MathEquation(char opCode) {
        this.opCode = opCode;
    }

    // excluded unused setters and getters
    public void setLeftVal(double leftVal) {
        this.leftVal = leftVal;
    }

    public void setRightVal(double rightVal) {
        this.rightVal = rightVal;
    }

    public double getResult() {
        return result;
    }

    public void execute(double leftVal, double rightVal) {
        setLeftVal(leftVal);
        setRightVal(rightVal);
        execute();
    }
    public void execute(int leftVal, int rightVal) {
        setLeftVal(leftVal);
        setRightVal(rightVal);
        //execute(); this won't work since the variables are casted to double
        // a separate switch statement is required
        switch (opCode) {
            case 'a':
                result = leftVal + rightVal;
                break;
            case 's':
                result = leftVal - rightVal;
                break;
            case 'd':
                if (rightVal == 0)
                    break;
                result = leftVal / rightVal;
                break;
            case 'm':
                result = leftVal * rightVal;
                break;
            default:
                System.out.println("Invalid input!");
                break;
        }
    }

    // reusing this part from the previous lab
    public void execute() {
        switch (opCode) {
            case 'a':
                result = leftVal + rightVal;
                break;
            case 's':
                result = leftVal - rightVal;
                break;
            case 'd':
                if (rightVal == 0)
                    break;
                result = leftVal / rightVal;
                break;
            case 'm':
                result = leftVal * rightVal;
                break;
            default:
                System.out.println("Invalid input!");
                break;
        }
    }
}
