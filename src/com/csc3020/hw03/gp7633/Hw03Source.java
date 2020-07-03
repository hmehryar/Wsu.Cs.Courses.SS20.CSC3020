package csc3020.hw03.gp7633;

public class Hw03Source {
    public static void main(String[] args) {

        // Operations
        MathEquation division = new MathEquation(100, 50, '/');
        MathEquation addition = new MathEquation(25, 92, '+');
        MathEquation subtraction = new MathEquation(225, 17, '-');
        MathEquation multiplication = new MathEquation(11, 3, '*');

        division.execute();
        addition.execute();
        subtraction.execute();
        multiplication.execute();
    }
}
