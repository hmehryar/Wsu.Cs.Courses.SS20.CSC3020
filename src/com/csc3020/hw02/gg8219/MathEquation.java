package com.csc3020.hw02.gg8219;

public class MathEquation {
    //Add 4 public fields
    public char opCode;
    public double []leftVal = new double[]{101.0, 26.0, 226.0, 12.0};
    public double []rightVal = new double[]{49.0, 91.0, 16.0, 2.0};
    public double res[];

    //Create a new public class
    public MathEquation(char operator){
        opCode = operator;
        res = new double[leftVal.length];
    }

    //Create a public method in this class
    public void execute(){
        double res = 0.0;
        double x,y;

        for (int i=0; i<leftVal.length; i++) { //loop
            x = leftVal[i];
            y = rightVal[i];

            switch (opCode) {
                case 'a': { //Addition
                    res = x+y;
                    break;
                }
                case 's': { //Subtraction
                    res = x-y;
                    break;
                }
                case 'm': { //Multiplication
                    res = x*y;
                    break;
                }
                case 'd': { //Division
                    res = x/y;
                    break;
                }
                default: //Error exception
                    System.out.println("Error");
                    break;
            }
            this.res[i] = res;
        }

        if(opCode=='a') {
            System.out.print("Addition Result = ");
        }else if(opCode=='s') {
            System.out.print("Subtraction Result = ");
        }else if(opCode=='m') {
            System.out.print("Multiplication Result = ");
        }else if(opCode=='d') {
            System.out.print("Division Result = ");
        }
        for (int i = 0; i < leftVal.length; i++){
            System.out.print(this.res[i] + "\t");
        }
        System.out.println();
    }
}