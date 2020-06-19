package hw02.go1277;

public class Hw02Source {
    public static void main(String[] args)
    {
        MathEquations[] equations = new MathEquations[4];
        double[] leftValArray = {100.0, 25.0, 225.0, 11.0};
        double[] rightValArray = {50.0, 92.0, 17.0, 3.0};
        double result;
        char[] opCodeArray = {'a', 's', 'm', 'd'};
        System.out.print("Left Values: ");
        for(int k = 0; k < 4; k++)
        {
            System.out.print(leftValArray[k]);
            System.out.print("  ");
        }
        System.out.println(" ");
        System.out.print("Right Values:  ");
        for(int n = 0; n < 4; n++)
        {
            System.out.print(rightValArray[n]);
            System.out.print("  ");
        }
        System.out.println(" ");
        for(int i = 0; i < 4; i++) // for operations
        {
            switch(opCodeArray[i])
                {
                    case 'a':
                        System.out.print("Addition:  ");
                        break;
                    case 's':
                        System.out.print("Subtraction:  ");
                        break;
                    case 'm':
                        System.out.print("Multiplication:  ");
                        break;
                    case 'd':
                        System.out.print("Division:  ");
                        break;
                    default:
                        System.out.println("Error");
                }
            for(int j = 0; j < 4; j++) // right and left
            {
                equations[i] = create(leftValArray[j], rightValArray[j], opCodeArray[i]);
                System.out.print(equations[i].getResult());
                System.out.print("  ");
            }
            System.out.println(" ");
        }
    }

    public static MathEquations create(double l, double r, char operation)
    {
        MathEquations oMathEquation = new MathEquations(l,r,operation);
        oMathEquation.execute();

        return oMathEquation;
    }
}