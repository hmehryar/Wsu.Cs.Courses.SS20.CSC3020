package csc3020.hw04MidTermProject.gg6997;

import csc3020.hw04MidTermProject.gg6997.MathEquation;

/**
 * Calculator Engine v5
 * Author: Manraj Singh
 * Email: manrajsingh@wayne.edu
 * Date: 06/17/2020
 * Description: Create a calculator engine with overloading and inheritance
 * */
public class Hw04MidTermSource {
    public static void main(String[] args){

        //instantiate MathEquation and output override result
        System.out.println("Using Overloads");
        csc3020.hw04MidTermProject.gg6997.MathEquation solve = new csc3020.hw04MidTermProject.gg6997.MathEquation('d');
        solve.execute(9., 4);
        solve.execute(9 , 4);

        //array of CalculateBase of 4 elements
        csc3020.hw04MidTermProject.gg6997.CalculateBase calculators[];
        calculators = new csc3020.hw04MidTermProject.gg6997.CalculateBase[4];

        //initiate constructor and call calculate method with division
        calculators[0] = new csc3020.hw04MidTermProject.gg6997.Divider(100, 50);
        double division = calculators[0].calculate();

        //initiate constructor and call calculate method with addition
        calculators[1] = new csc3020.hw04MidTermProject.gg6997.Adder(25, 92);
        double addition = calculators[1].calculate();

        //initiate constructor and call calculate method with subtraction
        calculators[2] = new csc3020.hw04MidTermProject.gg6997.Subtractor(225, 17);
        double subtraction = calculators[2].calculate();

        //initiate constructor and call calculate method with multiplication
        calculators[3] = new csc3020.hw04MidTermProject.gg6997.Multiplier(11, 3);
        double multiplication = calculators[3].calculate();

        //display result of inheritance calculations
        System.out.println(" ");
        System.out.println("Using Inheritance");
        System.out.println("Result= " + division);
        System.out.println("Result= " + addition);
        System.out.println("Result= " + subtraction);
        System.out.println("Result= " + multiplication);
    }
}
