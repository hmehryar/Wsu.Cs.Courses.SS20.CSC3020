package com.csc3020.hw04MidTermProject.go5334;

class MathEquation
{

    char opCode;

    MathEquation(char opCode)
    {
        this.opCode = opCode;
    }
    void execute(double leftVal, double rightVal)
    {
        System.out.println("Using Overloads: ");
        System.out.println("\nresult: "+ leftVal/rightVal);
    }
    void execute(int leftVal, int rightVal)
    {
        System.out.println("\nresult: "+leftVal/rightVal);
    }
}