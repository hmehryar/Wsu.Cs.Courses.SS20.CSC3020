package com.csc3020.hw05.go5621;
//*
// Author: Patricia Liu
// Homework 5: Hw05Source
// */
public class Hw05Source {

    public static void main(String[] args) {
        String[] operations = {
                "divide 100.0 50.0",
                "add 25.0 92.0",
                "subtract 225.0 17.0",
                "multiply 11.0 3.0"
        };

        for (int i = 0; i < operations.length; i++) {
            CalculateHelper oCalculateHelper = new CalculateHelper();
            oCalculateHelper.process(operations[i]);
            System.out.println(oCalculateHelper.toString());
        }
    }
}
