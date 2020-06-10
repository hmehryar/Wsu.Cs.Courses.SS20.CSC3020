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
    public double[] lOperands;
    public double[] rOperands;

    // constructor
    MathFunction(double[] lOps, double[] rOps) {
        create(lOps, rOps);
    }

    public void create(double[] leftOps, double[] rightOps) {
        this.lOperands = leftOps;
        this.rOperands = rightOps;
    }

    public void setOpCode(char opCode) {
        this.opCode = opCode;
    }

    public void execute() {
        /* number formatting object, used in system print function */
        DecimalFormat ft = new DecimalFormat("#.###");

        for (int i = 0; i < 4; i++) {
            /* switch for determining current operation */
            switch (this.opCode) {
                case 'a':
                    System.out.print(ft.format(this.lOperands[i] + this.rOperands[i]) + "\t");
                    break;
                case 's':
                    System.out.print(ft.format(this.lOperands[i] - this.rOperands[i]) + "\t");
                    break;
                case 'm':
                    System.out.print(ft.format(this.lOperands[i] * this.rOperands[i]) + "\t");
                    break;
                case 'd':
                    System.out.print(ft.format(this.lOperands[i] / this.rOperands[i]) + "\t");
                    break;
                default:
                    System.out.print("Error: invalid opCode '" + this.opCode + "'");
                    break;
            }
        }
    }
}