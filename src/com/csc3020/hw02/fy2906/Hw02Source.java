package csc3020.hw02.fy2906;

public class Hw02Source {
    public static void main(String[] args) {
        //declare arrays
        double leftArray[] = {100.0, 25.0, 225.0, 11.0};
        double rightArray[] = {50.0, 92.0, 17.0, 3.0};
        char operator[] = {'a', 's', 'd', 'm'};
        double results[] = new double[4];
        MathEquation equations[] = new MathEquation[4];
        //declares variables
        double left;
        double right;
        char op;

        //initializes equations array
        for (int i = 0; i < 4; i++) {
            left = leftArray[i];
            right = rightArray[i];
            op = operator[i];
            equations[i] = create(left, right, op);
        }

        //executes operation and stores the result
        for (int i = 0; i < 4; i++) {
            equations[i].execute();
            results[i] = equations[i].getResult();
        }

        //outputs results
        for (int i = 0; i < 4; i++) {
            System.out.println(results[i]);
        }

    }
    public static MathEquation create(double left, double right, char op) {
        MathEquation oMathEquation = new MathEquation();
        oMathEquation.setLeftValue(left);
        oMathEquation.setRightValue(right);
        oMathEquation.setOpCode(op);
        return oMathEquation;
    }
}
