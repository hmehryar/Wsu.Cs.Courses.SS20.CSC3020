package com.csc3020.lecture03.av7071;

public class Lecture03Source01 {
    public static void main(String[] args) {
        //Conditional Statement
        int v1 = 7;
        int v2 = 5;
        int vMax = v1 >= v2 ? v1 : v2;
        System.out.println(vMax);

        float students = 30;
        float rooms = 4;
        float studentsPerRoom = rooms == 0.0f ? 0.0f : students/rooms;
        System.out.println(studentsPerRoom);

        //if-else Statement
        if (v1 > v2){
            System.out.println("v1 is bigger than v2");
        }else if (v1 <= v2){
            System.out.println("v1 is less than or equal to v2");
        }

        //Chaining if-else Statements
        if (v1 > v2){
            System.out.println("v1 is bigger than v2");
        }else if (v1 < v2){
            System.out.println("v1 is less than v2");
        }else{
            System.out.println("v1 is equal to v2");
        }

        //Block Statement
        int v3 = 10, v4 = 4, diff;
        if(v3 > v4) {
            diff = v3 - v4;
            System.out.println("v3 is bigger");
            System.out.println(diff);
        }
        else if(v4 > v3) {
            diff = v4 - v3;
            System.out.println("v4 is bigger");
            System.out.println(diff);
        }
        else
            System.out.println("v3 and v4 are equal");


        //Block Statement and Variable Scope
        float studentz = 30;
        float roomz = 4;
        if(roomz > 0.0) {
            System.out.println(studentz);
            System.out.println(roomz);
            float avg = studentz / roomz;
            System.out.println(avg);
        }









    }
}
