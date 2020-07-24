package csc3020.hw04MidTermProject.gn8271;


public class Hw04MidTermSource {
    public static void main(String[] args)
    {
        System.out.println("Using Overloads");
        System.out.println(" ");
        //Double Equation
        //Instantiate a MathEquation class
        MathEquation oMathEquation1 = new MathEquation('d');
        //Execute takes in two double inputs
        oMathEquation1.execute (9., 4.);
        //Print out result
        System.out.println("result=" +oMathEquation1.getResult());

        //Integer Equation
        //Instantiate a MathEquation class
        MathEquation oMathEquation2 = new MathEquation('d');
        //Execute takes in two integer inputs
        oMathEquation2.execute (9, 4);
        //Print out result
        System.out.println("result=" +oMathEquation2.getResult());
        System.out.println("");

        System.out.println("Using Inheritance");
        System.out.println(" ");
        CalculateBase [] oCalculateBase = new CalculateBase[4];
        oCalculateBase [0] = new Divider(100,50);
        oCalculateBase[0].calculate();
        oCalculateBase [1] = new Adder(25,92);
        oCalculateBase[1].calculate();
        oCalculateBase [2] = new Subtractor(225,17);
        oCalculateBase[2].calculate();
        oCalculateBase [3] = new Multiplier(11,3);
        oCalculateBase[3].calculate();
        for (int i= 0; i < 4; i++)
        {
            System.out.println("result=" + oCalculateBase[i].getResult());
        }
    }
}
