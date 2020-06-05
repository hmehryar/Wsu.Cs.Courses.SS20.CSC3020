package com.csc3020.hw01.gl1193;
import java.util.Arrays;
public class Hw01Source {
    public static void main(String[] args) {


double[] a1={100.0, 25.0, 225.0, 11.0}; //declare arrays Left and Right
double[] a2={50.0, 92.0, 17.0, 3.0};
int i;
int Size=4;
int j=1;
double [] add = new double[Size];   //new arrays to store operations values
double [] sub = new double[Size];
double [] mul = new double[Size];
double [] div = new double[Size];

        System.out.print("LeftArray: ");
        for (double array: a1) {
            System.out.print(array);
            System.out.print(" ");

        }
        System.out.println(" ");

        System.out.print("RightArray: ");
        for (double array: a2) {
            System.out.print(array);
            System.out.print(" ");

        }
        System.out.println(" ");

// operations execution
        for(i = 0; i < Size; i++){
            add [i]= a1[i] + a2[i];
            sub [i]= a1[i] - a2[i];
            mul [i]= a1[i] * a2[i];
            div [i]= a1[i] / a2[i];
        }

        switch(j)
        {
            case 1:
                System.out.print("Addition Results: ");
                for (double array: add) {
                    System.out.print(array);
                    System.out.print(" ");
                }
                System.out.println(" ");


            case 2:
                System.out.print("Subtraction Results: ");
                for (double array: sub) {
                    System.out.print(array);
                    System.out.print(" ");
                }
                System.out.println(" ");
            case 3:
                System.out.print("Multiplication Results: ");
                for (double array: mul) {
                    System.out.print(array);
                    System.out.print(" ");
                }
                System.out.println(" ");
            case 4:
                System.out.print("Division Results: ");
                for (double array: div) {
                    System.out.print(array);
                    System.out.print(" ");
                }
                System.out.println(" ");

        }

    }
}
