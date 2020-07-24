package csc3020.hw06.gr4381;

public class CalculateHelper {
    private double leftValue, rightValue, result;
    private MathCommand command;
    private CalculateBase calculator;

    public void process(String input) throws InvalidStatementException{
        String[] parts = input.split(" ");

        try{
            leftValue = Double.parseDouble(parts[1]);
        } catch(ArrayIndexOutOfBoundsException exception){
            throw new InvalidStatementException("Incorrect number of fields", input);
        } catch(NumberFormatException numberFormatException){
            throw new InvalidStatementException("Non-numeric data", input +
                    "\n  Original exception: For input string: \"" + parts[1] + "\"");
        }
        try{
            rightValue = Double.parseDouble(parts[2]);
        } catch(ArrayIndexOutOfBoundsException exception){
            throw new InvalidStatementException("Incorrect number of fields", input);
        } catch(NumberFormatException numberFormatException){
            throw new InvalidStatementException("Non-numeric data", input +
                    "\n  Original exception: For input string: \"" + parts[2] + "\"");
        }
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
//                System.out.println("Error: Invalid operator input!");
                throw new InvalidStatementException("Invalid command", input);
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
