package com.csc3020.hw04MidTermProject.hc7391;

public class Subtractor extends CalculateBase{

    public Subtractor(double leftVal, double rightVal)
    {
        super(leftVal, rightVal);
    }

    @Override
    public void calculate()
    {
        setResult((getLeftVal()-getRightVal()));
    }
}
