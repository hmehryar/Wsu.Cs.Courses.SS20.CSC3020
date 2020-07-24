package csc3020.hw02.he7891;

public class MathEquation {
    // MathEquation Fields
    char operator = '\0';
    private char[] oper;
    private float[] leftVals;
    private float[] rightVals;


    // MathEquation Classes
    public MathEquation() {}
    public MathEquation(float[] left, float[] right, char op) {
        execute(left, right, op);
    }


    // Getter and Setter for operator field
    public char getOperator() {
        return operator;
    }
    public void setOperator(char operator) {
        this.operator = operator;
    }

    // Getter and Setter for oper field
    public char[] getOper() {
        return oper;
    }
    public void setOper(char[] oper) {
        this.oper = oper;
    }

    // Getter and Setter for leftVals field
    public float[] getLeftVals() {
        return leftVals;
    }
    public void setLeftVals(float[] leftVals) {
        this.leftVals = leftVals;
    }

    // Getter and Setter for rightVals field
    public float[] getRightVals() {
        return rightVals;
    }
    public void setRightVals(float[] rightVals) {
        this.rightVals = rightVals;
    }


    // MathEquation Method function
    public void execute(float[] leftVals, float[] rightVals, char op) {

        for (int i = 0; i < rightVals.length; i++) {
            switch (op) {
                case 'a':
                    if (i == 0) {
                        System.out.print("ADDITION: ");
                    }
                    System.out.print(leftVals[i] + rightVals[i]);
                    if (i < rightVals.length - 1) {
                        System.out.print(", ");
                    }
                    break;
                case 's':
                    if (i == 0) {
                        System.out.print("SUBTRACTION: ");
                    }
                    System.out.print(leftVals[i] - rightVals[i]);
                    if (i < rightVals.length - 1) {
                        System.out.print(", ");
                    }
                    break;
                case 'd':
                    if (i == 0) {
                        System.out.print("DIVISION: ");
                    }
                    if (rightVals[i] != 0) {
                        System.out.print(leftVals[i] / rightVals[i]);
                    } else {
                        System.out.println("DIVIDE BY 0 ERROR!");
                    }
                    if (i < rightVals.length - 1) {
                        System.out.print(", ");
                    }
                    break;
                case 'm':
                    if (i == 0) {
                        System.out.print("MULTIPLICATION: ");
                    }
                    System.out.print(leftVals[i] * rightVals[i]);
                    if (i < rightVals.length - 1) {
                        System.out.print(", ");
                    }
                    break;
                default:
                    System.out.println("Incorrect or no operation set.");
            }
        }
        System.out.println();
    }


}
