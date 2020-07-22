package csc3020.lecture02.gg6997;

public class Lecture02Source {
    public static void main(String[] args) {
        System.out.println("Packaging Demo");
        //variables
        System.out.println(3);

        int dataValue = 3;
        System.out.println(dataValue);

        int infoData = 100;
        System.out.println(infoData);

        System.out.println("Variables: Modifying infoData variable to 150");
        infoData = 150;
        System.out.println(infoData);

        //Using variables
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

        //Integer Data Types
        byte numberOfEnglishLetters = 26;
        long nationalDebt = 1810000000000L;

        //floating data types
        float milesInAMarathon = 26.2f;
        double atomWidthInMeters = 0.0000000001d;

        System.out.println(atomWidthInMeters);

        //character variables
        char regularU = 'U';
        char accentedU = '\u00DA';

        //boolean variable
        boolean iLoveJava = true;
        boolean iLoveCSharp = false;
        System.out.println(accentedU);
        System.out.println(iLoveJava);
        System.out.println(iLoveCSharp);

        int prefixVal = 5;
        System.out.println(++prefixVal);
        System.out.println(prefixVal);

        int postfixVal = 5;
        System.out.println(postfixVal++);
        System.out.println(postfixVal);

        int myVal = 50;
        myVal -= 5;
        System.out.println(myVal);

        int result = 100;
        System.out.println(result);
        int val1 = 5;
        int val2 = 10;
        result /= val1 * val2;
        System.out.println(result);

        float fVal = 1.2f;
        System.out.println(fVal);
        int iVal = (int) fVal;
        System.out.println(iVal);

        double dVal = (double) iVal;
        System.out.println(dVal);
    }
}
