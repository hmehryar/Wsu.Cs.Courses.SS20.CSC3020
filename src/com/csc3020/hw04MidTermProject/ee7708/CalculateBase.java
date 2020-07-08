package hw04MidTermProject.ee7708;

public abstract class CalculateBase {
    private double leftValue;
    private double rightValue;
    private double result;

    //All accessors and mutators are protected for use only in derived classes
    protected double getLeftValue() {
        return leftValue;
    }
    protected void setLeftValue(double leftValue) {
        this.leftValue = leftValue;
    }

    protected double getRightValue() {
        return rightValue;
    }
    protected void setRightValue(double rightValue) {
        this.rightValue = rightValue;
    }

    protected double getResult() {
        return result;
    }
    protected void setResult(double result) {
        this.result = result;
    }

    //This constructor sets the left, right value fields
    protected CalculateBase(double leftValue, double rightValue) {
        setLeftValue(leftValue);
        setRightValue(rightValue);
    }

    protected CalculateBase(){
    };

    public abstract void calculate();
}
