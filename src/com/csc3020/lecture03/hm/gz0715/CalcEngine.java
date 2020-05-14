package com.csc3020.lecture03.hm.gz0715;

public class CalcEngine {
    public static void main(String[] args) {
        int val1 = 5, val2 = 3;
        char operator = 'd'; // can be a, s, m, or d
        double result = 0;

        if (operator == 'a')
            result = val1 + val2;
        else if (operator == 's')
            result = val1 - val2;
        else if (operator == 'm')
            result = val1 * val2;
        else if (operator == 'd')
            result = (double) val1 / val2;
        else
            System.out.println("Invalid Operation");

        System.out.println(result);
    }
}
