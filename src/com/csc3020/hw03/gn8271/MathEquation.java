package hw03.gn8271;
// Homework03
// Author: Raisa Zaman
public class MathEquation {
    // Chain constructor for MathEquation class
    public MathEquation() {

    }

    public MathEquation(double leftValue, double rightValue) {
        this();
        this.leftValue= leftValue;
        this.rightValue = rightValue;
    }

    public MathEquation(double leftValue, double rightValue, char opCode) {
        this (leftValue,rightValue);
        this.opCode = opCode;
    }

    // Accessor result (Can be used to print out the result)(Accessor)
    public double getResult() {
        return result;
    }

    // If I want to change operation later (mutator)
    public void setOpCode(char opCode) {
        this.opCode = opCode;
    }

    // If I want to change left value later (mutator)
    public void setLeftValue(double leftValue) {
        this.leftValue = leftValue;
    }

    // If  I want to change right value later (mutator)
    public void setRightValue(double rightValue) {
        this.rightValue = rightValue;
    }

//    // Accessing operation (Can be used to print out operation) (Accessor)
//    public char getOpCode() {
//        return opCode;
//    }
//
//    // Accessing the left value (Can be used to print out left value) (Accessor)
//    public double getLeftValue() {
//        return leftValue;
//    }
//
//    // Accessing right value (Can be used to print out right value) (Accessor)
//    public double getRightValue() {
//        return rightValue;
//    }

    // Four private class members variables
    private char opCode;
    private double leftValue ;
    private double rightValue ;
    private double result;


    // Execute the four operations
    public void execute()
    {
        // Switches statement for going throw the operations and returns the results
        switch (opCode) {
            // addition
            case 'a':
                result = leftValue + rightValue;
                break;
            // subtraction
            case 's':
                result = leftValue - rightValue;
                break;
            // division
            case 'd':
                result = leftValue / rightValue;
                break;
            //multiplication
            case 'm':
                result = leftValue * rightValue;
                break;
            // The default statements
            default:
                System.out.println("Error! operator is not correct");
                break;

        }
    }
}
