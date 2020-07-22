package com.csc3020.hw5.em0608;

public class CalculateHelper{
    double leftValue;
    double rightValue;
    double result;
    char operator;
    MathCommand command;


    public void process(String input){
        String[] parts = input.split(" ");
        command = setCommandFromString(parts[0]);
        leftValue = Double.parseDouble(parts[1]);
        rightValue = Double.parseDouble(parts[2]);



            if(command == MathCommand.divide) {

                Divider divider = new Divider(leftValue, rightValue);
                operator = '/';
                divider.calculate();
                result = divider.getResult();
            }

            else if(command == MathCommand.add) {
                Adder adder = new Adder(leftValue, rightValue);
                operator = '+';
                adder.calculate();
               result= adder.getResult();
            }

            else if(command == MathCommand.subtract) {
                Subtractor subtractor = new Subtractor(leftValue, rightValue);
                operator = '-';
                subtractor.calculate();
               result = subtractor.getResult();
            }

            else if(command == MathCommand.multiply) {
                Multiplier multiplier = new Multiplier(leftValue, rightValue);
                operator = '*';
                multiplier.calculate();
               result = multiplier.getResult();
            }



    }

    private MathCommand setCommandFromString(String commandString) {
        if(commandString.equalsIgnoreCase(MathCommand.add.toString())){
            return MathCommand.add;
        } else if(commandString.equalsIgnoreCase(MathCommand.subtract.toString())){
            return MathCommand.subtract;
        }else if(commandString.equalsIgnoreCase(MathCommand.multiply.toString())){
            return MathCommand.multiply;
        }else if(commandString.equalsIgnoreCase(MathCommand.divide.toString())){
            return MathCommand.divide;
        }else{
            return null;
        }
    }



    @Override
    public String toString() {
        return
                " " + leftValue + " " + operator +
                " " + rightValue +
                " = " + result;
    }
}

