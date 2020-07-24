package csc3020.lecture02.hc7391;

public class Lecture02Source {
    public static void main(String[] args) {
        System.out.println("Packaging Demo");

        //variables

        System.out.println(3);
        int dataValue = 3;
        System.out.println(dataValue);
        int infoData = 100;
        System.out.println(infoData);

        System.out.println("Variable: Modifying infoData to 150");

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

        byte numEnglishLetters = 26;
        short feetInAMile = 5283;
        int milesToSun = 92960000;
        long nationalDebt = 18100000000000L;

        //Floating Point
        float milesInAMarathon = 26.2f;
        double atomWidthInMeters = 0.0000000001d;
        System.out.println(atomWidthInMeters);

        //Character Data Type
        char regularU = 'U';
        char accentedU = '\u00DA';
        System.out.println(regularU);
        System.out.println(accentedU);

        //Character Data Type
        boolean iLoveJava = true;
        boolean iLoveCSharp = false;
        System.out.println(iLoveJava);
        System.out.println(iLoveCSharp);

        //prefix/postfix
        int preFixVal = 5;
        System.out.println(++preFixVal);
        System.out.println(preFixVal);

        int postFixVal = 5;
        System.out.println(postFixVal++);
        System.out.println(postFixVal);

        //compound assignment operators
        int compAssignmentOpVal = 50;
        compAssignmentOpVal -= 5;
        System.out.println(compAssignmentOpVal);

        int result = 100;
        int val1 = 5;
        System.out.println(result);
        int val2 = 10;
        result /= val1*val2;
        System.out.println(result);

        float fVal = 1.2f;
        System.out.println(fVal);
        int iVal = (int)fVal;
        System.out.println(iVal);
        double dVal = (double) iVal;
        System.out.println(dVal);
    }
}
