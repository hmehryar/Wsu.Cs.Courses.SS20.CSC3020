package csc3020.hw05.go3480;

public class CalculateHelper {
    private double leftValue, rightValue, result;
    private MathCommand command;

    public void process(String equation) {
        String[] equationArr = equation.split(" ");

        leftValue = Double.valueOf(equationArr[1]);
        rightValue = Double.valueOf(equationArr[2]);

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
                System.out.println("Error: Invalid Arguments!");
                break;
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
