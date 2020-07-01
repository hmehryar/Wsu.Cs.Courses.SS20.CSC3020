package csc3020.hw03.gp7633;

public class MathEquation {
    private char character;
    private double v1;
    private double v2;
    private double temp1;
    private double temp2;

    public MathEquation(double var1, double var2, char c) {
        setVar1(var1);
        setVar2(var2);
        setChar(c);
    }

    private MathEquation(char c) {
        setChar(c);
        setVar1(1);
        setVar2(1);
    }

    // Chaining
    public MathEquation() {
        this('+');
    }

    public double addition() {
        return getVar1() + getVar2();
    }
    public double subtraction() {
        return getVar1() - getVar2();
    }
    public double multiplication() {
        return getVar1() * getVar2();
    }
    public double division() {
        return getVar1() / getVar2();
    }

    // Accessor
    double getVar1 () {
        return v1;
    }

    // Accessor
    double getVar2 () {
        return v2;
    }

    // Accessor
    char getChar () {
        return character;
    }

    // Mutator
    private void setVar1 (double a) {
        v1 = a;
    }

    // Mutator
    private void setVar2 (double b) {
        v2 = b;
    }

    // Mutator
    private void setChar (char c) {
        character = c;
    }

    void execute() {
        if (character == '+') {
            System.out.println("result: " + String.format("%.1f", addition()));
        }
        else if (character == '-') {
            System.out.println("result: " + String.format("%.2f", subtraction()));
        }
        else if (character == '*') {
            System.out.println("result: " + String.format("%.2f", multiplication()));
        }
        else {
            System.out.println("result: " + String.format("%.2f", division()));
        }
    }
}
