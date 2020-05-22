/**
 * Author: Luke Belinc
 * Date: May 12, 2019
 * Title: Lecture 3 Lab
 */

package csc3020.lecture03.ev2601;

public class CalculatorEngine {
    public static void main(String[] args) {
        float val1 = 14,
              val2 = 17;
        
        char opCode = 'a';

        switch (opCode) {
            case 'a':
                System.out.println(val1+val2);
                break;
            case 's':
                System.out.println(val1-val2);
                break;
            case 'm':
                System.out.println(val1*val2);
                break;
            case 'd':
                System.out.println(val1/val2);
                break;
            default:
                System.out.println("Error: invalid opCode \'" + opCode + "\'");
                break;
        }
    }

}    
