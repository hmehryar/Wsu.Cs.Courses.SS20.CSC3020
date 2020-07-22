package csc3020.hw02.gp7633;

public class MathEquation {
    private char character;
    private double v1[];
    private double v2[];
    private double temp1;
    private double temp2;

    public MathEquation(double[] var1, double[] var2, char c) {
        v1 = var1;
        v2 = var2;
        character = c;
    }

    public double addition(double temp1, double temp2) {
        return temp1 + temp2;
    }
    public double subtraction(double temp1, double temp2) {
        return temp1 - temp2;
    }
    public double multiplication(double temp1, double temp2) {
        return temp1 * temp2;
    }
    public double division(double temp1, double temp2) {
        return temp1 / temp2;
    }

    void execute() {
        if (character == '+') {
            System.out.println(" ");
            System.out.print("Addition: ");
            for (int i = 0; i < 4; i++) {
                System.out.print(String.format("%.2f", addition(v1[i], v2[i])) + "    ");
            }
        }
        else if (character == '-') {
            System.out.println(" ");
            System.out.print("Subtraction: ");
            for (int i = 0; i < 4; i++) {
                System.out.print(String.format("%.2f", subtraction(v1[i], v2[i])) + "    ");
            }
        }
        else if (character == '*') {
            System.out.println(" ");
            System.out.print("Multiplication: ");
            for (int i = 0; i < 4; i++) {
                System.out.print(String.format("%.2f", multiplication(v1[i], v2[i])) + "    ");
            }
        }
        else {
            System.out.println(" ");
            System.out.print("Division: ");
            for (int i = 0; i < 4; i++) {
                System.out.print(String.format("%.2f", division(v1[i], v2[i])) + "    ");
            }
        }
    }
}
