package csc3020.lecture04.gp7633;

public class Lecture04Source {
    public static void main(String[] args) {
        System.out.println("gp7633: Sam Church");

        // While loop
        System.out.println("While loop");
        int iVal = 1;
        while (iVal < 100) {
            System.out.println(iVal);
            iVal *= 2;
        }

        // For loop
        System.out.println("For Loop");
        for (int iVal1 = 1; iVal1 < 100; iVal1*=2) {
            System.out.println(iVal1);
        }

        // Arrays
        float[] theVals = {10.0f,30.0f,55.0f};
        float sum = 0;
        for (int index = 0; index < theVals.length; index++) {
            sum += theVals[index];
        }
        System.out.println(sum);

        //ForEach
        sum = 0;
        for(float val:theVals) {
            sum += val;
        }

        System.out.println(sum);

        int val = 20;
        switch (val%2) {
            case 0:
                System.out.print(val);
                System.out.print(" is even");
                break;
            case 1:
                System.out.print(val);
                System.out.print(" is odd");
                break;
            default:
                System.out.println("Non of the conditions happened");
                break;
        }
    }
}
