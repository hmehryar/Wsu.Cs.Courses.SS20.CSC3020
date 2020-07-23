package com.csc3020.hw04MidTermProject.hc7391;
//CSC 3020 MidTerm
//Author: Bryan Vinson (ID: hc7391)
//This program utilizes overloading methods and class inheritance to perform mathematical operations.
public class Hw04MidTermSource
{

    public static void main(String[] args)
    {

    //PART 1: OVERLOAD

    //Instantiate Objects
	MathEquation divideDouble = new MathEquation('d');
	divideDouble.execute(9.0,4.0);

	MathEquation divideInt = new MathEquation('d');
	divideInt.execute(9,4);

	//printing results
	 System.out.println("Using Overloads:");
	 System.out.println("Result = "+divideDouble.getResult());
     System.out.println("Result= "+divideInt.getResult());
     System.out.println();

     // PART 2: INHERITANCE

		int arraySize = 4;
		CalculateBase[] calculators = new CalculateBase[arraySize];
		calculators[0] = new Divider(100.0,50.0);
		calculators[1] = new Adder(25.0, 92.0);
		calculators[2] = new Subtractor(225,17);
		calculators[3] = new Multiplier(11,3);

		System.out.println("Using Inheritance: ");

		for (int i = 0; i < calculators.length ; i++)
		{
			calculators[i].calculate();
			System.out.println("Result: "+calculators[i].getResult());
		}



    }//end public main
}
