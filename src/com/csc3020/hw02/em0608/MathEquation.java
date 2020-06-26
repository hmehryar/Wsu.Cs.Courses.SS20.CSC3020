package com.csc3020.hw02.em0608;

public class MathEquation {
    double leftValue;
    double rightValue;
    char character;
    double results;


    MathEquation(double left, double right, char opCode){
        leftValue = left;
        rightValue = right;
        character = opCode;
    }

    public void execute(){
        switch (character) {

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

                if(rightValue != 0)
                    results = leftValue / rightValue;
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
}


