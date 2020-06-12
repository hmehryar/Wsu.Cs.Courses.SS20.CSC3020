package com.csc3020.hw02.gx0225;

public class MathEquation {
    //define variable
    double[] leftVal;
    double[] rightVal;
    char opCode;
    public void setLeftVal(double[] leftVal){
        this.leftVal=leftVal;
    }
    public void setRightVal(double[] rightVal){
        this.rightVal=rightVal;
    }
    public void setOpCode(char opCode){
        this.opCode=opCode;
    }

    public void execute() throws Exception{
        switch(opCode){
            case 'a':
                System.out.print("\nAddition Result = ");
                for (int j = 0; j < leftVal.length; j++){
                    System.out.print(leftVal[j]+rightVal[j]+" ");
                }

                break;
            case 'b':
                System.out.print("\nSubtraction Result= ");
                for (int j = 0; j < leftVal.length; j++){
                    System.out.print(leftVal[j]-rightVal[j]+" ");
                }

                break;
            case 'c':
                System.out.print("\nDivision Result = ");
                for (int j = 0; j < leftVal.length; j++){
                    if (rightVal[j] !=0)
                        System.out.print(leftVal[j]/rightVal[j]+" ");
                    else
                        throw new Exception("cannot divide 0");
                }

                break;
            case 'd':
                System.out.print("\nMultiplication Result = ");
                for (int j = 0; j < leftVal.length; j++){
                    System.out.print(leftVal[j]*rightVal[j]+" ");
                }

                break;
            default:
                throw new Exception("Error: Invalid operation");

        }

    }
}
