package com.csc3020.hw05.go5334;

public class Hw05Source {
    public static void main(String[] args)
    {
        String[] equation ={"Divide 100.0 50.0",
                "Add 25.0 92.0", "Subtract 225.0 17.0",
                "Multiply 11.0 3.0"};
        CalculateHelper help= new CalculateHelper();
        for (int i = 0;i<equation.length;i++)
        {
            help.process(equation[i]);
            help.calculate();
            System.out.println(help);
        }
    }
}
