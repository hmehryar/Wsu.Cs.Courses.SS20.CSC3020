package com.csc3020.hw02.go3480;

public class Hw02Source {
    public static void main(String[] args) {
        MathEquation[] equations = {new MathEquation('a'), new MathEquation('s'),
                new MathEquation('d'), new MathEquation('m'),};

        // added this part to make the output look like the Hw01
        System.out.print("LeftVals=");
        for (double val : equations[0].leftVals) {
            System.out.print(val + "\t");
        }

        System.out.print("\nRightVals=");
        for (double val : equations[0].rightVals) {
            System.out.print(val + "\t");
        }
        // ------------------------------------------------------

        for (int i = 0; i < equations.length; i++) {
            create(equations[i]);
            for (double result : equations[i].results) {
                System.out.print(result+"\t");
            }
        }
    }

    public static MathEquation create(MathEquation equation) {
        equation.execute();

        return equation;
    }
}
