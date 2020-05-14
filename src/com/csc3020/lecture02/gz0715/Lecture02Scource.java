package com.csc3020.lecture02.gz0715;

public class Lecture02Scource {
    public static void main(String[] args)
    {
        System.out.println("Packaging Demo");

        //Variables
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

        /*
        Integer types:
        byte 8, short 16, int 32, long 64
        Float types:
        float 32, double 64
         */

        //Character Data Type
        char regularU = 'U';
        char accentedU = '\u00DA';
        System.out.println(regularU);
        System.out.println(accentedU);

        //Boolean Data Type
        boolean iLoveJava = true;
        boolean iLoveCSharp = false;
        System.out.println(iLoveJava);
        System.out.println(iLoveCSharp);

        //Prefix/Postfix Operator
        int prefixVal =  5;
        System.out.println(++prefixVal);
        System.out.println(prefixVal);

        int postfixVal =  5;
        System.out.println(postfixVal++);
        System.out.println(postfixVal);

        // Compound Assignment Operators
        int CompAsigmntOpVal = 50;
        CompAsigmntOpVal -= 5;
        System.out.println(CompAsigmntOpVal);

        int result = 100;
        int val1 = 5;
        int val2 = 10;
        System.out.println(result);
        result /= val1 * val2;
        System.out.println(result);

        /*
        Operator Precedence
        postfix x++ x--
        prefix ++x --x
        Multiplicative * / %
        Additive + -
         */

        //datatype Casting
        float fVal = 1.2f;
        System.out.println(fVal);
        int iVal = (int)fVal;
        System.out.println(iVal);
        double dVal = (double) iVal;
        System.out.println(dVal);

        
    }
}
