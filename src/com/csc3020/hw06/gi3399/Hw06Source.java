package com.csc3020.hw06.gi3399;

public class Hw06Source {
    public static void main(String[] args) {
        String[] string = {"add 1.0", "add xx 25.0", "addX 0.0 0.0",
                "divide 100.0 50.0", "add 25.0 92.0", "subtract 225.0 17.0", "multiply 11.0 3.0"};
        CalculateHelper array = new CalculateHelper();
        for (int index = 0; index < string.length; index++) {
            try {
                array.process(string[index]);
                System.out.println(array.toString());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}