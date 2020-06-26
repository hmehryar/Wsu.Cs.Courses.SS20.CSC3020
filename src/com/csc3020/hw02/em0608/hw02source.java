package com.csc3020.hw02.em0608;

public class hw02source {
    public static void main(String[] args) {

        // MathEquationArray[]
        // array of operations
        //myEquations is the array of values for left, right and operators
        //Call the create method to create an equation for +, -, x, /

        //Array for Addition
        MathEquation[] myEquationAdd = {
                create(100, 50, 'a'),
                create(25, 92, 'a'),
                create(225, 17, 'a'),
                create(11, 3, 'a')};

        //Array for Subtraction
        MathEquation[] myEquationSubtract = {
                create(100, 50, 's'),
                create(25, 92, 's'),
                create(225, 17, 's'),
                create(11, 3, 's')};

        //Array for Division
        MathEquation[] myEquationDivide = {
                create(100, 50, 'd'),
                create(25, 92, 'd'),
                create(225, 17, 'd'),
                create(11, 3, 'd')};

        //Array for Multiplication
        MathEquation[] myEquationMultiply = {
                create(100, 50, 'm'),
                create(25, 92, 'm'),
                create(225, 17, 'm'),
                create(11, 3, 'm')};


        //Make a loop on the instances {}
        //Call execute in loop
        //Perform for length of array
        System.out.println("Addition Results:");
        for(int i = 0; i < myEquationAdd.length; i++){
            MathEquation mathArray = myEquationAdd[i];
            mathArray.execute();
            System.out.print(mathArray.results);
        }

        System.out.println(" ");
        System.out.println("Subtraction Results: ");
        for(int i = 0; i < myEquationSubtract.length; i++){
            MathEquation mathArray = myEquationSubtract[i];
            mathArray.execute();
            System.out.print(mathArray.results);
        }

        System.out.println(" ");
        System.out.println("Division Results: ");
        for(int i = 0; i < myEquationDivide.length; i++){
            MathEquation mathArray = myEquationDivide[i];
            mathArray.execute();
            System.out.print(mathArray.results);
        }

        System.out.println(" ");
        System.out.println("Multiplication Results: ");
        for(int i = 0; i < myEquationMultiply.length; i++){
            MathEquation mathArray = myEquationMultiply[i];
            mathArray.execute();
            System.out.print(mathArray.results);
        }
    }

    //Math Equation Class - create
    //Parameters left, right and opCode
    //Creates a new object called myEquation
    //Return myEquation
    public static MathEquation create (double left, double right, char opCode){
        MathEquation myEquation = new MathEquation(left, right, opCode);
        return myEquation;
    }

}
