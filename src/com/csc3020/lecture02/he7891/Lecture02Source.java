package com.csc3020.lecture02.he7891;
// *
// Author: Nathan Tattrie
// Student ID: he7891
// Lecture02
// *

public class Lecture02Source {
    public static void main(String[] args) {

        System.out.println("Packaging Demo");
        // Variables
        System.out.println(3);
        int dataValue = 3;
        System.out.println(dataValue);
        int infoData = 100;
        System.out.println(infoData);
        infoData = 150;
        System.out.println("Variables: Modifying infoData value to 150");
        System.out.println(infoData);

        // Using Variables - they need to be initialized
        int myVar = 0;
        System.out.println(myVar);

        myVar = 50;
        System.out.println(myVar);

        int anotherVar = 100;
        System.out.println(anotherVar);

        myVar = anotherVar;
        System.out.println(myVar);

        anotherVar = 200;
        System.out.println(anotherVar);

        System.out.println(myVar);


        /* Integer Data Type
         * byte has 8 bits, -128 to 127
         * short has 16 bits,
         * int has 32 bits, -2147483648 to 2147483647
         * long has 64 bits, -9223372036854775808 to 9223372036854775807, literal format has 'L' at end
         */

        // Floating Point Types:
        // float has 32 bits, literal format has 'f' at end
        // double has 64 bits, literal format has "d' at end

        // Character DataType
        char regularU = 'U';
        char accentedU = '\u00DA';
        System.out.println(regularU);
        System.out.println(accentedU);

        // Boolean Data Type
        boolean iLoveJava = true;
        boolean iLoveCSharp = false;
        System.out.println(iLoveJava);
        System.out.println(iLoveCSharp);
    }
}
