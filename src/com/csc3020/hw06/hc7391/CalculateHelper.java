package csc3020.hw06.hc7391;

public class CalculateHelper {

    private double leftVal;
    private double rightVal;
    private double result;

    MathCommand command;

    private CalculateBase calculator = null;

    CalculateHelper() { }

    public double getResult() {
        return result;
    }

    @Override
    public String toString() {
        if(command == MathCommand.Add){
            return leftVal + " + " + rightVal + " = " + this.result;
        }else if (command == MathCommand.Subtract){
            return leftVal + " - " + rightVal + " = " + this.result;
        }else if (command == MathCommand.Divide){
            return leftVal + " / " + rightVal + " = " + this.result;
        }else{
            return leftVal + " * " + rightVal + " = " + this.result;
        }

    }


    public void process (String input) throws InvalidStatementException{

        String[] parse = input.split(" ");
        if(parse.length !=3){
            throw new InvalidStatementException("Incorrect Number Of Fields", input);
        }
        try{
            leftVal = Double.parseDouble(parse[1]);
            rightVal = Double.parseDouble(parse[2]);
        }catch(NumberFormatException numberFormatException){
            throw new InvalidStatementException("Non-Numeric Data", input, numberFormatException);
        }



        //this switch ensures the input is all lowercase to reduce error
           switch (parse[0].toLowerCase()) { //don't use in bigger program
               case "divide":
                   command = MathCommand.Divide;
                   break;
               case "add":
                   command = MathCommand.Add;
                   break;
               case "subtract":
                   command = MathCommand.Subtract;
                   break;
               case "multiply":
                   command = MathCommand.Multiply;
                   break;
               default:
                   throw new InvalidStatementException("Invalid Command", input);
           }

        switch(command){
            case Divide:
                calculator = new Divider(leftVal, rightVal);
                calculator.calculate();
                this.result = calculator.getResult();
                break;
            case Add:
                calculator = new Adder(leftVal, rightVal);
                calculator.calculate();
                this.result = calculator.getResult();
                break;
            case Subtract:
                calculator = new Subtractor(leftVal, rightVal);
                calculator.calculate();
                this.result = calculator.getResult();
                break;
            case Multiply:
                calculator = new Multiplier(leftVal, rightVal);
                calculator.calculate();
                this.result = calculator.getResult();
                break;
            default:
                System.out.println("There is a problem");
                break;

        }

    }


}
