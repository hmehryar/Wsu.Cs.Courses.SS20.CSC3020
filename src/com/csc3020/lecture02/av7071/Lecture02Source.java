package csc3020.lecture02.av7071;

public class Lecture02Source {
    public static void main(String[] args) {
        System.out.println("Packaging Demo");
        //Variables
        System.out.println(3);
        int dataValue = 3;
        System.out.println(dataValue);
        int infoData = 100;
        System.out.println(infoData);

        System.out.println("Variables: Modifying infoData Value to 150");
        infoData = 150;
        System.out.println(infoData);

        //Using Variables
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

        //Integer Data Type
        byte numberOfEnglishLetters = 26;
        short feetInAMile = 5283;
        int milesToSun = 92960000;
        long nationalDebt = 18100000000000L;
        //nationalDebt=18100000000000;

        //Floating Point Data Type
        float milesInAMarathon = 26.2f;
        double atomWidthInMeters = 0.0000000001d;
        System.out.println(atomWidthInMeters);

        //Character Data Type
        char regularU = 'U';
        char accentedU = '\u00DA'; //Ú
        System.out.println(regularU);
        System.out.println(accentedU);

        //Boolean Data Type
        boolean iLoveJava = true;
        boolean iLoveCSharp = false;
        System.out.println(iLoveJava);
        System.out.println(iLoveCSharp);

        //Primitive Types are Stored By-value
        int firstValue = 100;
        int otherValue = firstValue;
        firstValue = 50;

        //Prefix/Postfix Operator
        int prefixVal = 5;
        System.out.println(++prefixVal); // 6
        System.out.println(prefixVal); // 6

        int postfixVal = 5;
        System.out.println(postfixVal++); // 5
        System.out.println(postfixVal); // 6

        //Compound Assignment Operator
        int compAssignmentOpVal = 50;
        compAssignmentOpVal -= 5;
        System.out.println(compAssignmentOpVal);

        int result = 100;
        int val1 = 5;
        System.out.println(result);
        int val2 = 10;
        result /= val1 * val2;
        System.out.println(result);

        //Type Conversion
        //Implicit type conversion: Conversions performed automatically by the compiler
        int iVal = 50;
        long lVal = iVal;

        //Explicit type conversion: Conversions performed explicitly in code with cast operator
        long lVal2 = 50;
        int iVal2 = (int) lVal2;

        float fVal3 = 1.2f;
        System.out.println(fVal3);
        int iVal3 = (int)fVal3;
        System.out.println(iVal3);
        double dVal=(double)iVal3;
        System.out.println(dVal);


    }
}
