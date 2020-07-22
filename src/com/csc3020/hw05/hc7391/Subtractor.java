package csc3020.hw05.hc7391;

public class Subtractor extends CalculateBase{

    public Subtractor(){

    }
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
