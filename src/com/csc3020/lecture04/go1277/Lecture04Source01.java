package csc3020.lecture04.go1277;

public class Lecture04Source01 {
    public static void main(String[] args) {
        // write your code here
        System.out.println("go1277: Tia Gijo");

        //arrays

        float [] theVals = {10.0f, 20.0f, 15.0f};
        float sums = 0.0f;

        for(int i = 0; i < theVals.length; i++) {
            sums += theVals[i];
        }

        System.out.println(sums);

        int iVal = 20;
        switch(iVal % 2)
        {
            case 0:
                System.out.print(iVal);
                System.out.println( " is even ");
                break;
            case 1:
                System.out.print(iVal);
                System.out.println(" is odd");

        }





    }
}
