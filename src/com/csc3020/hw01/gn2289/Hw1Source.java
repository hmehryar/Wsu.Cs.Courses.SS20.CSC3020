package hw01.gn2289;

public class Hw1Source {

    //implement with array, loop and switch
    public static void main(String[] args) {

        //arrays for the right and left values:
        //left = 100 25 225 11
        //right = 50 92 17 3

        double[] leftVals = new double[4];

        leftVals[0] = 100.00;
        leftVals[1] = 25.00;
        leftVals[2] = 225.00;
        leftVals[3] = 11.00;

        double[] rightVals = new double[4];

        rightVals[0] = 50.00;
        rightVals[1] = 92.00;
        rightVals[2] = 17.00;
        rightVals[3] = 3.00;

        //print the arrays
        System.out.println("Left Values:");

        for(int i = 0; i < leftVals.length; i++) {
            System.out.println(leftVals[i]);
        }

        System.out.println("Right Values:");

        for(int i = 0; i < rightVals.length; i++) {
            System.out.println(rightVals[i]);
        }


        //op code
        char opCode = 'd';

        //switch, can do + - * and / by setting the op code to a s m or d

        switch (opCode) {
            case 'a':
                System.out.println("Addition: ");
                for(int i = 0; i < rightVals.length; i++) {
                    System.out.println(leftVals[i] + rightVals[i]);
                }
                break;
            case 's':
                System.out.println("Subtraction: ");
                for(int i = 0; i < rightVals.length; i++) {
                    System.out.println(leftVals[i] - rightVals[i]);
                }
                break;
            case 'm':
                System.out.println("Multiplication: ");
                for(int i = 0; i < rightVals.length; i++) {
                    System.out.println(leftVals[i] * rightVals[i]);
                }
                break;

            case 'd':
                System.out.println("Division: ");
                for(int i = 0; i < rightVals.length; i++) {
                    System.out.println(leftVals[i] / rightVals[i]);
                }
                break;
            default:
                System.out.println("Error");
        }
    }
}
