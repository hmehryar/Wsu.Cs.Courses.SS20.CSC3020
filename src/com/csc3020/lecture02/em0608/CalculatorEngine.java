package com.csc3020.session02;

public class CalculatorEngine {
    public static void main(String[] args){
        // Input:
        //double var1, var2
        // char OpCode: a, s, m, d
        //Output: operation Result

        //Input
        double var1 = 10;
        double var2 = 2;
        char OpCode = 'd';

        //Output
        double result = 0;

        if(OpCode == 'a'){
             result = var1 + var2;
        }
        else if (OpCode == 's'){
             result = var1 - var2;
        }
        else if  (OpCode == 'm'){
             result = var1 * var2;
        }
        else if (OpCode == 'd'){
             result = var1 / var2;
        }
        else{
            System.out.println("Invalid Operation.");
        }
        System.out.println(result);
    }
}
