package hw02.av7071;

public class MathEquation {
    public static double leftVal;
    public static double rightVal;
    public static double result;
    public static char operation;

    public void execute() {
        /**Nested Switch Statement to loop through each Switch Case (a, s, d, m)**/
            switch (operation) {
                /**Addition**/
                case 'a':
                        result = leftVal + rightVal;
                    break;

                /**Subtraction**/
                case 's':
//                    System.out.printf("\n\nSubtraction Result: ");
                        result = leftVal - rightVal;
//                        System.out.printf(results[i] + "   ");
                    break;

                /**Division**/
                case 'd':
//                    System.out.printf("\n\nDivision Result: ");
                        result = leftVal / rightVal;
//                        System.out.printf(results[i] + "   ");
                    break;

                /**Multiplication**/
                case 'm':
//                    System.out.printf("\n\nMultiplication Result: ");
                        result = leftVal * rightVal;
//                        System.out.printf(results[i] + "   ");
//                    System.out.printf("\n");
                    break;

                default:
                    throw new IllegalStateException("Unexpected value: " + operation);
            }
        }
    }