package csc3020.hw05.gn8271;
// Homework 05
// Author: Raisa Zaman
public class CalculateHelper {
    double leftValue;
    double rightValue;
    double result;
    MathCommand command;

    public void process (String val) {
        String [] stringSplit = val.split(" ");
        String operation = stringSplit[0];
        leftValue = Double.parseDouble(stringSplit[1]);
        rightValue = Double.parseDouble(stringSplit[2]);

        switch (operation){
            case "divide":
                command = MathCommand.Divide;
                break;
            case "add":
                command = MathCommand.Add;
                break;
            case "subtract":
                command = MathCommand.Subtract;
                break;
            case "multiply":
                command = MathCommand.Multiply;
                break;
        }

        if (command == MathCommand.Divide)
        {
            Divider divide = new Divider (leftValue,rightValue);
            divide.calculate();
            result = divide.getResult();

        }
        else if (command == MathCommand.Multiply)
        {
            Multiplier multiply = new Multiplier(leftValue,rightValue);
            multiply.calculate();
            result = multiply.getResult();
        }
        else if (command == MathCommand.Add)
        {
            Adder add = new Adder(leftValue,rightValue);
            add.calculate();
            result = add.getResult();
        }
        else if (command == MathCommand.Subtract)
        {
            Subtracter subtract = new Subtracter (leftValue,rightValue);
            subtract.calculate();
            result = subtract.getResult();
        }

    }
    @Override
    public String toString() {
        if(command == MathCommand.Divide)
            return  leftValue + " / " + rightValue + " = " + result;
        else if(command == MathCommand.Multiply)
            return  leftValue + " * " + rightValue + " = " + result;
        else if(command == MathCommand.Add)
            return  leftValue + " + " + rightValue + " = " + result;
        else if(command == MathCommand.Subtract)
            return  leftValue + " - " + rightValue + " = " + result;
        else
            return "Error: The operation is invalid.";

    }

}
