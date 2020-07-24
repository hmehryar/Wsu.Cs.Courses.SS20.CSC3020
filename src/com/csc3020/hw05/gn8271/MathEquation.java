package csc3020.hw05.gn8271;
// Homework 05
// Author: Raisa Zaman
public class MathEquation {
    public MathEquation(char opCode) {
       this.opCode = opCode;
    }

    // Four private class members variables
    private char opCode;
    private double leftVal ;
    private double rightVal ;
    private double result;

    // Accessor result (Can be used to print out the result)(Accessor)
    public double getResult() {
        return result;
    }

    // Execute the four operations
    public void execute(double leftVal, double rightVal)
    {
        // Switches statement for going throw the operations and returns the results
        switch (opCode) {
            // addition
            case 'a':
                result = leftVal + rightVal;
                break;
            // subtraction
            case 's':
                result = leftVal - rightVal;
                break;
            // division
            case 'd':
                result = leftVal / rightVal;
                break;
            //multiplication
            case 'm':
                result = leftVal * rightVal;
                break;
            // The default statements
            default:
                System.out.println("Error! operator is not correct");
                break;

        }
    }

    // Execute the four operations
    public void execute(int leftVal, int rightVal)
    {
        // Switches statement for going throw the operations and returns the results
        switch (opCode) {
            // addition
            case 'a':
                result = leftVal + rightVal;
                break;
            // subtraction
            case 's':
                result = leftVal - rightVal;
                break;
            // division
            case 'd':
                result = leftVal / rightVal;
                break;
            //multiplication
            case 'm':
                result = leftVal * rightVal;
                break;
            // The default statements
            default:
                System.out.println("Error! operator is not correct");
                break;

        }
    }
}
