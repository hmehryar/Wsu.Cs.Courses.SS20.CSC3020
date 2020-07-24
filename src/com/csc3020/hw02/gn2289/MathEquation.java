package csc3020.hw02.gn2289;

public class MathEquation {

    MathEquation(){};
    double leftVals;
    double rightVals;
    char opCode;


    public double getLeftValues() {
        return leftVals;
    }

    public void setLeftValues(double leftVals) {
        this.leftVals = leftVals;
    }

    public double getRightValues() {
        return rightVals;
    }

    public void setRightValues(double rightVals) {
        this.rightVals = rightVals;
    }

    public char getOpCode() {
        return opCode;
    }

    public void setOpCode(char opCode) {
        this.opCode = opCode;
    }

    public void print() {

    }



   public double solve() {
        switch (opCode) {
            case 'a':
                return leftVals + rightVals;

            case 's':
                return leftVals - rightVals;

            case 'm':
                return leftVals * rightVals;


            case 'd':
                return leftVals / rightVals;


            default:
                System.out.println("Error");
                return 0;

        }

    }
}
