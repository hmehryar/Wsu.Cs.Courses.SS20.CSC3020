package com.csc3020.hw5.em0608;

public class Divider extends CalculateBase {
    double quotient;


    public Divider(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }


    @Override
    public void calculate() {
       try{
            setResult(leftVal / rightVal);
        }catch (ArithmeticException arithmeticException){
           System.out.println("Divide by Zero Error");

    }

    }
}