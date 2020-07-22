package com.csc3020.hw06.gi3399;

public class CalculateHelper {
    double leftValue;
    double rightValue;
    double result;
    MathCommand command;

    @Override
    public String toString() {
        if (command == MathCommand.Add)
            return leftValue + " + " + rightValue + " = " + result;
        else if (command == MathCommand.Subtract)
            return leftValue + " - " + rightValue + " = " + result;
        else if (command == MathCommand.Multiply)
            return leftValue + " * " + rightValue + " = " + result;
        else if (command == MathCommand.Divide)
            return leftValue + " / " + rightValue + " = " + result;
        else
            return null;
    }

    public void process(String input) throws InvalidStatementException {
        try {
            String[] part = input.split(" ");
            String op = part[0];
            leftValue = Double.parseDouble(part[1]);
            rightValue = Double.parseDouble(part[2]);

            switch (op) {
                case "add":
                    command = MathCommand.Add;
                    Adder adder = new Adder(leftValue, rightValue);
                    adder.calculate();
                    result = adder.getResult();
                    break;
                case "subtract":
                    command = MathCommand.Subtract;
                    Subtractor subtractor = new Subtractor(leftValue, rightValue);
                    subtractor.calculate();
                    result = subtractor.getResult();
                    break;
                case "multiply":
                    command = MathCommand.Multiply;
                    Multiplier multiplier = new Multiplier(leftValue, rightValue);
                    multiplier.calculate();
                    result = multiplier.getResult();
                    break;
                case "divide":
                    command = MathCommand.Divide;
                    Divider divider = new Divider(leftValue, rightValue);
                    divider.calculate();
                    result = divider.getResult();
                    break;
                default:
                    throw new InvalidStatementException("Invalid command", input);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new InvalidStatementException("Incorrect number of fields", input, e);
        } catch (NumberFormatException e) {
            throw new InvalidStatementException("Non-numeric data", input, e);
        }
    }
}