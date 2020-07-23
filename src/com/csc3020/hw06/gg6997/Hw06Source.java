package csc3020.hw06.gg6997;

/**
 * Calculator Engine v7
 * Author: Manraj Singh
 * Email: manrajsingh@wayne.edu
 * Date: 07/01/2020
 * Description: Create a calculator engine with data types that handles exceptions
 * */

public class Hw06Source {
    public static void main(String[] args) {
        //declare string array with the 4 inputs of 1 operation & 2 numbers
        String[] string ={ "Add 1.0", "Add xx 25.0", "Addx 0.0 0.0",
                "Divide 100.0 50.0", "Add 25.0 92.0","Subtract 225.0 17.0",
                "Multiply 11.0 3.0"};

        //instantiate calculateHelper as array value
        csc3020.hw06.gg6997.CalculateHelper array= new csc3020.hw06.gg6997.CalculateHelper();

        //for loop goes from index 0 to 3 and outputs the results from calculateHelper
        for (int index = 0; index < string.length; index++) {
            //goes through a value from process
            try{
                //calls method with inputs of the string array
                array.process(string[index]);
                array.calculate();
                System.out.println(array);
            }
            //if exception found, custom exceptions called and output them with error message
            catch(csc3020.hw06.gg6997.InvalidStatementException e){
                System.out.println(e.getMessage());
                if(e.getCause()!=null){
                    System.out.println("\tOriginal exception: "+e.getCause().getMessage());
                }
            }
    }
    }
}
