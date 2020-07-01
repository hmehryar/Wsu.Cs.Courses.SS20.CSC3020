package csc3020.hw04MidTermProject;

public class Subtractor extends CalculateBase {
    double difference;


    public Subtractor(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    @Override
    public void calculate() {
        difference = leftVal - rightVal;
        System.out.print("Result= ");
        System.out.println(difference);
    }

}