package csc3020.hw05.he7891;
/*
 * Author: Nathan Tattrie
 * Student ID: he7891
 * Homework Assignment 05
 * Hw05Source.java
 * */


public class Hw05Source {

    public static void main(String[] args) {

        // Required Item Step 1
        String[] arr = new String[] {
                "divide 100.0 50.0",
                "add 25.0 92.0",
                "subtract 225.0 17.0",
                "multiply 11.0 3.0"
        };

        CalculateHelper oCalculateHelper = new CalculateHelper();

        // Required Item Step 8
        for (int i = 0; i < arr.length; i++) {
            oCalculateHelper.process(arr[i]);
            System.out.println(oCalculateHelper.toString());
        }
    }
}
