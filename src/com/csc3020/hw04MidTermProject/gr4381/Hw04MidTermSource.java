package csc3020.hw04MidTermProject.gr4381;
//
// Author: Matthew Martin
// Date: 2020-06-13
// Homework 04
//
public class Hw04MidTermSource {
    public static void main(String[] args){

        // Overload
        System.out.println("Using Overloads\n");
        MathEquation exampleDoubleEquation = new MathEquation('d'); // Overload 5. MathEquation using MathEquation(char) constructor
        System.out.println(exampleDoubleEquation.execute(9.0d, 4.0d)); // execute using (double, double) method

        MathEquation exampleIntEquation = new MathEquation('d'); // Overload 6.
        System.out.println(exampleIntEquation.execute(9, 4)); // execute using (int, int) method

        //Inheritance
        System.out.println("\nUsing Inheritance\n");
        CalculateBase[] calculators = new CalculateBase[4]; // Inheritance 8. a
        
        calculators[0] = new Divider(100, 50); // Inheritance 8. b
        calculators[1] = new Adder(25, 92);
        calculators[2] = new Subtractor(225, 17);
        calculators[3] = new Multiplier(11, 3);

        for (CalculateBase calc:calculators) { // performs calculations and prints the result for every calculator in the array
            System.out.println("result=" + calc.getResult()); // Inheritance 8. c-d
        }
    }

}
