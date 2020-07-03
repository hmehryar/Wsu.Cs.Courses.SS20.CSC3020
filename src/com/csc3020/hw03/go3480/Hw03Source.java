package com.csc3020.hw03.go3480;

public class Hw03Source {
    public static void main(String[] args) {
        MathEquation[] equations = {
                new MathEquation(100, 50, 'd'),
                new MathEquation(25, 92, 'a'),
                new MathEquation(225, 17, 's'),
                new MathEquation(11, 3, 'm')
        };

        for (MathEquation equation: equations) {
            equation.execute();
            System.out.println("result="+equation.getResult());
        }
    }
}
