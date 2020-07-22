//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package hw04MidTermProject.gh9893;

abstract class CalculateBase {
    double leftVal;
    double rightVal;
    double result;

    public void setLeftVal(double leftVal) {
        this.leftVal = leftVal;
    }

    public void setRightVal(double rightVal) {
        this.rightVal = rightVal;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public double getLeftVal() {
        return this.leftVal;
    }

    public double getRightVal() {
        return this.rightVal;
    }

    public double getResult() {
        return this.result;
    }

    CalculateBase(double leftVal, double rightVal) {
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    abstract double calculate();
}
