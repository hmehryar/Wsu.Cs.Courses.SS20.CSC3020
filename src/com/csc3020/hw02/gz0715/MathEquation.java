package com.csc3020.hw02.gz0715;

public class MathEquation {
    // Variables
    public float left;
    public float right;
    public char opCode;
    public double result;

    // Constructors
    public MathEquation(float left, float right, char opCode) {
        this.left = left;
        this.right = right;
        this.opCode = opCode;
    }

    // Functions
    public double execute() {
        switch (opCode) {
            case 'a' -> { // addition
                result = left + right;
            }
            case 's' -> { // subtraction
                result = left - right;
            }
            case 'm' -> { // multiplication
                result = left * right;
            }
            case 'd' -> { // division
                result = left / right;
            }
            default -> System.out.println("ERROR: Invalid opCode!");
        }
        return result;
    }
}
