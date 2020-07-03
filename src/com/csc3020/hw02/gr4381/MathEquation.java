package csc3020.hw02.gr4381;

public class MathEquation {
    private double leftVal;
    private double rightVal;
    private double result;
    private char operator;

    MathEquation(double lv, double rv, char op){
        leftVal = lv;
        rightVal = rv;
        operator = op;
    }

    public double getResult(){
        return result;
    }

    public void execute(char op){
        switch (op){
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
    };

}
