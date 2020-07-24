package csc3020.hw05.gr4381;
//
// Author: Matthew Martin
// Date: 2020-06-28
// Homework 05
//
public class Hw05Source {
    public static void main(String[] args) {
        String[] inputStrings = new String[]{"divide 100.0 50.0", "add 25.0 92.0", "subtract 225.0 17.0", "multiply 11.0 3.0"};

        CalculateHelper calcHelper = new CalculateHelper();
        for (String mathProblem:inputStrings) {
            calcHelper.process(mathProblem);
            System.out.println(calcHelper.toString());
        }
    }
}
