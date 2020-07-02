package com.csc3020.hw04MidTermProject.gg8219;

public class MathEquation {
    char opCode;

    //Implement a constructor which takes the operator character as input (opCode)
    MathEquation(char opCode) {
        this.opCode = opCode;
    }

    //Implement a new overload for execute method which takes two double inputs(leftVal, rightVal)
    void execute(double leftVal, double rightVal) {
        System.out.println("result="+leftVal/rightVal);
    }

    //Implement a new overload for execute method which takes two integer inputs
    void execute(int leftVal, int rightVal) {
        System.out.println("result="+leftVal/rightVal);
    }
}
