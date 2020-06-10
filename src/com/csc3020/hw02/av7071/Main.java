package hw02.av7071;

public class Main {
    public static void main(String[] args) {
        /**Initialize oMathEquation Object**/
        MathEquation oMathEquation = new MathEquation();

        /**Initialize Arrays**/
        char operation[] = new char[]{'a', 's', 'd', 'm'};
        double leftVal[] = new double[]{100.0, 25.0, 225.0, 11.0};
        double rightVal[] = new double[]{50.0, 92.0, 17.0, 3.0};
        double result[] = new double[leftVal.length];

        /**Print Left Array Values**/
        System.out.printf("\nLeft Values: ");
        for (int jVal = 0; jVal < leftVal.length; jVal++) {
            System.out.printf(leftVal[jVal] + "   ");
        }

        /**Print Right Array Values**/
        System.out.printf("\n\nRight Values: ");
        for (int jVal = 0; jVal < rightVal.length; jVal++) {
            System.out.printf(rightVal[jVal] + "   ");
        }

        /**Create and Run Math Equations**/
        // Addition
        System.out.printf("\n\nAddition Result: ");
        for (int i = 0; i < leftVal.length; i++) {
            oMathEquation = create(leftVal[i], operation[0], rightVal[i]);
            oMathEquation.execute();
            result[i] = oMathEquation.result;
            System.out.printf(result[i] + "   ");
        }

        // Subtraction
        System.out.printf("\n\nSubtraction Result: ");
        for (int i = 0; i < leftVal.length; i++) {
            oMathEquation = create(leftVal[i], operation[1], rightVal[i]);
            oMathEquation.execute();
            result[i] = oMathEquation.result;
            System.out.printf(result[i] + "   ");
        }

        // Division
        System.out.printf("\n\nDivision Result: ");
        for (int i = 0; i < leftVal.length; i++) {
            oMathEquation = create(leftVal[i], operation[2], rightVal[i]);
            oMathEquation.execute();
            result[i] = oMathEquation.result;
            System.out.printf(result[i] + "   ");
        }

        // Multiplication
        System.out.printf("\n\nMultiplication Result: ");
        for (int i = 0; i < leftVal.length; i++) {
            oMathEquation = create(leftVal[i], operation[3], rightVal[i]);
            oMathEquation.execute();
            result[i] = oMathEquation.result;
            System.out.printf(result[i] + "   ");
        }
        System.out.printf("\n");
    }

    /**Create Math Equations**/
    public static MathEquation create(double leftVal, char operation, double rightVal) {
        MathEquation oMathEquation = new MathEquation();
//        oMathEquation = oMathEquation.leftVal + oMathEquation.operation + oMathEquation.rightVal;
        oMathEquation.leftVal = leftVal;
        oMathEquation.operation = operation;
        oMathEquation.rightVal = rightVal;
        return oMathEquation;
    }
}


