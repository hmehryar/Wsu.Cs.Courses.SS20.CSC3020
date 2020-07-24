package csc3020.hw02.gn8271;

public class Hw02Source {
    public static void main(String[] args) {
        // variable declaration

        double [] val1 = {100.0,25.0,225.0,11.0};
        double [] val2 = {50.0,92.0,17.0,3.0};
        char [] operation = {'a','s','d','m'};
        double results;
        MathEquation [] equations = new MathEquation[4];
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
        for (int v = 0; v < 4; v++) {
            if (operation[v] == 'a')
                System.out.print("Addition Result= ");
            else if (operation[v] == 's')
                System.out.print("Subtraction Result= ");
            else if (operation[v] == 'd')
                System.out.print("Division Result= ");
            else if (operation[v] == 'm')
                System.out.print("Multiplication Result= ");
            else
                System.out.println("Error! operator is not correct");
            for (int i = 0; i < val1.length; i++) {
                equations[i] = create(val1[i], val2[i], operation[v]);
                System.out.print(equations[i].result);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
    public static MathEquation create (double val1, double val2, char operation) {
        MathEquation oMathEquation = new MathEquation(val1,val2,operation);
        oMathEquation.execute();
        return oMathEquation;
    }
}