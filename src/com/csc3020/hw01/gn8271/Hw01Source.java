package hw01.gn8271;
///Lecture 04 - Homework01
// Author: Raisa Zaman
// Input:
// float v1,v2,
// char opCode:
// a,s,m,d
// Output:
// operation Result
public class Hw01Source {
    public static void main(String[] args) {
        // variable declaration
        double [] val1 = {100.0,25.0,225.0,11.0};
        double [] val2 = {50.0,92.0,17.0,3.0};
        char [] operation = {'a','s','d','m'};
        double result =0;

        // printing out the elements in each array
        System.out.print("LeftVals= ");
        for (int x = 0; x < val1.length; x++) {
            System.out.print(val1[x]);
            System.out.print("  ");
        }
        System.out.println(" ");
        System.out.print("RightVals= ");
        for (int y = 0; y < val2.length; y++) {
            System.out.print(val2[y]);
            System.out.print("  ");
        }
        System.out.println(" ");
        // for loop throw operator
        for (int i = 0; i < operation.length; i++)
        {
            // switch statement
            switch(operation[i]) {
                case 'a':
                    System.out.print("Addition Result= ");
                    // traverse throw the elements
                    for (int x = 0; x < val1.length; x++) {
                        result = val1[x] + val2[x];
                        // print results
                        System.out.print(result);
                        System.out.print("  ");
                    }
                    System.out.println(" ");
                    break;

                case 's':
                    System.out.print("Subtraction Result= ");
                    // traverse throw the elements
                    for (int x = 0; x < val1.length; x++) {
                        result = val1[x] - val2[x];
                        // print results
                        System.out.print(result);
                        System.out.print("  ");
                    }
                    System.out.println(" ");
                    break;

                case 'd':
                    System.out.print("Division Result= ");
                    // traverse throw the elements
                    for (int x = 0; x < val1.length; x++) {
                        result = val1[x] / val2[x];
                        // print results
                        System.out.print(result);
                        System.out.print("  ");
                    }
                    System.out.println(" ");
                    break;

                case 'm':
                    System.out.print("Multiplication Result= ");
                    // traverse throw the elements
                    for (int x = 0; x < val1.length; x++) {
                        result = val1[x] * val2[x];
                        // print results
                        System.out.print(result);
                        System.out.print("  ");
                    }
                    System.out.println(" ");
                    break;
                default:
                    System.out.println("Error! operator is not correct");
                    return;
            }

        }


    }
}
