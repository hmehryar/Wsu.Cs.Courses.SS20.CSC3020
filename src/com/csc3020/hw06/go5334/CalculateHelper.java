package com.csc3020.hw06.go5334;

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
    public void process(String math) throws InvalidStatementException {
        String[] tokens = math.split(" ");
        if(tokens.length!=3)
            throw new InvalidStatementException("Incorrect number of fields ",math);
        if(!tokens[1].matches("-?\\d+(.\\d+)?")){
            throw new InvalidStatementException("Non-numeric data",math,new Throwable("For input string: "+tokens[1]));
        }
        if(!tokens[2].matches("-?\\d+(.\\d+)?")){
            throw new InvalidStatementException("Non-numeric data",math,new Throwable("For input string: "+tokens[2]));
        }
        if(!(tokens[0].equals("Add") || tokens[0].equals("Subtract") ||
                tokens[0].equals("Multiply") || tokens[0].equals("Divide"))){
            throw new InvalidStatementException("Invalid command",math);
        }
        leftVal = Double.parseDouble(tokens[1]);
        rightVal = Double.parseDouble(tokens[2]);
        command = MathCommand.valueOf(tokens[0]);
    }
}