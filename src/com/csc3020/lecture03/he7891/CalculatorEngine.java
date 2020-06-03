package com.csc3020.lecture03.he7891;
// *
// Author: Nathan Tattrie
// Student ID: he7891
// Lecture03
// *

public class CalculatorEngine {
    // Calculator Engine Demo
    // Inputs: val1 and val 2
    // Character Operators: addition(a), subtraction(s), division(d) and multiplication(m)
    // Print result of each operation
    public static void main(String[] args) {
        float val1 = 5;
        float val2 = 4;
        char op = 'm';

        if (op == 'a') {
            System.out.println(val1 + val2);
        }
        else if (op == 's') {
            System.out.println(val1 - val2);
        }
        else if (op == 'd') {
            if (val2 == 0) {
                System.out.println("UNDEFINED!");
            } else {
                System.out.println(val1 / val2);
            }
        }
        else if (op == 'm') {
            System.out.println(val1 * val2);
        }
        else {
            System.out.println("Invalid Operator.");
        }
    }
}
