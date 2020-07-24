package com.csc3020.hw05.go5621;
//*
// Author: Patricia Liu
// Homework 5: CalculateHelper
// */
public class CalculateHelper {
    double leftValue;
    double rightValue;
    double result;
    MathCommand command;

    public CalculateHelper () {

    }

    public void process(String operations) {
        String[] opArray = operations.split(" ");
        setCommand(opArray[0]);
        leftValue = Double.valueOf(opArray[1]);
        rightValue = Double.valueOf(opArray[2]);

        CalculateBase oCalculateBase = null;
        switch(command) {
            case Add:
                oCalculateBase = new Adder(leftValue, rightValue);
                break;
            case Subtract:
                oCalculateBase = new Subtractor(leftValue, rightValue);
                break;
            case Divide:
                oCalculateBase = new Divider(leftValue, rightValue);
                break;
            case Multiply:
                oCalculateBase = new Multiplier(leftValue, rightValue);
                break;
            default:
                System.out.println("Could not create CalculateBase object");
                break;
        }
        try {
            oCalculateBase.calculate();
            result = oCalculateBase.getResult();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    @Override
    public String toString() {
        return leftValue + " " + commandToString() + " " +rightValue + " = " + result;
    }

    private String commandToString() {
        switch(command) {
            case Add:
                return "+";
            case Subtract:
                return "-";
            case Divide:
                return "/";
            case Multiply:
                return "*";
            default:
                return "";
        }
    }

    private void setCommand(String op) {
        switch(op) {
            case "add":
                command = MathCommand.Add;
                break;
            case "subtract":
                command = MathCommand.Subtract;
                break;
            case "divide":
                command = MathCommand.Divide;
                break;
            case "multiply":
                command = MathCommand.Multiply;
                break;
            default:
                System.out.println("Invalid Operation");
                break;
        }
    }
}
