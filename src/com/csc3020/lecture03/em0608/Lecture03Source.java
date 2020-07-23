package com.csc3020.session03.em0608;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Lecture03Source {
    public static void main(String[] args) {
        //conditional statement
        int v1 = 7;
        int v2 = 15;
        int vMax = v1 >= v2 ? v1 : v2;
        System.out.println(vMax);

      //  float student = 30;
        //float rooms = 4;
     //   float studentsPerRoom = rooms == 0 ? 0 : student / rooms;
       // System.out.println(studentsPerRoom);

        //if-else statement
        if (v1 > v2) {
            System.out.println("v1 is bigger than v2");
        } else if (v1 < v2) {
            System.out.println("v1 is less than v2");
        } else {
            System.out.println("v1 is equal to v2");
        }


        //Block Statements
        float diff;
        if (v1 > v2) {
            diff = v1 - v2;
            System.out.println("v1 is bigger than v2");
        } else if (v2 < v1) {
            diff = v2 - v1;
            System.out.println("v2 is bigger than v1");
        } else {
            diff = v2 - v1;
            System.out.println("v1 is equal to v2");
        }
        System.out.println(diff);


    //Block Statement and Variable Scope
        float students = 40;
        float rooms = 4;

        if(rooms > 0){
            System.out.println(students);
            System.out.println(rooms);
            float average = students/rooms;
            System.out.println(average);
        }

        //While Loop
        int kVal = 5;
        int factorial = 1;
        while(kVal > 1)
            factorial *= kVal--;
        System.out.println(factorial);

        //do-while loop
        int iVal = 5;
        do{
            iVal = iVal*2;
            System.out.println(iVal);
        }while(iVal < 100);
    }
}


