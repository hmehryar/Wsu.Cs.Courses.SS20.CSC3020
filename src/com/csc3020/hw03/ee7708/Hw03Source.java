package hw03.ee7708;

public class Hw03Source
{
    public static void main(String[] args)
    {
        //Create an array of equations which we can iterate over later to print the calculation result
        MathEquation[] equationsArray = {
                new MathEquation(100.0,50.0,'/'),
                new MathEquation(25,92,'+'),
                new MathEquation(225,17,'-'),
                new MathEquation(11,3,'*')
        };

        //Iterate over the calculation result and print the result to the user
        for (MathEquation equation : equationsArray)
        {
            equation.execute();
            System.out.printf("result = %.1f\n", equation.getResult());
        }
    }
}
