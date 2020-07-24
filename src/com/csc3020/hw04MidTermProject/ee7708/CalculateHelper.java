package csc3020.hw04MidTermProject.ee7708;

import java.util.ArrayList;

import static hw04MidTermProject.ee7708.MathCommand.*;

public class CalculateHelper {

    //VARIABLES
    private double leftValue;
    private double rightValue;
    private double result;
    private MathCommand command;

    //All accessors and mutators are private for use only within this class
    private double getLeftValue() { return leftValue; }
    private void setLeftValue(double leftValue) {
        this.leftValue = leftValue;
    }
    private double getRightValue() { return rightValue; }
    private void setRightValue(double rightValue) {
        this.rightValue = rightValue;
    }
    private void setCommand(MathCommand command) { this.command = command; }
    private double getResult() { return result; }
    private void setResult(double result) { this.result = result; }

    //This constructor sets the left, right value fields
    public CalculateHelper(String inputString) {
        process(inputString);
    }

    //Overriding the toString() method to print the Process method calculation result
    @Override
    public String toString(){

        //Implement/Override the toString method within the MathCommand Enum to show the equation operator
        return getLeftValue() + " " + command.toString() + " " + getRightValue() + " = " + getResult();
    }

    //Process method which processes the string input and creates a calculation output
    private void process(String input){

        //Break input string into white space delimited string array
        String[] splitInput = input.split("\\s+");

        //Set Left and Right Equation class properties
        setLeftValue(Double.parseDouble(splitInput[1]));
        setRightValue(Double.parseDouble(splitInput[2]));

        //Create List of CalculateBase class for derived class population
        var calculateBases = new ArrayList<CalculateBase>();

        //Switch on the string defined operator
        // Determine and set the MathCommand Enum Value
        //Populate the calculateBases list with the corresponding derived class
        switch (splitInput[0]) {
            case "add":
                setCommand(Add);
                calculateBases.add(new Adder(getLeftValue(),getRightValue()));
                break;
            case "subtract":
                setCommand(Subtract);
                calculateBases.add(new Subtractor(getLeftValue(), getRightValue()));
                break;
            case "multiply":
                setCommand(Multiply);
                calculateBases.add(new Multiplier(getLeftValue(), getRightValue()));
                break;
            case "divide":
                setCommand(Divide);
                calculateBases.add(new Divider(getLeftValue(), getRightValue()));
                break;
        }

        //Use the Calculate Method from the CalculateBase interface to calculate the result
        calculateBases.get(0).calculate();

        //Set the result into result property the the CalculateHelper class
        setResult(calculateBases.get(0).getResult());
    }
}
