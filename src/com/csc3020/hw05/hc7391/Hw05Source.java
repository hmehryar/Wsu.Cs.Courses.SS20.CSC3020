package csc3020.hw05.hc7391;
//CSC 3020 Homework 5
//Author: Bryan Vinson ID: hc7391
//This program takes a string input to set values and operation to be performed. This program also uses
//enums to define which type of object to create for the appropriate operation.
public class Hw05Source {

    public static void main(String[] args) {
    int arraySize = 4; // avoid magic numbers
	String[] stringCalc = new String[arraySize];
	stringCalc[0] = "divide 100.0 50.0";
	stringCalc[1] = "add 25.0 92.0";
	stringCalc[2] = "subtract 225.0 17.0";
	stringCalc[3] = "multiply 11.0 3.0";

     CalculateHelper parse = new CalculateHelper();

		for (int i = 0; i < stringCalc.length ; i++) {
			parse.process(stringCalc[i]);
			System.out.println(parse.toString());
		}
		//parse.process(stringCalc[0]);

    }
}
