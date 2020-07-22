package com.csc3020.hw05.gv7006;

class CalculateHelper {
    private double leftVal;
    private double rightVal;
    private MathCommand op;
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

    public MathCommand getOp() {
        return op;
    }

    public void setOp(MathCommand op) {
        this.op = op;
    }

    public double getResult() {
        return result;
    }

    private void setResult(double result) {
        this.result = result;
    }

    private CalculateBase getCalculator() {
        return switch (op) {
            case ADD -> new Adder(leftVal, rightVal);
            case SUBTRACT -> new Subtractor(leftVal, rightVal);
            case MULTIPLY -> new Multiplier(leftVal, rightVal);
            case DIVIDE -> new Divider(leftVal, rightVal);
        };
    }

    public void process(String input) {
        String[] parts = input.split(" ");

        setOp(MathCommand.valueOf(parts[0].toUpperCase()));
        setLeftVal(Double.parseDouble(parts[1]));
        setRightVal(Double.parseDouble(parts[2]));

        CalculateBase calc = getCalculator();
        calc.calculate();
        setResult(calc.getResult());
    }

    @Override
    public String toString() {
        return String.format("%.1f %c %.1f = %.1f",
            leftVal,
            switch(op) {
                case ADD -> '+';
                case SUBTRACT -> '-';
                case MULTIPLY -> '*';
                case DIVIDE -> '/';
            },
            rightVal,
            result
        );
    }
}
