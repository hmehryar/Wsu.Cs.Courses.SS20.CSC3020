package com.csc3020.hw5.em0608;

public class MathEquation {

    private double leftValue;
    private double rightValue;
    private double results;
    private char opCode;
    private int leftVal;
    private int rightVal;
    private int intResult;

    //null constructor
    public MathEquation(){}

    // Constructor to Call opCode
   public MathEquation(char opCode){
        this();
        this.opCode = opCode;
    }



    //Method to call leftVal and rightVal as doubles
    public void execute(double leftValue, double rightValue){
        switch (opCode) {
            //Prints the addition result
            case 'a':
                results = leftValue + rightValue;

                break;

            //Prints the subtraction result
            case 's':
                results = leftValue - rightValue;
                break;

            //Prints the division result
            case 'd':

                if (rightValue != 0){
                    results = leftValue / rightValue;
                }
                else
                    return;
                break;

            //Prints the multiplication result
            case 'm':
                results = leftValue * rightValue;
                break;

            //Prints if the code has an error
            default:
                System.out.println("Code Error. Please try again");
        }
    }

    //Method to call leftVal and rightVal as integers
    public void execute(int leftVal, int rightVal){
        switch (opCode) {
            //Prints the addition result
            case 'a':
                intResult = leftVal + rightVal;

                break;

            //Prints the subtraction result
            case 's':
                intResult = leftVal - rightVal;
                break;

            //Prints the division result
            case 'd':

                if (rightVal != 0){
                    intResult = leftVal / rightVal;
                }
                else
                    return;
                break;

            //Prints the multiplication result
            case 'm':
                intResult = leftVal * rightVal;
                break;

            //Prints if the code has an error
            default:
                System.out.println("Code Error. Please try again");
        }
    }

    //getters and setters
    public double getDoubleResults() {
        execute(leftValue, rightValue);
        return results;
    }

    public int getIntResults(){
        execute(leftVal, rightVal);
        return intResult;
    }








}
