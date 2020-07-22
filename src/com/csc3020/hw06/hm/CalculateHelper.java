package csc3020.hw06.hm;

import java.util.regex.PatternSyntaxException;

public class CalculateHelper {

    private static final char ADD_SYMBOL='+';
    private static final char SUBTRACT_SYMBOL='-';
    private static final char MULTIPLY_SYMBOL='*';
    private static final char DIVIDE_SYMBOL='/';

    double leftValue;
    double rightValue;
    double result;
    MathCommand command;

    public void process(String statement) throws InvalidStatementException
    {
        //add 1.0 2.0
        String[] parts=statement.split(" ");
        if(parts.length!=3){
            throw new InvalidStatementException("Incorrect number of values",statement);
        }
        String commandString=parts[0];

        try{
            leftValue= Double.parseDouble( parts[1]);
            rightValue=Double.parseDouble(parts[2]);
        }catch (NumberFormatException oNumberFormatException){
            throw new InvalidStatementException("Non-numeric data",statement,oNumberFormatException);
        }

        setCommandFromString(commandString);
        if(command==null){
            throw new InvalidStatementException("Invalid command",statement);
        }

        CalculateBase calculator=null;
        switch (command){
            case Add:
                calculator=new Adder(leftValue,rightValue);
                break;
            case Subtract:
                calculator=new Subtractor(leftValue,rightValue);
                break;
            case Multiply:
                calculator=new Multiplier(leftValue,rightValue);
                break;
            case Divide:
                calculator=new Divider(leftValue,rightValue);
                break;
        }
        calculator.calculate();
        result= calculator.getResult();
    }
    private void setCommandFromString(String commandString){
        //add -> MathCommand.Add
        if(commandString.equalsIgnoreCase(MathCommand.Add.toString())){
            command=MathCommand.Add;
        }else if (commandString.equalsIgnoreCase(MathCommand.Subtract.toString())){
            command=MathCommand.Subtract;
        }else if(commandString.equalsIgnoreCase(MathCommand.Multiply.toString())){
            command=MathCommand.Multiply;
        }else if(commandString.equalsIgnoreCase(MathCommand.Divide.toString())){
            command=MathCommand.Divide;
        }
    }

    @Override
    public String toString() {
        // 1.0 + 2.0 = 3.0
        char symbol=' ';
        switch (command){
            case Add:
                symbol=ADD_SYMBOL;
                break;
            case Divide:
                symbol=DIVIDE_SYMBOL;
                break;
            case Multiply:
                symbol=MULTIPLY_SYMBOL;
                break;
            case Subtract:
                symbol=SUBTRACT_SYMBOL;
                break;
        }
        StringBuilder oStringBuilder=new StringBuilder(20);
        oStringBuilder.append(leftValue);
        oStringBuilder.append(' ');
        oStringBuilder.append(symbol);
        oStringBuilder.append(' ');
        oStringBuilder.append(rightValue);
        oStringBuilder.append(" = ");
        oStringBuilder.append(result);
        return oStringBuilder.toString();
    }
}
