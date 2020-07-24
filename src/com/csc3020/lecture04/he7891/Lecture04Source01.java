package csc3020.lecture04.he7891;
// *
// Author: Nathan Tattrie
// Student ID: he7891
// Lecture04
// *

/* Arrays
* ~ Provides an ordered collection of elements
* ~~ Each element accessed via an index
* ~~ Indexes range from 0 to number-of-elements minus 1
* ~~ Number of elements can be found via array's length value
*
* */

/* For-each Loop
* ~ Executes a statement oce for each member in an array
* ~~ Handles getting collection length
* ~~ Handles accessing each value
* */

/* Switch
* ~ Transfers control to a statement based on a value
* ~~ Simplifies testing against multiple possible matches
* ~~ Only primitive types supported are char and integers
* ~~ A match can execute more than one statement
* ~~ Use break to avoid "falling through"
* ~~ Can optionally include default to handle any unmatched values
* */

// Summary
/*
 * Use the if-else statement to provide conditional logic
 * ~ If-else statements can be chained together
 * Block statements use brackets to group statements
 * ~ Variables declared within a block are not visible outside of the block
 * Both while an d do-while loops execute as long as a condition is true
 * ~ The do-while loop body always executes at least once
 * The for loop provides simplified notation for loop initialization and control
 * For-each statement handles details of executing once for each array member
 * Switch statements.......
 * */

public class Lecture04Source01 {
    public static void main(String[] args) {
        // Second commit and push attempt
        System.out.println("he7891: Nate Tattrie");

        // While loop
        System.out.println("While loop");
        int iVal = 1;
        while (iVal < 100) {
            System.out.println(iVal);
            iVal *= 2;
        }

        // For loop
        System.out.println("For loop");
        for (int i = 1; i < 100; i *= 2) {
            System.out.println(i);
        }

        // Arrays
        // Initialize array by assigning value by index
        float[] theVals = new float[3];
        theVals[0] = 10.0f;
        theVals[1] = 20.0f;
        theVals[2] = 15.0f;

        // Initialize array where number of elements are ordered
        // is the array's size
        System.out.println("For Loop");
        float[] otherVals = { 10.0f, 20.0f, 15.0f };
        float sum = 0.0f;
        for (int index = 0; index < otherVals.length; index++) {
            sum += otherVals[index];
        }
        System.out.println(sum);


        // For-each loop
        System.out.println("For-each Loop");
        sum = 0.0f;
        for(float val:theVals) {
            sum += val;
        }
        System.out.println(sum);

        // Switch
        System.out.println("Switch");
        iVal = 20;
        switch(iVal % 2) {
            case 0:
                System.out.print(iVal);
                System.out.println(" is even");
                break;
            case 1:
                System.out.print(iVal);
                System.out.println(" is odd");
                break;
            default:
                System.out.print("OPE. That wasn't right. None of the conditions happened.");
        }

    }
}
