package csc3020.hw05.gr4381;
//Author: Matthew Martin
public class MathEquation {
    private double leftVal;
    private double rightVal;
    private double result;
    private char operator;

    // constructors
    {
        leftVal = 0;
        rightVal = 0;
        operator = '+';
        result = 0;
    } // initialization block
    public MathEquation(double lv, double rv){
        leftVal = lv;
        rightVal = rv;
    }
    public MathEquation(double lv, double rv, char op){
        this(lv, rv); // chain with (double, double) constructor
        operator = op;
    }
    public MathEquation(char op){ // Overload 1.
        this.operator = op;
    }

    // accessors and mutators
    public void setLeftVal(double leftVal) {
        this.leftVal = leftVal;
    }
    public double getLeftVal() {
        return leftVal;
    }
    public void setRightVal(double rightVal) {
        this.rightVal = rightVal;
    }
    public double getRightVal() {
        return rightVal;
    }
    public void setOperator(char operator) {
        this.operator = operator;
    }
    public char getOperator() {
        return operator;
    }

    public double execute(){
        switch (operator){
            case 'a':
            case '+':
                result = leftVal + rightVal;
                break;
            case 's':
            case '-':
                result = leftVal - rightVal;
                break;
            case 'm':
            case '*':
                result = leftVal * rightVal;
                break;
            case 'd':
            case '/':
                if (rightVal == 0){
                    System.out.println("Error: divide by 0");
                    result = 0;
                } else {
                    result = leftVal / rightVal;
                }
                break;
            default:
                System.out.println("Error: undefined operation");
                result = 0;
        } // end switch
        return result;
    }

    public double execute(double lv, double rv){ // Overload 2.
        leftVal = lv;
        rightVal = rv;
        return execute();
    }

    public double execute(int lv, int rv){ // Overload 3.
        leftVal = lv;
        rightVal = rv;
        return (int)execute();
    }

    public void printResult(){
        System.out.println("result = " + execute());
    }

}
