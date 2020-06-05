/**
 * Author:   Luke Belinc
 * AccessID: ev2601
 * Course:   CSC3020
 * Title:    MathFunction
 * Due Date: May 29, 2020
 */

package csc3020.hw02.ev2601; // package info

import java.text.DecimalFormat; // used in calculate and printOperands

public class MathFunction {

    // public fields
    public char opCode;
    public double lOperand;
    public double rOperand;

    // constructor
    MathFunction(double lOp, double rOp, char opCode) {
        create(lOp, rOp, opCode);
    }

    public void create(double leftOp, double rightOp, char opCode) {
        this.opCode = opCode;
        this.lOperand = leftOp;
        this.rOperand = rightOp;
    }

    public void execute() {
        /* number formatting object, used in system print function */
        DecimalFormat ft = new DecimalFormat("#.###");

        /* switch for determining current operation */
        switch (this.opCode) {
            case 'a':
                System.out.print(ft.format(this.lOperand + this.rOperand) + "\t");
                break;
            case 's':
                System.out.print(ft.format(this.lOperand - this.rOperand) + "\t");
                break;
            case 'm':
                System.out.print(ft.format(this.lOperand * this.rOperand) + "\t");
                break;
            case 'd':
                System.out.print(ft.format(this.lOperand / this.rOperand) + "\t");
                break;
            default:
                System.out.print("Error: invalid opCode '" + this.opCode + "'");
                break;
        }
    }
}