/**
 * Author:   Luke Belinc
 * AccessID: ev2601
 * Course:   CSC3020
 * Title:    Homework 02
 * Due Date: May 29, 2020
 */

package csc3020.hw02.ev2601; // package info

import java.text.DecimalFormat; // used in calculate and printOperands
import csc3020.hw02.ev2601.MathFunction;

/* begin class */
public class Hw02Source {

    /* main function */
    public static void main(String[] args) {

        /* operands */
        double[] lOperands = {100,25,225,11}; // left values
        double[] rOperands = {50,92,17,3};    // right values

        /* operation codes */
        char[] opCodes = {'a','s','m','d'};

        MathFunction math = new MathFunction(lOperands, rOperands);

        /* begin printing inputs (i.e. operands) */
        System.out.println();
        System.out.println("INPUTS");
        System.out.println("------");
        printOperands(lOperands, 'l'); // print left values
        printOperands(rOperands, 'r'); // print right values

        /* begin calculating and printing outputs */
        System.out.println();
        System.out.println("OUTPUTS");
        System.out.println("-------");

        for (char op : opCodes) { // enter loop to iterate over opCodes
            printOperation(op);   // print operation name
            math.setOpCode(op);   // set opCode
            math.execute();       // execure operation
            System.out.println(); // end with a line break for easier readbility
        }

    }

    /* print out current operation determined by opCode */
    /* separated from main for readability */
    private static void printOperation(char opCode) {
        switch (opCode) { // switch for printing current operation
            case 'a':
                System.out.print("addition:       ");
                break;
            case 's':
                System.out.print("subtraction:    ");
                break;
            case 'm':
                System.out.print("multiplication: ");
                break;
            case 'd':
                System.out.print("division:       ");
                break;
            default:
                System.out.print("Error: invalid opCode '" + opCode + "'");
                break;
        }
    }

    /* function for looping over lOperands and rOperands and printing their contents */
    private static void printOperands(double[] operands, char side) {

        /* number formatting object, used in system print function */
        DecimalFormat ft = new DecimalFormat("#.###");

        System.out.print((side == 'l') ? "left values:\t" : "right values:\t");
        for (double num : operands) {
            System.out.print(ft.format(num) + "\t");
        }
        System.out.println();

    }
}
