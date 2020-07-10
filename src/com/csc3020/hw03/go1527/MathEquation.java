package csc3020.hw03.go1527;

public class MathEquation {
    private double leftVals;
    private double rightVals;
    private double results;
    private char opCode;

    public MathEquation(double leftVals, double rightVals, char opCode) {
        this();
        setLeftVals(leftVals);
        setRightVals(rightVals);
        setOpCode(opCode);
    }

    public MathEquation() {
        leftVals = 0.0d;
        rightVals = 0.0d;
        results = 0.0d;
        opCode = ' ';
    }

    //leftVals getters and setters
    public double getLeftVals() {
        return leftVals;
    }

    public void setLeftVals(double leftVals) {
        this.leftVals = leftVals;
    }

    //rightVals getters and setters
    public double getrightVals() {
        return rightVals;
    }

    public void setRightVals(double rightVals) {
        this.rightVals = rightVals;
    }

    //Results getters and setters
    public double getResults() {
        return results;
    }

    public void setResults(double results) {
        this.results = results;
    }

    //opCode getters and setters
    public double getOpCode() {
        return opCode;
    }

    public void setOpCode(char opCode) {
        this.opCode = opCode;
    }

    public void execute() {
        switch (opCode) {
            case 'a':
                results = leftVals + rightVals;
                break;
            case 's':
                results = leftVals - rightVals;
                break;
            case 'm':
                results = leftVals * rightVals;
                break;
            case 'd':
                results = leftVals / rightVals;
                break;
            default:
                System.out.println("Error! None of the conditions were met.");
                break;
        }
    }
}

