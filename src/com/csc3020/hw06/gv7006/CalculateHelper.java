package com.csc3020.hw06.gv7006;

class CalculateHelper {
    private double leftVal;
    private double rightVal;
    private MathCommand command;
    private double result;

    public double getLeftVal() {
        return leftVal;
    }

    public void setLeftVal(double leftVal) {
        this.leftVal = leftVal;
    }

    public double getRightVal() {
        return rightVal;
    }

    public void setRightVal(double rightVal) {
        this.rightVal = rightVal;
    }

    public MathCommand getCommand() {
        return command;
    }

    public void setCommand(MathCommand command) {
        this.command = command;
    }

    public double getResult() {
        return result;
    }

    private void setResult(double result) {
        this.result = result;
    }

    private CalculateBase getCalculator() {
        return switch (command) {
            case ADD -> new Adder(leftVal, rightVal);
            case SUBTRACT -> new Subtractor(leftVal, rightVal);
            case MULTIPLY -> new Multiplier(leftVal, rightVal);
            case DIVIDE -> new Divider(leftVal, rightVal);
        };
    }

    public void process(String input) throws InvalidStatementException {
        String[] parts = input.split(" ");

        if (parts.length != 3) throw new InvalidStatementException("Incorrect number of fields", input);
        try {
            setCommand(MathCommand.valueOf(parts[0].toUpperCase()));
            setLeftVal(Double.parseDouble(parts[1]));
            setRightVal(Double.parseDouble(parts[2]));
        } catch (NumberFormatException e) {
            throw new InvalidStatementException("Non-numeric data", input, e);
        } catch (IllegalArgumentException e) {
            throw new InvalidStatementException("Invalid command", input, e);
        }

        CalculateBase calc = getCalculator();
        calc.calculate();
        setResult(calc.getResult());
    }

    @Override
    public String toString() {
        return String.format("%.1f %c %.1f = %.1f",
            leftVal,
            command.getOp(),
            rightVal,
            result
        );
    }
}
