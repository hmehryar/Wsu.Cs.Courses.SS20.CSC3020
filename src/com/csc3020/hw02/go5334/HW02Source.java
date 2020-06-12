package com.csc3020.hw02.go5334;

public class HW02Source {
    public static void main(String[] args) {

        MathEquation operation[] = new MathEquation[4];
        operation[0] = new MathEquation('+');
        operation[1] = new MathEquation('-');
        operation[2] = new MathEquation('/');
        operation[3] = new MathEquation('*');

        for (int i = 0; i < operation.length; i++) {
            operation[i].execute();
        }
    }
}
