package csc3020.hw05.gg6997;

import csc3020.hw05.gg6997.MathCommand;
import csc3020.hw05.gg6997.CalculateBase;
import csc3020.hw05.gg6997.Adder;
import csc3020.hw05.gg6997.Subtractor;
import csc3020.hw05.gg6997.Multiplier;
import csc3020.hw05.gg6997.Divider;

public class CalculateHelper {
    //declare variables
    double leftValue;
    double rightValue;
    double result;
    MathCommand command;

    //override toString to run each case and return the right operation and result
    @Override
    public String toString() {
        if(command == MathCommand.Add)
            return leftValue + " + " + rightValue + " = " + result;

        else if(command == MathCommand.Subtract)
            return leftValue + " - " + rightValue + " = " + result;

        else if(command == MathCommand.Multiply)
            return leftValue + " * " + rightValue + " = " + result;

        else if (command == MathCommand.Divide)
            return leftValue + " / " + rightValue + " = " + result;
        else
            return null;
    }

    //void method process stores all 3 parts of each string and then calls calculateBase extensions to store result
    public void process(String array){
        //splits each array into substrings
        String[] segment = array.split(" ");
        command = MathCommand.valueOf(segment[0]);      //first part calls enum
        leftValue = Double.parseDouble(segment[1]);     //second part calls 1st number and stores as leftVal
        rightValue = Double.parseDouble(segment[2]);    //third part calls 2nd number and stores as rightVal

        //initiate constructor
        CalculateBase calculator = null;

        //if else statements look at enum value, and perform calculations by calling extended math classes
        if (command == MathCommand.Add) {
            //set constructor to adder and input numbers
            calculator = new Adder(leftValue, rightValue);
            calculator.calculate();
            result = calculator.getResult();   //calculate method called from adder to store result
        }
        //if else statements look at enum value, and perform calculations by calling extended math classes
        else if (command == MathCommand.Subtract) {
            //set constructor to subtractor and input numbers
            calculator = new Subtractor(leftValue, rightValue);
            calculator.calculate();
            result = calculator.getResult();   //calculate method called from subtractor to store result
        }
        //if else statements look at enum value, and perform calculations by calling extended math classes
        else if (command == MathCommand.Multiply) {
            //set constructor to multiplier and input numbers
            calculator = new Multiplier(leftValue, rightValue);
            calculator.calculate();
            result = calculator.getResult();   //calculate method called from multiplier to store result
        }
        //if else statements look at enum value, and perform calculations by calling extended math classes
        else if(command == MathCommand.Divide) {
            //set constructor to divider and input numbers
            calculator = new Divider(leftValue, rightValue);
            calculator.calculate();
            result = calculator.getResult();   //calculate method called from divider to store result
        }
        else
            System.out.println("Error!");
    }
}
