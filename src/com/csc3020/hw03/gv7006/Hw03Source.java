package com.csc3020.hw03.gv7006;

public class Hw03Source {
    public static void main(String[] args) {
        MathEquation[] mathEqs = {
            new MathEquation(100, 50, '/'),
            new MathEquation(25, 92, '+'),
            new MathEquation(225, 17, '-'),
            new MathEquation(11, 3, '*')
        };
        
        for (MathEquation eq : mathEqs) {
            eq.execute();
            System.out.printf("result: %.1f\n", eq.getResult());
        }
    }
}
