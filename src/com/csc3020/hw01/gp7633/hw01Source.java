package csc3020.hw01.gp7633;

public class hw01Source {
    public static void main(String[] args) {

        // Declare variables/arrays
        float arr1[] = {3.0f, 10.0f, 6.0f};
        float arr2[] = {4.0f, 2.0f, 2.0f};
        char choice = 'a';

        //Print out array
        System.out.print("LeftVals = ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
            System.out.print("     ");
        }
        System.out.println(" ");
        System.out.print("RightVaLs = ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr2[i]);
            System.out.print("     ");
        }

        // While loop
        while (choice != 'q') {

            switch(choice) {

                // Addition
                case 'a':
                    System.out.println(" ");
                    System.out.print("Addition Result = ");
                    for (int i = 0; i < arr1.length; i++) {
                        System.out.print(arr1[i] + arr2[i]);
                        System.out.print("     ");
                    }

                    // Change choice to s for subtraction
                    choice = 's';

                    // Subtraction
                case 's':
                    System.out.println(" ");
                    System.out.print("Subtraction Result = ");
                    for (int i = 0; i < arr1.length; i++) {
                        System.out.print(arr1[i] - arr2[i]);
                        System.out.print("     ");
                    }

                    // Change choice to d for division
                    choice = 'd';

                    // Division
                case 'd':
                    System.out.println(" ");
                    System.out.print("Division Result = ");
                    for (int i = 0; i < arr1.length; i++) {
                        System.out.print(arr1[i] / arr2[i]);
                        System.out.print("     ");
                    }

                    // Change choice to m for multiplication
                    choice = 'm';

                    // Multiplication
                case 'm':
                    System.out.println(" ");
                    System.out.print("Multiplication Result = ");
                    for (int i = 0; i < arr1.length; i++) {
                        System.out.print(arr1[i] * arr2[i]);
                        System.out.print("     ");
                    }

                    // Change choice to q to end
                    choice = 'q';
            }
        }
    }
}