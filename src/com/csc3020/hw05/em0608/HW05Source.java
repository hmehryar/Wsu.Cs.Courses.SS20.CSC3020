package com.csc3020.hw5.em0608;

public class HW05Source {
    public static void main(String[] args) {
        String[] mathArray = {"divide 100.0 50.0", "add 25.0 92.0",
                "subtract 225.0 17.0", "multiply 11.0 3.0"};

       CalculateHelper mathLoop = new CalculateHelper();


        for (int i = 0; i < mathArray.length ; i++) {
            mathLoop.process(mathArray[i]);
            System.out.println(mathLoop);
        }

    }
}
