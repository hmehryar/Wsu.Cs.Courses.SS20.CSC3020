package csc3020.hw03.em0608;

public class hw03source {
    public static void main(String[] args) {

        //Dividing two values together
        MathEquation division = new MathEquation(100, 50, 'd');
        System.out.println("Result = " + division.getResults());

        //Adding two values together
        MathEquation addition = new MathEquation(25, 92, 'a');
        System.out.println("Result = " + addition.getResults());

        //Subtracting two values together
        MathEquation subtraction = new MathEquation(225, 17, 's');
        System.out.println("Result = " + subtraction.getResults());

        //Multiplying two values together
        MathEquation multiplication = new MathEquation(11, 3, 'm');
        System.out.println("Result = " + multiplication.getResults());

    }

}

