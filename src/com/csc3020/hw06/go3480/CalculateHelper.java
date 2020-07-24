package csc3020.hw06.go3480;

public class CalculateHelper {
    private double leftValue, rightValue, result;
    private MathCommand command;

    public void process(String equation) throws InvalidStatementException {
        String[] equationArr = equation.split(" ");

        if (equationArr.length < 3) {
            throw new InvalidStatementException("Incorrect number of fields", equation);
        }

        try {
            leftValue = Double.valueOf(equationArr[1]);
            rightValue = Double.valueOf(equationArr[2]);
        } catch (NumberFormatException e) {
            throw new InvalidStatementException("Non-numeric data", equation, e);
        }

        CalculateBase calculator = null;

        switch (equationArr[0]) {
            case "add":
                command = MathCommand.Add;
                calculator = new Adder(leftValue, rightValue);
                break;
            case "subtract":
                command = MathCommand.Subtract;
                calculator = new Subtractor(leftValue, rightValue);
                break;
            case "divide":
                command = MathCommand.Divide;
                calculator = new Divider(leftValue, rightValue);
                break;
            case "multiply":
                command = MathCommand.Multiply;
                calculator = new Multiplier(leftValue, rightValue);
                break;
            default:
                throw new InvalidStatementException("Invalid command", equation);
        }

        if (calculator != null) {
            calculator.calculate();
            result = calculator.getResult();
        }
    }

    @Override
    public String toString() {
        switch (command) { //breaks not needed since returns exist
            case Add:
                return leftValue+" + "+rightValue+" = "+result;
            case Subtract:
                return leftValue+" - "+rightValue+" = "+result;
            case Divide:
                return leftValue+" / "+rightValue+" = "+result;
            case Multiply:
                return leftValue+" * "+rightValue+" = "+result;
            default:
                return "Error: Invalid Arguments";
        }
    }
}
