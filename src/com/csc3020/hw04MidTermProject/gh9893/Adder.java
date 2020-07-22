package hw04MidTermProject.gh9893;

class Adder extends CalculateBase {
    public Adder(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    public double calculate() {
        return this.result = this.leftVal + this.rightVal;
    }
}
