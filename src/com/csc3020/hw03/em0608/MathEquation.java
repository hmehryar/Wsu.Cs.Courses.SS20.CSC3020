package csc3020.hw03.em0608;

public class MathEquation {

    private double leftValue;
    private double rightValue;
    private char character;
    private double results;


    //getters and setters
    public double getResults() {
        execute();
        return results;
    }


    //constructor - chain them together
    public MathEquation(){}

    // Constructor to Call leftValue
    private MathEquation(double leftValue){
        this();
        this.leftValue = leftValue;
    }

    // Constructor to Call leftValue and rightValue
    private MathEquation(double leftValue, double rightValue){
        this(leftValue);
        this.rightValue = rightValue;
    }

    //Constructor to Call Left, Right and Operations
    public MathEquation(double leftValue, double rightValue, char opCode){
        this(leftValue, rightValue);
        this.character = opCode;
    }


    public void execute() {
        switch (character) {

            //Prints the addition result
            case 'a':
                results = leftValue + rightValue;
                break;

            //Prints the subtraction result
            case 's':
                results = leftValue - rightValue;
                break;

            //Prints the division result
            case 'd':

                if (rightValue != 0)
                    results = leftValue / rightValue;
                else
                    return;
                break;

            //Prints the multiplication result
            case 'm':
                results = leftValue * rightValue;
                break;

            //Prints if the code has an error
            default:
                System.out.println("Code Error. Please try again");
        }


    }


}
