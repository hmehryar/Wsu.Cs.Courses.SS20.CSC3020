package csc3020.hw05.hc7391;

public class MathEquation {
    private double leftValue;
    private double rightValue;
    private char opCode;
    private double result;


    private MathEquation(){

    }

    public MathEquation(char opCode){
        this();
        this.opCode = opCode;
    }

    public MathEquation(char opCode, double l, double r)
        {
        this(opCode);
        this.leftValue = l;
        this.rightValue = r;
    }
    //setters
    public void setLeftValue(double leftValue) {
        this.leftValue = leftValue;
    }

    public void setRightValue(double rightValue) {
        this.rightValue = rightValue;
    }

    public void setOpCode(char opCode) {
        this.opCode = opCode;
    }

    //getters
    public double getResult() { return result; }

    public double getLeftValue() { return leftValue; }

    public double getRightValue() { return rightValue; }

    public char getOpCode() { return opCode; }

    void execute(int leftVal, int rightVal){
        this.leftValue = leftVal;
        this.rightValue = rightVal;
        execute();
        result = (int)result;
    }

    void execute(double leftVal, double rightVal){
        this.leftValue = leftVal;
        this.rightValue = rightVal;
        execute();
    }


    public double execute()
    {
        switch(this.opCode)
        {
            case 'a':
                this.result = this.leftValue + this.rightValue;
                break;
            case 's':
                this.result = this.leftValue  - this.rightValue ;
                break;
            case 'm':
                this.result = this.leftValue  * this.rightValue ;
                break;
            case 'd':
                this.result = this.leftValue  / this.rightValue;
                break;
            default:
                System.out.println("Error processing opCode");
                break;

        }//end switch
        return this.result;
    }
}
