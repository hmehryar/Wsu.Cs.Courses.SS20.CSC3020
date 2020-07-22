package com.csc3020.hw05.gv7006;

public class Hw05Source {
    public static void main(String[] args) {
        String[] commands = {
            "divide 100.0 50.0",
            "add 25.0 92.0",
            "subtract 225.0 17.0",
            "multiply 11.0 3.0"
        };

        for (String c : commands) {
            CalculateHelper calculateHelper = new CalculateHelper();
            calculateHelper.process(c);
            System.out.println(calculateHelper);
        }
    }
}
