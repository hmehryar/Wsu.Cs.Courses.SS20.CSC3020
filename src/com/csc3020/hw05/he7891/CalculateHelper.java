package csc3020.hw05.he7891;
/*
 * Author: Nathan Tattrie
 * Student ID: he7891
 * Homework Assignment 05
 * CalculateHelper.java
 * */


import java.io.IOException;

public class CalculateHelper {

    // Required Item Step 3
    // PROPERTIES
    private double leftValue;
    private double rightValue;
    private double result;
    private MathCommand mathType;

    // Required Item Step 4, 5 and 6
    void process(String str) {
        int firstSpace = 0;
        int secondSpace = 0;

        try {
            if (str.charAt(0) == 'd') {
                mathType = MathCommand.Divide;
            }
            else if (str.charAt(0) == 'a') {
                mathType = MathCommand.Add;
            }
            else if (str.charAt(0) == 's') {
                mathType = MathCommand.Subtract;
            }
            else if (str.charAt(0) == 'm') {
                mathType = MathCommand.Multiply;
            }

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ') {
                    if (firstSpace > 0) {
                        secondSpace = i;
                    } else {
                        firstSpace = i;
                    }
                }
            }
            leftValue = Double.parseDouble(str.substring(firstSpace+1, secondSpace));
            rightValue = Double.parseDouble(str.substring(secondSpace+1, str.length()));

            if (mathType == MathCommand.Add) {
                Adder oAdder = new Adder();
                oAdder.calculate(leftValue, rightValue);
                result = oAdder.getResult();
            }
            else if (mathType == MathCommand.Subtract) {
                Subtractor oSubtractor = new Subtractor();
                oSubtractor.calculate(leftValue, rightValue);
                result = oSubtractor.getResult();
            }
            else if (mathType == MathCommand.Multiply) {
                Multiplier oMultiplier = new Multiplier();
                oMultiplier.calculate(leftValue, rightValue);
                result = oMultiplier.getResult();
            }
            else if (mathType == MathCommand.Divide) {
                Divider oDivider = new Divider();
                oDivider.calculate(leftValue, rightValue);
                result = oDivider.getResult();
            }
            else {
                System.out.println("ERROR: Invalid MathCommand");
            }
        }
        catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    // Required Item Step 7
    @Override
    public String toString() {
        String oper = "0";
        try {
            if (mathType == MathCommand.Add) {
                oper = " + ";
            }
            else if (mathType == MathCommand.Subtract) {
                oper = " - ";
            }
            else if (mathType == MathCommand.Multiply) {
                oper = " * ";
            }
            else if (mathType == MathCommand.Divide) {
                oper = " / ";
            }
        }
        catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return  leftValue + oper + rightValue + " = " + result;
    }

}
