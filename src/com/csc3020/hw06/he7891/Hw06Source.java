package csc3020.hw06.he7891;
/*
 * Author: Nathan Tattrie
 * Student ID: he7891
 * Homework Assignment 06
 * Hw06Source.java
 * */

import java.util.regex.PatternSyntaxException;

public class Hw06Source {

    public static void main(String[] args) {

        // Required Item Step 1
        String arr[] = {
                "add 1.0",              // Error: incorrect number of values
                "add xx 25.0",          // Error: non-numeric data
                "addX 0.0 0.0",         // Error: invalid command
                "divide 100.0 50.0",
                "add 25.0 92.0",
                "subtract 225.0 17.0",
                "multiply 11.0 3.0"
        };

        CalculateHelper oCalculateHelper = new CalculateHelper();

        for (int i = 0; i < arr.length; i++) {
            try {
                oCalculateHelper.process(arr[i]);
                System.out.println(oCalculateHelper.toString());
            }
            catch (ArrayIndexOutOfBoundsException oArrayIndexOutOfBoundsException) {
                System.out.println("Incorrect number of fields: " + arr[i]);
            }
            catch (NullPointerException oNullPointerException) {
                System.out.println("Invalid command: " + arr[i]);
            }
            catch (NumberFormatException oNumberFormatException) {
                System.out.println("Non-numeric data: " + arr[i]);
                System.out.println("    Original exception: " + oNumberFormatException.getMessage());
            }
            catch (Exception oException) {
                System.out.println(oException.getClass().getSimpleName() + " : " + oException.getMessage());
            }

        }
    }
}
