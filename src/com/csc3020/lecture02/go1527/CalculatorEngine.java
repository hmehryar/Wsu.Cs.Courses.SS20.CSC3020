package csc3020.lecture02.go1527;

public class CalculatorEngine {
    public static void main(String[] args) {
        //Input
        float val1 = 10, val2 = 4;
        char opCode = 'd';
        //Output
        float result = 0;

        System.out.println(val1);
        System.out.println(val2);


        if (opCode == 'a') {
            result = val1 + val2;
        } else if (opCode == 's') {
            result = val1 - val2;
        } else if (opCode == 'm') {
            result = val1 * val2;
        } else if (opCode == 'd') {
            result = val1 / val2;
        } else {
            System.out.println("Error: Invalid operation");
        }

        System.out.println(result);

        //While Loop
        int kVal = 5;
        int factorial = 1;
        while (kVal > 1)
            factorial *= kVal--;
        System.out.println(factorial);

        //Do-while
        int iVal = 5;
        do {
            iVal = iVal * 2;
            System.out.println(iVal);
        } while (iVal < 100);
    }
}
