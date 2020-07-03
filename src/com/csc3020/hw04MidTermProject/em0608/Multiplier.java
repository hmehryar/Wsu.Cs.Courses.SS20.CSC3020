package csc3020.hw04MidTermProject.em0608;

public class Multiplier extends CalculateBase{
    double product;


    public Multiplier(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    @Override
    public void calculate() {
        product = leftVal * rightVal;
        System.out.print("Result= ");
        System.out.println(product);
    }

}