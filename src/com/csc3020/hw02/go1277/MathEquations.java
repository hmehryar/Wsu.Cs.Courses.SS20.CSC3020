package hw02.go1277;

public class MathEquations {
    MathEquations(double left, double right, char code) {
        set(left, right, code);
    }

    void set(double leftValue, double rightValue, char code) {
        this.leftValue = leftValue;
        this.rightValue = rightValue;
        sign = code;
    }

    public double getResult() {
        return result;
    }

    public char sign;
    public double leftValue;
    public double rightValue;
    public double result;

    public void execute() {
        switch (sign) {
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
                result = leftValue / rightValue;
                break;
            default:
                break;


        }


    }
}



