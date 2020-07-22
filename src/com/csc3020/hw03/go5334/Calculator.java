package com.csc3020.hw03.go5334;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Input : ");
        MathEquation operations[]=new MathEquation[4];
        operations[0] = new MathEquation(100,50,'/');
        operations[1] = new MathEquation(25,92,'+');
        operations[2] = new MathEquation(225,17,'-');
        operations[3] = new MathEquation(11,3,'*');

        System.out.println();
        System.out.println("Output : ");
        for(int i=0;i<operations.length;i++) {
            operations[i].execute();
        }
    }
}