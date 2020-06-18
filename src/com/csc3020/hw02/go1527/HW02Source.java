package com.csc3020.hw02.go1527;

public class HW02Source {

    public static MathEquation create(MathEquation equation)
    {
        equation.execute();
        return equation;
    }

    public static void main(String[] args) {

        MathEquation equations[]=new MathEquation[4];
        equations[0] = new MathEquation('a');
        equations[1] = new MathEquation('s');
        equations[2] = new MathEquation('m');
        equations[3] = new MathEquation('d');

        for(int i=0;i<equations.length;i++)
        {
            create(equations[i]);
        }

    }

}