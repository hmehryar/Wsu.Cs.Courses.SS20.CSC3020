package com.csc3020.lecture02.em0608;

public class lecture02source {
    public static void main(String[] args){

        System.out.println("Packagaing Demo");
        byte datavalue = 3;

        System.out.println(datavalue);
        System.out.println(datavalue);

        //Character Data Type
        char regularU = 'U';
        char accentedU = '\u00DA';
        System.out.println(regularU);
        System.out.println(accentedU);

//Character Data Type
boolean ilovejava = true;
boolean ilovecsharp = false;
System.out.print(ilovejava);
System.out.print(ilovecsharp);

int myval = 5;
System.out.println(++myval);
System.out.println(myval);

int myval2 = 5;
System.out.println(myval2++);
System.out.println(myval2);

//Compound Assignment
 int CompVal = 50;
 CompVal -= 5;
 System.out.println(CompVal);

 int result = 100;
 int val = 5;
 System.out.println(result);
         int val2 = 10;
    result /= val * val2;
    System.out.println(result);


  float fval = 1.2f;
        System.out.println(fval);

        int iVal = (int)fval;
        System.out.println(iVal);
        double val4 = (double)iVal;
        System.out.println(val4);
    }
}
