package homework6.em0608;

public class CalculateHelper{
    double leftValue;
    double rightValue;
    double result;
    char operator;
    MathCommand command;


    public void process(String input) throws InvalidStatementException {

        String[] parts = input.split(" ");
        if(parts.length != 3){
            throw new InvalidStatementException("Invalid number of parts", input);
        }

        try{
            leftValue = Double.parseDouble(parts[1]);
            rightValue = Double.parseDouble(parts[2]);
        }catch (NumberFormatException exception){
            throw new InvalidStatementException("Non-numeric data", input, exception);
        }

        try{
            command = Enum.valueOf(MathCommand.class, parts[0]);
        }catch (IllegalArgumentException exception){
            throw new InvalidStatementException("Invalid command", input);
        }


            if (command == MathCommand.divide) {

                Divider divider = new Divider(leftValue, rightValue);
                operator = '/';
                divider.calculate();
                result = divider.getResult();
            } else if (command == MathCommand.add) {
                Adder adder = new Adder(leftValue, rightValue);
                operator = '+';
                adder.calculate();
                result = adder.getResult();
            } else if (command == MathCommand.subtract) {
                Subtractor subtractor = new Subtractor(leftValue, rightValue);
                operator = '-';
                subtractor.calculate();
                result = subtractor.getResult();
            } else if (command == MathCommand.multiply) {
                Multiplier multiplier = new Multiplier(leftValue, rightValue);
                operator = '*';
                multiplier.calculate();
                result = multiplier.getResult();
            }

        }


    @Override
    public String toString() {
        return
                " " + leftValue + " " + operator +
                " " + rightValue +
                " = " + result;
    }
}

