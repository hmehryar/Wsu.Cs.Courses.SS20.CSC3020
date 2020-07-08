package com.csc3020.hw03.gl1193;

public class Hw03Source {
    //private double getResults;

    public static MathEquation create(double l, double r,char opCodeX){
    return new MathEquation(l, r, opCodeX);
}
    public static void main(String[] args){

        MathEquation[] equations = {
                //equations[0] =
                new MathEquation(100, 50, 'd'),
        //equations[1] =
                new MathEquation(25, 92, 'a'),
        //equations[2] =
                new MathEquation(225,17,'s'),
        //equations[3] =
                new MathEquation(11,3,'m')

        };
        for (MathEquation e: equations){
          //  System.out.print("result: %.1f\n",e.execute());
            System.out.print("result: ");
            System.out.println(e.getResults);

        }

    }
}
