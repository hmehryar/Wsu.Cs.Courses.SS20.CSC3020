package csc3020.lecture03.gz0715;

public class Lecture03Source {
    public static void main(String[] args) {

        // Conditional Statement
        int v1 = 7;
        int v2 = 10;
        int vMax = v1 >= v2 ? v1 : v2;
        System.out.println(vMax);

        float students = 35;
        float rooms = 4;
        float studentsPerRoom = rooms == 0 ? 0 : students / rooms;
        System.out.println(studentsPerRoom);

        // If-else Statement
        if (v1 > v2)
            System.out.println("v1 is bigger than v2");
        else
            System.out.println("v1 is less than or equal to v2");

        // Chaining if-else Statement
        if (v1 > v2)
            System.out.println("v1 is bigger than v2");
        else if (v1 < v2)
            System.out.println("v1 is less than to v2");
        else
            System.out.println("v1 is equal to v2");

        // Block Statements
        float diff;
        if (v1 > v2) {
            diff = v1 - v2;
            System.out.println("v1 is bigger");
            System.out.println(diff);
        } else if (v2 > v1) {
            diff = v2 - v1;
            System.out.println("v2 is bigger");
            System.out.println(diff);
        } else
            System.out.println("v1 and v2 are equal");

        // Block statement and variable Scope
        float students_2 = 40;
        float rooms_2 = 4;
        if (rooms_2 > 0) {
            System.out.println(students_2);
            System.out.println(rooms_2);
            float average = students_2 / rooms_2;
            System.out.println(average);
        }
        // System.out.println(average); // Causes error because average is not in scope

        // While Loop
        int kVal = 5;
        int factorial = 1;
        while (kVal > 1)
            factorial *= kVal--;
        System.out.println(factorial);

        // Do-while loop
        int iVal = 5;
        do {
            iVal = 2 * iVal;
            System.out.println(iVal);
        } while (iVal < 100);
    }
}
