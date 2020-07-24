package csc3020.hw03.ee7708;

//CLASS
public class MathEquation {

    //FIELDS
    //All fields are private as they should not be directly accessed,
    // rather the accessors and mutators should be employed to get and set the MathEquation fields
    private double leftValue;
    private double rightValue;
    private double result;
    private char operator;


    //CONSTRUCTORS
    //This constructor sets the character operator only
    public MathEquation(char operator) {
        setOperator(operator);
    }

    //This constructor sets the left, right, and operator field values
    public MathEquation(double leftValue, double rightValue, char operator) {
        this(operator);
        setLeftValue(leftValue);
        setRightValue(rightValue);
    }


    //ACCESSORS and MUTATORS
    //Accessor retrieves field value
    //  • Also called getter
    //  • Method name: getFieldName
    //Mutator modifies field value
    //  • Also called setter
    //  • Method name: setFieldName

    //All accessors and mutators are private except the getResult() function
    private double getLeftValue() {
        return leftValue;
    }
    private void setLeftValue(double leftValue) {
        this.leftValue = leftValue;
    }

    private double getRightValue() {
        return rightValue;
    }
    private void setRightValue(double rightValue) {
        this.rightValue = rightValue;
    }

    private char getOperator() {
        return operator;
    }
    //Ensure that the operator is of an expected type, otherwise throw exception
    private void setOperator(char operator) {
        if (operator != '+' && operator != '-' && operator != '*' && operator != '/') {
            throw new IllegalArgumentException("Operator Must Be of type: +, -, *, /");
        }
        this.operator = operator;
    }

    //The getResult function will be called outside of the MathEquation class to access the equation result value
    public double getResult() {
        return result;
    }
    private void setResult(double result) {
        this.result = result;
    }


    //METHODS
    //The execute method will fetch the left, right, and operator values and perform the
    // operator defined arithmetic operation. The result field value will be set based on
    // the calculation result.
    public void execute() {
        switch (this.getOperator()) {
            case '+':
                setResult(getLeftValue() + getRightValue());
                break;
            case '-':
                setResult(getLeftValue() - getRightValue());
                break;
            case '/':
                if (getRightValue() == 0) {
                    throw new IllegalArgumentException("Denominator Cannot be 0");
                }
                setResult(getLeftValue() / getRightValue());
                break;
            case '*':
                if (getLeftValue() == 0 || getRightValue() == 0) {
                    setResult(0);
                    break;
                }
                setResult(getLeftValue() * getRightValue());
                break;
            default:
                System.out.println("Error - Invalid operation code");
                break;
        }
    }
}