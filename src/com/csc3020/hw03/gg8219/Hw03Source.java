package com.csc3020.hw03.gg8219;

public class Hw03Source {
    public static void main(String[] args) {
        //using MathEquation class constructor
        //Define Your instances MathEquation
        MathEquation equations[]=new MathEquation[4];

        //Implement 4 operations

        //Inputs:
        //Division: 100, 50
        //Addition: 25, 92
        //Subtraction: 225, 17
        //Multiplication: 11, 3
        equations[0] = new MathEquation(100d,50d,'/');
        equations[1] = new MathEquation(25d,92d,'+');
        equations[2] = new MathEquation(225d,17d,'-');
        equations[3] = new MathEquation(11d,3d,'*');

        //Loop
        for(int i=0;i<equations.length;i++) {
            equations[i].execute();
        }
    }
}
