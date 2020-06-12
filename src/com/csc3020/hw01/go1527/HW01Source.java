package com.csc3020.hw01.go1527;

public class HW01Source {
    public static void main (String[]args){

        //Author: Ahtesamul Haque
        //Date: 05/21/2020
        //Homework 01

        //Letter values for arithemtic expressions
        char[] charVals={'a','s','d','m'};
        //Arrays
        double[] leftVals = { 100d, 25d, 225d, 11d };
        double[] rightVals = { 50d, 92d, 17d, 3d };
        System.out.println("LeftVals=100.0\t 25.0\t 225.0\t 11.0");
        System.out.println("RightVals=50.0\t 92.0\t 17.0\t 3.0");

        //For loop to run all cases
        for (int i=0; i<=3; i++)
        {
            switch(charVals[i]) //Switch statement
            {
                case 'a':
                    System.out.print("Addition Result=");
                    for (int index=0; index<leftVals.length;index++) //For loop in all cases
                    {
                        System.out.print(leftVals[index]+rightVals[index] + "\t");
                    }
                    break;
                case 's':
                    System.out.print("\nSubtraction Result=");
                    for (int index=0; index<leftVals.length;index++)
                    {
                        System.out.print(leftVals[index]-rightVals[index] + "\t");
                    }
                    break;
                case 'd':
                    System.out.print("\nDivison Result=");
                    for (int index=0; index<leftVals.length;index++)
                    {
                        System.out.print(leftVals[index]/rightVals[index] + "\t");
                    }
                    break;
                case 'm':
                    System.out.print("\nMultiplication Result=");
                    for (int index=0; index<leftVals.length;index++)
                    {
                        System.out.print(leftVals[index]*rightVals[index] + "\t");
                    }
                    break;
                default:
                    System.out.println("Error! None of the conditions were met.");
                    break;
            }

        }



    }

}
