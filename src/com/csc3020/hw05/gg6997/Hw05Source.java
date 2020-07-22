package csc3020.hw05.gg6997;

import csc3020.hw05.gg6997.CalculateHelper;
/**
 * Calculator Engine v6
 * Author: Manraj Singh
 * Email: manrajsingh@wayne.edu
 * Date: 07/01/2020
 * Description: Create a calculator engine with data types
 * */

public class Hw05Source {
    public static void main(String[] args) {
        //declare string array with the 4 inputs of 1 operation & 2 numbers
        String[] string = {"Divide 100.0 50.0", "Add 25.0 92.0", "Subtract 225.0 17.0", "Multiply 11.0 3.0"};
        //instantiate calculateHelper as array value
        CalculateHelper array = new CalculateHelper();

        //for loop goes from index 0 to 3 and outputs the results from calculateHelper
        for (int index = 0; index < string.length; index++){
            //calls void function with inputs of the string array
            array.process(string[index]);

            //prints the overrode toString from calculateHelper
            System.out.println(array.toString());
        }
    }
}

