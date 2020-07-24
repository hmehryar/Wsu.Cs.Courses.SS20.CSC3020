package csc3020.hw06.he7891;
/*
 * Author: Nathan Tattrie
 * Student ID: he7891
 * Homework Assignment 06
 * CalculateHelper.java
 * */

import java.util.regex.PatternSyntaxException;

public class CalculateHelper {

    private double leftValue;
    private double rightValue;
    private double result;
    private MathCommand mathType;


    void process(String str) throws
            PatternSyntaxException, NullPointerException, NumberFormatException, ArrayIndexOutOfBoundsException {

        String[] parts = str.split(" ");
        String commandString = parts[0];
        leftValue = Double.parseDouble(parts[1]);
        rightValue = Double.parseDouble(parts[2]);
        setCommandFromString(commandString);

        switch (mathType){
            case Divide:
                Divider oDivider = new Divider();
                oDivider.calculate(leftValue, rightValue);
                result = oDivider.getResult();
                break;
            case Add:
                Adder oAdder = new Adder();
                oAdder.calculate(leftValue, rightValue);
                result = oAdder.getResult();
                break;
            case Subtract:
                Subtractor oSubtractor = new Subtractor();
                oSubtractor.calculate(leftValue, rightValue);
                result = oSubtractor.getResult();
                break;
            case Multiply:
                Multiplier oMultiplier = new Multiplier();
                oMultiplier.calculate(leftValue, rightValue);
                result = oMultiplier.getResult();
                break;
        }
    }


    private void setCommandFromString(String commandString){

        if(commandString.equalsIgnoreCase(MathCommand.Divide.toString())){
            mathType = MathCommand.Divide;
        }
        else if(commandString.equalsIgnoreCase(MathCommand.Add.toString())){
            mathType = MathCommand.Add;
        }
        else if (commandString.equalsIgnoreCase(MathCommand.Subtract.toString())){
            mathType = MathCommand.Subtract;
        }
        else if(commandString.equalsIgnoreCase(MathCommand.Multiply.toString())){
             mathType = MathCommand.Multiply;
        }

    }


    @Override
    public String toString() {
        char symbol='0';
        switch (mathType){
            case Divide:
                symbol = '/';
                break;
            case Add:
                symbol = '+';
                break;
            case Multiply:
                symbol = '*';
                break;
            case Subtract:
                symbol = '-';
                break;
        }

        StringBuilder oStringBuilder=new StringBuilder(20);
        oStringBuilder.append(leftValue);
        oStringBuilder.append(' ');
        oStringBuilder.append(symbol);
        oStringBuilder.append(' ');
        oStringBuilder.append(rightValue);
        oStringBuilder.append(" = ");
        oStringBuilder.append(result);
        return oStringBuilder.toString();
    }

}
