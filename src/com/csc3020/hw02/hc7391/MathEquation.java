package com.csc3020.hw02.hc7391;
//CSC 3020
// Author: Bryan Vinson (ID: HC7391)
public class MathEquation {

    private double leftVal;
    private double rightVal;
    private char opCode;
    private double result;

    MathEquation() {}

    public void setOpCode(char opCode) {
        this.opCode = opCode;
    }

    public void setLeftVal(double leftVal) {
        this.leftVal = leftVal;
    }

    public void setRightVal(double rightVal) {
        this.rightVal = rightVal;
    }

//This function takes in an opCode that performs the corresponding math operation. The result of the
//operation is then stored in the result variable in this class.

public double execute()
{
    switch(this.opCode)
    {
        case 'a':
            this.result = this.leftVal + this.rightVal;
            break;
        case 's':
            this.result = this.leftVal - this.rightVal;
            break;
        case 'm':
            this.result = this.leftVal * this.rightVal;
            break;
        case 'd':
            this.result = this.leftVal / this.rightVal;
            break;
        default:
            System.out.println("Error processing opCode");
            break;

    }//end switch
    return this.result;
}
}
