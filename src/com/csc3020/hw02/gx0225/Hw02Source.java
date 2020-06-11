package com.csc3020.hw02.gx0225;

public class Hw02Source {
    public static void main(String[] args) {
        //initialize values
        double[] leftVal = {100.0, 25.0, 225.0, 11.0};
        double[] rightVal = {50.0, 92.0, 17.0, 3.0};
        char[] operator = {'a','b','c','d'};

        //print out leftVal and rightVal array
        System.out.print("LeftVals = ");
        for (int i = 0; i < leftVal.length; i++){
            System.out.print(leftVal[i] + " ");

        }
        System.out.print("\nRightVals = ");
        for (int i = 0; i < rightVal.length; i++){
            System.out.print(rightVal[i] + " ");
        }

        //define equation array
        MathEquation equation[]=new MathEquation[operator.length];
        try{
            for (int j=0; j < operator.length;j++){
                equation[j]=create(leftVal,rightVal,operator[j]);
            }

            for (int i=0; i < equation.length; i++){
                equation[i].execute();//called execute method
            }
        }
        catch (Exception x){
            System.out.println(x);
        }

    }
    public static MathEquation create(double[] l, double[] r, char o){
        MathEquation oMathEquation=new MathEquation();
        oMathEquation.setLeftVal(l);
        oMathEquation.setRightVal(r);
        oMathEquation.setOpCode(o);
        return oMathEquation;
    }
}
