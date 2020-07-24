package csc3020.hw06.gn8271;

// Homework 06
// Author: Raisa Zaman
public class Hw06Source {
    public static void main(String[] args) {
        String[] stringArray = {"add 1.0", "add xx 25.0", "addX 0.0 0.0", "divide 100.0 50.0", "add 25.0 92.0", "subtract 225.0 17.0", "multiply 11.0 3.0"};
        CalculateHelper calculateHelper = new CalculateHelper();
        for (String command: stringArray){
            try {
                calculateHelper.process(command);
                System.out.println(calculateHelper.toString());
            }
            catch (InvalidStatementException val)
            {
                if (val.getCause() != null)
                {
                    System.out.println(val.getMessage() + "\n    Original exception: " + val.getCause().getMessage());
                } else
                    System.out.println(val.getMessage() + "");

            }
        }
    }
}
