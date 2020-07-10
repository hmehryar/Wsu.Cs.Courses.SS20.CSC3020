package csc3020.hw04MidTermProject.go1527;

public class MathEquation {
    char opCode;

    //Constructor
    MathEquation(char opCode) {
        this.opCode = opCode;
    }

    //Overload execute methods
    void execute(double leftVal, double rightVal) {
        System.out.println("result=" + leftVal / rightVal);
    }

    void execute(int leftVal, int rightVal) {
        System.out.println("result=" + leftVal / rightVal);
    }
}
