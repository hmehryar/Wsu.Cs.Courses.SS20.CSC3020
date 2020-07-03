package csc3020.hw04MidTermProject.gp7633;

public class MathEquation {
    private double leftValue;
    private double rightValue;
    double result;
    char opCode;

    MathEquation(char opCode) {
        this.opCode = opCode;
    }

    // Execute (no parameters)
    void Execute() {
        switch (opCode) {
            case 'a':
                result = leftValue + rightValue;
                break;
            case 's':
                result = leftValue - rightValue;
                break;
            case 'm':
                result = leftValue * rightValue;
                break;
            case 'd':
                if (rightValue == 0) {
                    System.out.println("Error: right Value for division can be not zero!!!");
                    result = 0.0d;
                    break;
                }
                result = leftValue / rightValue;
                break;
            default:
                System.out.println("Error: Invalid Operation Code");
                result = 0.0d;
                break;
        }
    }

    // Execute double
    void Execute(double lVal, double rVal) {
        switch (opCode) {
            case 'a':
                result = lVal + rVal;
                break;
            case 's':
                result = lVal - rVal;
                break;
            case 'm':
                result = lVal * rVal;
                break;
            case 'd':
                if (rVal == 0) {
                    System.out.println("Error: right Value for division can be not zero!!!");
                    result = 0.0d;
                    break;
                }
                result = lVal / rVal;
                break;
            default:
                System.out.println("Error: Invalid Operation Code");
                result = 0.0d;
                break;
        }
    }

    // Execute int
    void Execute(int lVal, int rVal) {
        switch (opCode) {
            case 'a':
                result = lVal + rVal;
                break;
            case 's':
                result = lVal - rVal;
                break;
            case 'm':
                result = lVal * rVal;
                break;
            case 'd':
                if (rVal == 0) {
                    System.out.println("Error: right Value for division can be not zero!!!");
                    result = 0.0d;
                    break;
                }
                result = lVal / rVal;
                break;
            default:
                System.out.println("Error: Invalid Operation Code");
                result = 0.0d;
                break;
        }
    }
}

