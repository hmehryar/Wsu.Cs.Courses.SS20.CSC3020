package com.csc3020.hw04MidTermProject.hc7391;

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
//From Homework 3
//    public MathEquation(double l, double r)
//    {
//        this();
//        this.leftValue = l;
//        this.rightValue = r;
//    }
//
//    public MathEquation(char code, double l, double r)
//    {
//        this(l, r);
//        this.opCode = code;
//    }

    public MathEquation(char opCode){
        this();
        this.opCode = opCode;
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

 public double execute(double leftVal, double rightVal){
     switch(this.opCode)
       {
           case 'a':
                this.result = leftVal + rightVal;
                break;
            case 's':
                this.result = leftVal  - rightVal ;
                break;
           case 'm':
               this.result = leftVal  * rightVal ;
               break;
               case 'd':
                this.result = leftVal  / rightVal;
                break;
            default:
                System.out.println("Error processing opCode");
                break;

        }//end switch
     return this.result;
 }
    public int execute(int leftValInt, int rightValInt){

        switch(this.opCode)
        {
            case 'a':
                this.result = leftValInt + rightValInt;
                break;
            case 's':
                this.result = leftValInt  - rightValInt ;
                break;
            case 'm':
                this.result = leftValInt  * rightValInt ;
                break;
            case 'd':
                this.result = leftValInt  / rightValInt;
                break;
            default:
                System.out.println("Error processing opCode");
                break;

        }//end switch
        return (int) (this.result); //result variable is casted to integer
    }
    //Previous execute method that takes no inputs
//    public double execute()
//    {
//        switch(this.opCode)
//        {
//            case 'a':
//                this.result = this.leftValue + this.rightValue;
//                break;
//            case 's':
//                this.result = this.leftValue  - this.rightValue ;
//                break;
//            case 'm':
//                this.result = this.leftValue  * this.rightValue ;
//                break;
//            case 'd':
//                this.result = this.leftValue  / this.rightValue;
//                break;
//            default:
//                System.out.println("Error processing opCode");
//                break;
//
//        }//end switch
//        return this.result;
//    }
}
