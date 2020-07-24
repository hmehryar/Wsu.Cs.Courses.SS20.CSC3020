package csc3020.hw06.gr4381;
//
// Author: Matthew Martin
// Date: 2020-07-13
// Homework 06
//
public class Hw06Source {
    public static void main(String[] args) {
        String[] inputCommands = new String[]{
                "add 1.0",
                "add xx 25.0",
                "addX 0.0 0.0",
                "divide 100.0 50.0",
                "add 25.0 92.0",
                "subtract 225.0 17.0",
                "multiply 11.0 3.0"
        };

        CalculateHelper calcHelper = new CalculateHelper();
        for (String mathProblem : inputCommands) {
            try {
                calcHelper.process(mathProblem);
                System.out.println(calcHelper.toString());
            } catch (InvalidStatementException invalidStatementException) {
                System.out.println(invalidStatementException.getMessage());
            }
        }
    }
}
