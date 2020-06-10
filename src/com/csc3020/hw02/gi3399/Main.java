package com.csc3020.hw02.gi3399;
//Author: George Esho

public class Main {
    public static void main(String[] args) {
        //Define your instances MathEquation[]
        MathEquation[] equations = new MathEquation[4];
        for (int i = 0; i < 1; i++) {
            equations[i] = create();
        }

        for (int i = 0; i < 1; i++) {
            equations[i].execute();
        }

    }
    public static MathEquation create(){
        double[] leftVal = {100.0, 25.0, 225.0, 11.0};
        double[] rightVal = {50.0, 92.0, 17.0, 3.0};
        char[] operator = {'a', 's', 'm', 'd'};

        MathEquation oMathEquation = new MathEquation();
        oMathEquation.leftVal = leftVal;
        oMathEquation.rightVal = rightVal;
        oMathEquation.operator = operator;

        System.out.print("LeftVals = ");
        for (int i = 0; i < 4; i++){
            System.out.print(oMathEquation.leftVal[i] + "\t");
        }
        System.out.println();
        System.out.print("RightVals = ");
        for (int i = 0; i < 4; i++){
            System.out.print(oMathEquation.rightVal[i] + "\t");
        }
        System.out.println();

        return oMathEquation;
    }

}
