package hw02.em0608;

public class hw02source {
    public static void main(String[] args) {

        // MathEquationArray[]
        // array of operations
        //myEquations is the array of values for left, right and operators
        //Call the create method to create an equation for +, -, x, /

        //Array for Addition
        MathEquation[] myEquation = {
                create(100, 50, 'a'),
                create(25, 92, 's'),
                create(225, 17, 'm'),
                create(11, 3, 'd')};


        //Make a loop on the instances {}
        //Call execute in loop
        //Perform for length of array
        System.out.println("Results:");
        for(int i = 0; i < myEquation.length; i++){
            MathEquation mathArray = myEquation[i];
            mathArray.execute();
            System.out.print(mathArray.results);
            System.out.print(" ");
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
