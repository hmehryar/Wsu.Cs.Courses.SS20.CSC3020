package com.csc3020.hw06.gv7006;

public class Hw06Source {
    public static void main(String[] args) {
        String[] commands = {
            "add 1.0",
            "add xx 25.0",
            "addX 0.0 0.0",
            "divide 100.0 50.0",
            "add 25.0 92.0",
            "subtract 225.0 17.0",
            "multiply 11.0 3.0"
        };

        for (String c : commands) {
            CalculateHelper calculateHelper = new CalculateHelper();
            try {
                calculateHelper.process(c);
                System.out.println(calculateHelper);
            } catch (InvalidStatementException e) {
                System.err.println(e.getMessage());
                if (e.getCause() != null)
                    System.err.println(String.format("\tOriginal message: %s", e.getCause().getMessage()));
            }
        }
    }
}
