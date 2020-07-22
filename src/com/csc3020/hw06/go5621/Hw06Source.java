package com.csc3020.hw06.go5621;
//*
// Author: Patricia Liu
// Hw06Source
// */
public class Hw06Source {
    public static void main(String[] args) {
        String[] operations = {
                "add 1.0",
                "add xx 25.0",
                "addX 0.0 0.0",
                "divide 100.0 50.0",
                "add 25.0 92.0",
                "subtract 225.0 17.0",
                "multiply 11.0 3.0"
        };

        for (int i = 0; i < operations.length; i++) {
            try {
                CalculateHelper oCalculateHelper = new CalculateHelper();
                oCalculateHelper.process(operations[i]);
                System.out.println(oCalculateHelper.toString());
            } catch (InvalidStatementException e) {
                System.out.println(e.getMessage());
                if(e.getCause() != null) {
                    System.out.println("\tOriginal Exception:" + e.getCause().getMessage());
                }
            }
        }
    }
}
