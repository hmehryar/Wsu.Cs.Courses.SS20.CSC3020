package hw01.gg6997;

/**
 * Calculator Engine v2
 * Author: Manraj Singh
 * Email: manrajsingh@wayne.edu
 * Date: 5/19/2020
 * Description: Create a calculator engine utilizing arrays, loops, and switch syntax
 * */
public class Hw01Source {
    public static void main(String[] args) {

        //Declare arrays of values
        double[] leftVals = {150.0, 75.5, 37.5, 421.3};
        double[] rightVals = {120.0, 120.2, 65.3, 200.8};

        //Output the array values of the left array
        System.out.print("Left Values=  ");
        for(int index = 0; index < leftVals.length; index++) {
            System.out.print(leftVals[index] + ", ");
        }
        System.out.println();

        //Output the array values of the right array
        System.out.print("Right Values= ");
        for(int index = 0; index < rightVals.length; index++) {
            System.out.print(rightVals[index] + ", ");
        }
        System.out.println();

        //For loop goes through each case in switch statement
        for(int j = 1; j <= 4; j++) {
            //initialize switch statement to go in response to for loop increasing
            switch(j){
                //Addition case
                case 1:
                    System.out.print("Addition Results= ");
                    //for loop calculates each value in array
                    for(int i = 0; i < 4; i++) {
                        System.out.print(leftVals[i] + rightVals[i] + ", ");
                    }
                    System.out.println(" ");
                    break;

                //Subtraction case
                case 2:
                    System.out.print("Subtraction Results= ");
                    //for loop calculates each value in array
                    for(int i = 0; i < 4; i++) {
                        System.out.print(leftVals[i] - rightVals[i] + ", ");
                    }
                    System.out.println(" ");
                    break;

                //Division case
                case 3:
                    System.out.print("Division Results= ");
                    //for loop calculates each value in array
                    for(int i = 0; i < 4; i++) {
                        System.out.print(leftVals[i] / rightVals[i] + ", ");
                    }
                    System.out.println(" ");
                    break;

                //Multiplication case
                case 4:
                    System.out.print("Multiplication Results= ");
                    //for loop calculates each value in array
                    for(int i = 0; i < 4; i++) {
                        System.out.print(leftVals[i] * rightVals[i] + ", ");
                    }
                    System.out.println(" ");
                    break;

                default:
                    throw new IllegalStateException("Unexpected value: " + j);
            }
        }
    }
}
