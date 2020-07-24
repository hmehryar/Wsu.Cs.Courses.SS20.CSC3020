package csc3020.lecture11.he7891;
/*
* Author: Nathan Tattrie
* Student ID: he7891
* Lecture 11: More About Data Types
* */

/* String Class
* ~ THe string class stores a sequence of unicode characters (stored using UTS-16 encoding
* ~~ Literals are enclosed in  double quotes
* ~~ Values can be concatenated using + and +=
* ~~ String objects are immutable
* */

/* Select String Class Methods
* Operations and Methods (http://bit.ly/javastringclass)
* ~ Length: length
* ~ String for non-string: valueOf
* ~ Create new string(s) from existing: concat, replace, toLowerCase, toUpperCase, trim, split
* ~ Formatting: format
* ~ Extract substring: charAt, substring
* ~ Test substring: contains, endsWith, startsWith, indexOf, lastIndexOf
* ~ Comparison: compareTo, compareToIgnoreCase, isEmpty, equals, equalsIgnoreCase
* */

/* Converting Non-string Types to Strings
* ~ We often need to convert non-string types into strings
* ~~ String.valueOf provides overrides to handle most types
* ~~ Conversions often happen implicitely
* ~~ Class conversions...
* */

/* Classes cs. Primitives
* ~ Classes provide conciceness
* ~~ common interaction through object class
* ~~ Fields and methods specific to the type
* ~~ Incurs an overhead cost
* ~ Primitives provide efficiency
* ~~ Cannot be treated as object
* ~~ Cannot expose fields or methods
* ~~ Lightweight
* */

/* Primitives Wrapper Classes Hierarchy
* 1. Object
* 2a. boolean
* 2b. Number
* 2c. Character
* 3a. Byte
* 3b. Short
* 3c. Integer
* 3d. Long
* 3e. Float
* 3f. Double
*  */

/* Wrapper Class & Primitive Conversion
* ~ Java provides a number of ways to handle conversions (common conversions handled automatically)
* ~~ Wrapper classes provide methods for explicit conversions
* ~~~ Primitive to wrapper valueOf (known as boxing)
* ~~~ Wrapper to primitive xxxValue (known as unboxing)
* ~~~ String to primitive parseXxx, String to wrapper valueOf
* */

/* Wrapper Class Members
* ~ Byte, Short, Integer, Long: MIN_VALUE, MAX_VALUE< bitCount, toBinaryString
* ~ ...
* ~ ...
* */


public class Lecture11Source {
    public static void main(String[] args) {

        // String Class
        String name =  "Jim";
        System.out.println("Hi " + name);

        String greeting = "Hello";
        greeting += " ";
        greeting += "World";
        System.out.println(greeting);
        greeting.length();
        Integer count = 1;

        String s1 = "I love";
        s1 += " Java";
        String s2 = "I";
        s2 += " love Java";
        boolean equal = true;
        if (s1.length() == s2.length()) {
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    equal = false;
                    System.out.println("They are NOT equal");
                }
            }
        }
        String s3 = s1.intern();
        String s4 = s2.intern();

        if (s1.length() == s2.length()) {
            System.out.println("They are equal");
        }
        else {
            System.out.println("They are NOT equal");
        }

        if (s1.equals(s2)) {
            System.out.println("They are equal");
        }
        else {
            System.out.println("They are NOT equal");
        }

        // Converting non-string to string
        int iVal = 100;
        String sVal = String.valueOf(iVal);
        System.out.println(sVal);
        int i = 2, j = 3;
        int result = i * j;
        System.out.println(i + " * " + j + " = " + result);

        Flight oFlight = new Flight(175);
        System.out.println(oFlight.toString());

        // String Builder
        StringBuilder oStringBuilder = new StringBuilder(40);
        Flight myFlight = new Flight(175);
        String location = "Florida";
        oStringBuilder.append("I flew to ");
        oStringBuilder.append(location);
        oStringBuilder.append(" on ");
        oStringBuilder.append(myFlight);
        System.out.println(oStringBuilder.toString());

        int time = 9;
        int pos = oStringBuilder.length() - " on ".length()-myFlight.toString().length();
        oStringBuilder.insert(pos, " at ");
        oStringBuilder.insert(pos+4, time);

        String message = oStringBuilder.toString();
        System.out.println(message);

        // Wrapper classes
        Integer a = 100;
        int b = a;
        Integer c = b;


        Integer d = Integer.valueOf(100);
        Integer f = Integer.valueOf(d);
        int e = d.intValue();
        f = Integer.valueOf(e);
        Float g = Float.valueOf(18.125f);
        float h = g.floatValue();

        String s = "87.44";
        double dbl1 = Double.valueOf(s);
        Double dbl2 = Double.parseDouble(s);

        Object[] stuff = new Object[3];
        stuff[0] = new Flight();
        stuff[1] = new Passenger(0, 2);
        stuff[2] = 100;

        for (Object obj:stuff) {
            System.out.println(obj.toString());
            System.out.println(obj.hashCode());
        }

    }
}
