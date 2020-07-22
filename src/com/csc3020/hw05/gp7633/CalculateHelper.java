package csc3020.hw05.gp7633;

import static csc3020.hw05.gp7633.MathCommand.*;

public class CalculateHelper extends CalculateBase {
    double leftVal;
    double rightVal;
    double result;
    MathCommand command;

    void process(String input) {
        String[] arr = input.split(" ");
        leftVal = Double.parseDouble(arr[1]);
        rightVal = Double.parseDouble(arr[2]);

        if (arr[0].equals("divide")) {
            command = Divide;
            Divider oDivide = new Divider(leftVal, rightVal);
            oDivide.calculate();
            result = oDivide.getResult();
        }
        else if (arr[0].equals("add")) {
            command = Add;
            Adder oAdd = new Adder(leftVal, rightVal);
            oAdd.calculate();
            result = oAdd.getResult();
        }
        else if (arr[0].equals("subtract")) {
            command = Subtract;
            Subtractor oSub = new Subtractor(leftVal, rightVal);
            oSub.calculate();
            result = oSub.getResult();
        }
        else {
            command = Multiply;
            Multiplier oMul = new Multiplier(leftVal, rightVal);
            oMul.calculate();
            result = oMul.getResult();
        }
    }

    @Override
    public String toString() {
        if (command == Add)
            return leftVal + " " + "+" + " " + rightVal + " = " + result;
        else if (command == Subtract)
            return leftVal + " " + "-" + " " + rightVal + " = " + result;
        else if (command == Divide)
            return leftVal + " " + "/" + " " + rightVal + " = " + result;
        else
            return leftVal + " " + "*" + " " + rightVal + " = " + result;
    }
}
