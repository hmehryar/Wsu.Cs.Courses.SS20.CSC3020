package com.csc3020.hw04MidTermProject.gv7006;

public class Hw04MidTermSource {
    public static void main(String[] args) {
        // Overloads
        System.out.println("Using Overloads\n");
        
        MathEquation mathEq1 = new MathEquation('d');
        mathEq1.execute(9.0d, 4.0d);
        System.out.printf("result = %.2f\n", mathEq1.getResult());
        
        MathEquation mathEq2 = new MathEquation('d');
        mathEq2.execute(9, 4);
        System.out.printf("result = %.2f\n", mathEq2.getResult());
        
        System.out.println();
        
        // Inheritance
        System.out.println("Using Inheritance\n");
        
        CalculateBase[] calculators = {
            new Divider(100, 50),
            new Adder(25, 92),
            new Subtractor(225, 17),
            new Multiplier(11, 3)
        };
        
        for (CalculateBase calc : calculators) {
            calc.calculate();
            System.out.printf("result = %.1f\n", calc.getResult());
        }
    }
}
