package hw03.gg6997;

public class MathEquation {
    private double left;
    private double right;
    private char operator;

    //constructor
    MathEquation(double left,double right,char op){
        operator = op;
        //use this keyword to differentiate instance from local variable
        this.left = left;
        this.right = right;
    }

    //execute method computes answers from left and right values as switch statement
    public void execute(){
        //result variable stores answer to calculations and resets after each run through
        double result = 0.0;
        switch (operator) {
            case '+': {
                result = left + right;
                break;
            }
            case '-': {
                result = left - right;
                break;
            }
            case '*': {
                result = left * right;
                break;
            }
            case '/': {
                result = left / right;
                break;
            }
            //java-generated default statement if error comes about
            default:
                throw new IllegalStateException("Unexpected value: " + operator);
        }
        //output the result
        System.out.println("result: "+ result);
    }
}
