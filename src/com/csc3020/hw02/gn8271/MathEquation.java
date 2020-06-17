package hw02.gn8271;

public class MathEquation {
    // The constructor for MathEquation class
    MathEquation(double val1, double val2, char operation) {
        // Initializing the for class members variables
        this.leftValue= val1;
        this.rightValue = val2;
        this.opCode = operation;
    }
    // Four public class members variables
    public char opCode;
    public double leftValue ;
    public double rightValue ;
    public double result;

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

        }
    }
}
