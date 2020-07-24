package csc3020.hw03.go1277;



public class Hw03Source
{
    public static void main(String[] args)
    {
        MathEquations division = new MathEquations(100, 50, 'd');
        division.execute();
        System.out.print("Result:  ");
        System.out.println(division.getResult());

        MathEquations addition = new MathEquations(25, 92, 'a');
        addition.execute();
        System.out.print("Result:  ");
        System.out.println(addition.getResult());

        MathEquations subtraction = new MathEquations(225, 17, 's');
        subtraction.execute();
        System.out.print("Result:  ");
        System.out.println(subtraction.getResult());

        MathEquations multiplication = new MathEquations(11, 3, 'm');
        multiplication.execute();
        System.out.print("Result:  ");
        System.out.println(multiplication.getResult());

    }




}
