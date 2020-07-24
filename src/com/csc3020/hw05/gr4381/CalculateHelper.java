package csc3020.hw05.gr4381;

public class CalculateHelper {
    private double leftValue, rightValue, result;
    private MathCommand command;
    private CalculateBase calculator;

    public void process(String input){
        String[] parts = input.split(" ");
        leftValue = Double.parseDouble(parts[1]);
        rightValue = Double.parseDouble(parts[2]);
        switch (parts[0].toLowerCase()){
            case "add":
                command = MathCommand.Add;
                calculator = new Adder(leftValue, rightValue);
                break;
            case "subtract":
                command = MathCommand.Subtract;
                calculator = new Subtractor(leftValue, rightValue);
                break;
            case "multiply":
                command = MathCommand.Multiply;
                calculator = new Multiplier(leftValue, rightValue);
                break;
            case "divide":
                command = MathCommand.Divide;
                calculator = new Divider(leftValue, rightValue);
                break;
            default:
                System.out.println("Error: Invalid operator input!");
        }

        result = calculator.getResult();
    }

    @Override
    public String toString() {
        String fullEquation = String.valueOf(leftValue) + " ";
        switch (command){
            case Add:
                fullEquation += "+";
                break;
            case Subtract:
                fullEquation += "-";
                break;
            case Multiply:
                fullEquation += "*";
                break;
            case Divide:
                fullEquation += "/";
                break;
            default:
                System.out.println("Error: Invalid operator!");
        }
        fullEquation += " " + String.valueOf(rightValue) + " = " + String.valueOf(result);
        return fullEquation;
    }
}
