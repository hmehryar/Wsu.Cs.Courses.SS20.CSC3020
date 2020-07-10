package csc3020.hw03.go3480;

public class MathEquation {
    // private variables
    private double leftVal, rightVal, result;
    private char opCode;

    // constructors
    public MathEquation() {
        // this part can be put inside an initialization block,
        // but the assignment does not require that.
        leftVal = 0.0d;
        rightVal = 0.0d;
        opCode = '\u0000'; // null char
        result = 0.0d;
    }
    // following 2 constructors are used to show chaining, although they are very redundant.
    public MathEquation(double leftVal, double rightVal) {
        this(); // constructor chaining
//        this.leftVal = leftVal;
//        this.rightVal = rightVal;
        // these setters are redundant, but using for the purpose of the assignment.
        setLeftVal(leftVal);
        setRightVal(rightVal);
    }
    public MathEquation(double leftVal, double rightVal, char opCode) {
        this(leftVal, rightVal); // constructor chaining
//        this.opCode = opCode;
        setOpCode(opCode);
    }

    // leftVal accessors and mutators
    // not needed/used
//    public double getLeftVal() {
//        return leftVal;
//    }
    public void setLeftVal(double leftVal) {
        this.leftVal = leftVal;
    }

    // rightVal accessors and mutators
    // not needed/used
//    public double getRightVal() {
//        return rightVal;
//    }
    public void setRightVal(double rightVal) {
        this.rightVal = rightVal;
    }

    // opCode accessors and mutators
    // not needed/used
//    public char getOpCode() {
//        return opCode;
//    }
    public void setOpCode(char opCode) {
        this.opCode = opCode;
    }

    // result accessors and mutators
    public double getResult() {
        return result;
    }

    // not needed/used
//    public void setResult(double result) {
//        this.result = result;
//    }

    public void execute() {
        // this part can be done using accessors/mutators, but that seems very counterintuitive.
        // for example: setResult(getLeftVal() + getRightVal());
        //              is the same as result = leftVal + rightVal;
        switch (opCode) {
            case 'a':
                result = leftVal + rightVal;
                break;
            case 's':
                result = leftVal - rightVal;
                break;
            case 'd':
                if (rightVal == 0)
                    break;
                result = leftVal / rightVal;
                break;
            case 'm':
                result = leftVal * rightVal;
                break;
            default:
                System.out.println("Invalid input!");
                break;
        }
    }
}
