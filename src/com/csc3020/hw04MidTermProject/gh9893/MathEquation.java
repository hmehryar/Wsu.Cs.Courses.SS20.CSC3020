//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package hw04MidTermProject.gh9893;

public class MathEquation {
    public MathEquation(char opCode) {
        this.opCode = opCode;
    }


    private char opCode;
    private double leftVal ;
    private double rightVal ;
    private double result;

    public double getResult() {
        return result;
    }

  
    public void execute(double leftVal, double rightVal)
    {
     
        switch (opCode) {
            // addition
            case 'a':
                result = leftVal + rightVal;
                break;
            // subtraction
            case 's':
                result = leftVal - rightVal;
                break;
            // division
            case 'd':
                result = leftVal / rightVal;
                break;
            //multiplication
            case 'm':
                result = leftVal * rightVal;
                break;
            // The default statements
            default:
                System.out.println("Error! operator is not correct");
                break;

        }
    }



    MathEquation(char opCode) {
        this.opCode = opCode;
    }

    void execute(double leftVal, double rightVal) {
        System.out.println("\nleftVal: " + leftVal + ", rightVal: " + rightVal + ", opCode: " + this.opCode);
    }

    void execute(int leftVal, int rightVal) {
        System.out.println("\nleftVal: " + leftVal + ", rightVal: " + rightVal + ", opCode: " + this.opCode);
    }
}
