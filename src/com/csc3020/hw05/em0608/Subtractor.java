package com.csc3020.hw5.em0608;

public class Subtractor extends CalculateBase {
    double difference;


    public Subtractor(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    @Override
    public void calculate() {
        setResult(difference = leftVal - rightVal);

    }

}