package com.csc3020.hw03.gi3399;
//Author: George Esho
public class Hw03Source {
    public static void main(String[] args) {
        MathEquation addition = new MathEquation(25, 92, 'a');
        MathEquation subtraction = new MathEquation(225, 17, 's');
        MathEquation multiplication = new MathEquation(11, 3, 'm');
        MathEquation division = new MathEquation(100, 50, 'd');

        division.execute();
        addition.execute();
        subtraction.execute();
        multiplication.execute();

    }


}
