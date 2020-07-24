package com.csc3020.hw03.hc7391;

public class MathEquation {
    private double leftValue;
    private double rightValue;
    private char opCode;
    private double result;

    {
        leftValue = 0;
        rightValue = 0;
        result = 0;
    }

    public MathEquation() {
    }

    public MathEquation(double l, double r)
    {
        this();
        this.leftValue = l;
        this.rightValue = r;
    }

    public MathEquation(char code, double l, double r)
    {
        this(l, r);
        this.opCode = code;
    }

    //setters
    public void setLeftValue(double leftValue) {
        this.leftValue = leftValue;
    }

    public void setRightValue(double rightValue) {
        this.rightValue = rightValue;
    }

    public void setOpCode(char opCode) {
        this.opCode = opCode;
    }

    //getters
    public double getResult() { return result; }

    public double getLeftValue() { return leftValue; }

    public double getRightValue() { return rightValue; }

    public char getOpCode() { return opCode; }

    //other methods
    public double execute()
    {
        switch(this.opCode)
        {
            case 'a':
                this.result = this.leftValue + this.rightValue;
                break;
            case 's':
                this.result = this.leftValue  - this.rightValue ;
                break;
            case 'm':
                this.result = this.leftValue  * this.rightValue ;
                break;
            case 'd':
                this.result = this.leftValue  / this.rightValue;
                break;
            default:
                System.out.println("Error processing opCode");
                break;

        }//end switch
        return this.result;
    }
}
