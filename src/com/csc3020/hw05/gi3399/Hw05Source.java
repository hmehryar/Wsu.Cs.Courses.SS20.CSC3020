package com.csc3020.hw05.gi3399;

public class Hw05Source {
    public static void main(String[] args) {
        String[] string = {"divide 100.0 50.0", "add 25.0 92.0", "subtract 225.0 17.0", "multiply 11.0 3.0"};
        CalculateHelper array = new CalculateHelper();
        for (int index = 0; index < string.length; index++) {
            array.process(string[index]);
            System.out.println(array.toString());
        }
    }
}
