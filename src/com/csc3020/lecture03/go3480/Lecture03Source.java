package csc3020.lecture03.go3480;

public class Lecture03Source {
    public int vMax;

    public static void main(String[] args) {
        //Conditional Statement
        int v1 = 10;
        int v2 = 10;
        int vMax = v1 >= v2 ? v1 : v2;
        System.out.println(vMax);

        //float students=35;
        //float rooms=4;
        //float studentsPerRoom=rooms==0?0:students/rooms;
        //System.out.println(studentsPerRoom);

        //if-else Statement
        if (v1 > v2) {
            System.out.println("v1 is bigger than v2");
        } else if (v1 <= v2) {
            System.out.println("v1 is less than or equal to v2");
        }

        //Chaining if-else statement
        if (v1 > v2)
            System.out.println("v1 is bigger than v2");
        else if (v1 < v2)
            System.out.println("v1 is less than v2");
        else
            System.out.println("v1 is equal to v2");

        // Block statements
        float diff;
        if (v1 > v2) {

            System.out.println("v1 is bigger than v2");

            diff = v1 - v2;
        } else if (v1 < v2) {
            System.out.println("v2 is bigger than v1");

            diff = v2 - v1;
        } else {
            System.out.println("v1 is equal to v2");

            diff = v1 - v2;
        }
        System.out.println(diff);

        //Block Statement and Variable Scope
        float students = 40;
        float rooms = 4;
        if (rooms > 0) {
            System.out.println(students);
            System.out.println(rooms);
            float average = students / rooms;
            System.out.println(average);
        }
    }
}
