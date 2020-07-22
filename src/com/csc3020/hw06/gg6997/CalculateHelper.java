package csc3020.hw06.gg6997;

import csc3020.hw06.gg6997.MathCommand;
import csc3020.hw06.gg6997.InvalidStatementException;

//class calculate helper executes code from string array
public class CalculateHelper extends csc3020.hw06.gg6997.CalculateBase {
    private double leftValue;
    private double rightValue;
    private double result;
    MathCommand command;

    public CalculateHelper() {
        leftValue =0;
        rightValue=0;
        result =0;
        command = null;
    }

    //void method process stores all 3 parts of each string and then calls calculateBase extensions to store result
    public void process(String array) throws InvalidStatementException {
        //splits array into 3 segments and assigns them 
        String[] segment = array.split(" ");

        //checks if string has 3 parts, otherwise size is invalid and exception thrown
        if(segment.length!=3)
            throw new InvalidStatementException("Incorrect number of fields",array);
        //checks if value is a number, if not, then exception thrown for non-number
        //found out about \d which matches all numbers
        if(!segment[1].matches("-?\\d+(.\\d+)?")){
            throw new InvalidStatementException("Non-numeric data",array,new Throwable("For input string: "+segment[1]));
        }
        //checks if second number is a number, if not, then same exception thrown
        if(!segment[2].matches("-?\\d+(.\\d+)?")){
            throw new InvalidStatementException("Non-numeric data",array,new Throwable("For input string: "+segment[2]));
        }
        //checks if enum command is one of the four operations, if not then exception thrown
        if(!(segment[0].equals("Add") || segment[0].equals("Subtract") ||
                segment[0].equals("Multiply") || segment[0].equals("Divide"))){
            throw new InvalidStatementException("Invalid command",array);
        }
        //assigns values of string to these variables
        command = MathCommand.valueOf(segment[0]);
        leftValue = Double.parseDouble(segment[1]);
        rightValue = Double.parseDouble(segment[2]);
        

    }

    //override toString to run each case and return the right operation and result
    @Override
    public String toString() {
        String result1 ="";
        if(command==MathCommand.Add)
            result1 = leftValue+" + "+rightValue+" = "+result;
        if(command==MathCommand.Subtract)
            result1 = leftValue+" - "+rightValue+" = "+result;
        if(command==MathCommand.Multiply)
            result1 = leftValue+" * "+rightValue+" = "+result;
        if(command==MathCommand.Divide)
            result1 = leftValue+" / "+rightValue+" = "+result;
        return result1;
    }
    
    //calculate method looks at each command and calls appropriate adder, subtractor, multiplier, divider
    @Override
    public void calculate() {

        switch (command)
        {
            case Add:
                csc3020.hw06.gg6997.Adder add = new csc3020.hw06.gg6997.Adder(leftValue,rightValue);
                add.calculate();
                result = add.getResult();
                break;
            case Subtract:
                csc3020.hw06.gg6997.Subtractor subtractor = new csc3020.hw06.gg6997.Subtractor(leftValue,rightValue);
                subtractor.calculate();
                result = subtractor.getResult();
                break;
            case Multiply:
                csc3020.hw06.gg6997.Multiplier multiplier = new csc3020.hw06.gg6997.Multiplier(leftValue,rightValue);
                multiplier.calculate();
                result = multiplier.getResult();
                break;
            case Divide:
                csc3020.hw06.gg6997.Divider divider = new csc3020.hw06.gg6997.Divider(leftValue,rightValue);
                divider.calculate();
                result = divider.getResult();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + command);
        }
    }
}
