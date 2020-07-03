package com.csc3020.hw03.gs9945;

import java.util.function.DoubleToIntFunction;

public class hw03Source {

    public static void main(String[] args) {
        char signs[] = {'+','-','*','/'};
        System.out.println("");
        System.out.println("Kristopher Covert's New And Improved Calculator Machine");

        //DEFAULT CONSTRUCTOR IMPLEMENTATION - ADDITION
        MathEquation ME1 = new MathEquation();
        ME1.setNumbers(10,5);
        ME1.setOperation(signs[0]);
        ME1.execute();

        //SECOND CONSTRUCTOR IMPLEMENTATION - SUBTRACTION
        MathEquation ME2 = new MathEquation(signs[1]);
        ME2.setNumbers(20,12);
        ME2.execute();

        //THIRD CONSTRUCTOR IMPLEMENTATION - MULTIPLICATION
        MathEquation ME3 = new MathEquation(4,9);
        ME3.setOperation(signs[2]);
        ME3.execute();

        //FOURTH CONSTRUCTOR IMPLEMENTATION - DIVISION
        MathEquation ME4 = new MathEquation(100,4,signs[3]);
        ME4.execute();
    }
}
