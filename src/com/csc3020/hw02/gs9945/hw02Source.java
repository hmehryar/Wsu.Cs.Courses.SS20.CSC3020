package com.csc3020.hw02.gs9945;

public class hw02Source {
    public static void main(String[] args) {

        System.out.println("");
        System.out.println("Kristopher Covert's New And Improved Calculator Machine");

        char signs[] = new char[4];
        signs[0] = '+';
        signs[1] = '-';
        signs[2] = '*';
        signs[3] = '/';

        MathEquation equationObjs[] = new MathEquation[4];

        for (int i = 0; i < 4; i++) {
            equationObjs[i] = create(5,2,signs[i]);
            equationObjs[i].execute();
        }
    }

    public static MathEquation create(int val1, int val2, char op){
        MathEquation newObj = new MathEquation(val1, val2, op);
        return newObj;
    }
}
