package com.csc3020.hw05.go5334;

public class CalculateHelper extends CalculateBase{
    private double leftVal;
    private double rightVal;
    private double result;
    MathCommand command;
    public CalculateHelper()
    {
        leftVal =0;
        rightVal=0;
        result =0;
        command = null;
    }
    public void process(String equation)
    {
        String[] tokens = equation.split(" ");
        leftVal = Double.parseDouble(tokens[1]);
        rightVal = Double.parseDouble(tokens[2]);
        command = MathCommand.valueOf(tokens[0]);

    }

    @Override
    public String toString() {
        String result1 ="";
        if(command==MathCommand.Add)
            result1 = leftVal+" + "+rightVal+" = "+result;
        if(command==MathCommand.Subtract)
            result1 = leftVal+" - "+rightVal+" = "+result;
        if(command==MathCommand.Multiply)
            result1 = leftVal+" * "+rightVal+" = "+result;
        if(command==MathCommand.Divide)
            result1 = leftVal+" / "+rightVal+" = "+result;
        return result1;
    }

    @Override
    public void calculate() {

        switch (command)
        {
            case Add:
                Adder add = new Adder(leftVal,rightVal);
                add.calculate();
                result = add.getResult();
                break;
            case Subtract:
                Subtractor subtractor = new Subtractor(leftVal,rightVal);
                subtractor.calculate();
                result = subtractor.getResult();
                break;
            case Multiply:
                Multiplier multiplier = new Multiplier(leftVal,rightVal);
                multiplier.calculate();
                result = multiplier.getResult();
                break;
            case Divide:
                Divider divider = new Divider(leftVal,rightVal);
                divider.calculate();
                result = divider.getResult();
                break;
        }
    }
}