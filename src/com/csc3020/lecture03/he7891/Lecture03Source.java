package csc3020.lecture03.he7891;
// *
// Author: Nathan Tattrie
// Student ID: he7891
// Lecture03
// *

public class Lecture03Source {

    /* Relational Operators
     * Greater Than:             >
     * Greater Than or Equal To: >=
     * Less Than:                <
     * Less Than or Equal To:    <=
     * Equal To:                 ==
     * Not Equal To:             !=
     * */

    /* Conditional Assignment
     * ~ Assign a value to a variable based on the result of a condition
     * ~ e.g.: result = condition ? true-value : false-value;
     * */

    /* If-Else Statements
     * ~ An If statement conditionally executes a statement
     * ~ The optional else clause executes a statement when the if condition is false
     * */

    /* Chaining if-else Statements
     * ~ If-else statements chained together are evaluated in order until one is true
     * */

    /* Block statement
     * ~ A block statement groups statements into a compound statement
     * */

    /* Block Statements and Variable Scope
     * ~ A variable declared within a block is not visible outside of the block
     * ~~ A Variable'es range of visibility is known as the variable's scope
     * */

    /* Logical Operators
     * ~ And:                  &, true & true resolves true
     * ~ Or:                   |, false | true, true | false, true | true resolves as true
     * ~ Exclusive Or (XOR):   ^, false ^ true, true ^ false resolves as true
     * ~ Negation:             !, false resolves as true
     * */

    /* Conditional Logical Operators
     * ~ Conditional And: &&, true && true resolves as true
     * ~ Conditional Or:  ||, false || true, true || -- resolves as true
     * ~ Resolve following conceptually similar rules as non-conditional and/or
     * ~ Only execute the right-side if needed to determine the result
     * ~~ && only executes right-side if left side is true
     * ~~ || only executes right side if needed to determine the result
     * */

    /* Loops
     * ~ While Loop: Repeatedly executes a statement as long as the condition is true
     * ~ Do-While Loop: Repeatedly executes a statement as long as the condition is true
     * ~~ Condition checked at loop end
     * ~~ Statement always executes at least once
     * */

    public static void main(String[] args) {
        int v1 = 7;
        int v2 = 10;
        int vMax = v1 >= v2 ? v1 : v2;
        System.out.println(vMax);

        float student = 35;
        float rooms = 4;
        float studentsPerRoom = rooms == 0 ? 0 : student/rooms;
        System.out.println(studentsPerRoom);

        // if-else statement
        if(v1 > v2) {
            System.out.println("v1 is bigger than v2");
        }
        else if (v1 < v2) {
            System.out.println("v1 is less than v2");
        }
        else {
            System.out.println("v1 is equal to v2");
        }

        // Chaining statements
        if(v1 > v2)
            System.out.println("v1 is bigger than v2");
        else if (v1 < v2)
            System.out.println("v1 is less than v2");
        else
            System.out.println("v1 is equal to v2");


        // Block statement
        float diff;
        if(v1 > v2) {
            System.out.println("v1 is bigger than v2");

            diff = v1 - v2;
        }
        else if (v1 < v2) {
            System.out.println("v1 is less than v2");

            diff = v2 - v1;
        }
        else {
            System.out.println("v1 is equal to v2");

            diff = v1 - v2;
        }
        System.out.println(diff);

        // Block Statements and Variable Scope
        float students = 40;
        float room = 4;
        if (rooms > 0) {
            System.out.println(students);
            System.out.println(room);
            float average = students / room;
            System.out.println(average);

        }


        // While Loop
        int kVal = 5;
        int factorial = 1;
        while (kVal > 1) {
            factorial *= kVal--;

        }
        System.out.println(factorial);

        // Do-While Loop
        int iVal = 5;
        do {
            iVal = iVal * 2;
            System.out.println(iVal);
        } while(iVal < 100);



    }
}
