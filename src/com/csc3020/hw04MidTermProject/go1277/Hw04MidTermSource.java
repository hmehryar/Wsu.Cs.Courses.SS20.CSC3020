package csc3020.hw04MidTermProject.go1277;


public class Hw04MidTermSource
{
    public static void main(String[] args)
    {
        char code ='d';
        double leftVal = 9;
        double rightVal = 4;
        MathEquations Equations1 = new MathEquations(code);
        Equations1.execute(leftVal,rightVal);
        System.out.println(Equations1.getResult());

         MathEquations Equations2 = new MathEquations(code);
        Equations2.execute((int)leftVal,(int)rightVal);
        System.out.println(Equations2.getResult());

        CalculateBase [] Calculators = new CalculateBase[4];
        Calculators[0] = new Adder(25,92);
        Calculators[0].calculate();
        System.out.print("result = ");
        System.out.println(Calculators[0].getResult());
        Calculators[1] = new Subtractor(225,17);
        Calculators[1].calculate();
        System.out.print("result = ");
        System.out.println(Calculators[1].getResult());
        Calculators[2] = new Multiplier(11,3);
        Calculators[2].calculate();
        System.out.print("result = ");
        System.out.println(Calculators[2].getResult());
        Calculators[3] = new Divider(100,50);
        Calculators[3].calculate();
        System.out.print("result = ");
        System.out.println(Calculators[3].getResult());


    }




}
