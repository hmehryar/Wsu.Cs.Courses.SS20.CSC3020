package hw03.gn8271;
// Homework03
// Author: Raisa Zaman
public class Hw03Source {
    public static void main(String[] args) {
        //Print the statement with the results
        MathEquation division = new MathEquation();
        division.setLeftValue(100);
        division.setRightValue(50);
        division.setOpCode('d');
        division.execute();
        System.out.println("result= "+ division.getResult());
        MathEquation addition = new MathEquation(25,92,'a');
        addition.execute();
        System.out.println("result= "+ addition.getResult());
        MathEquation subtraction = new MathEquation(225,17,'s');
        subtraction.execute();
        System.out.println("result= "+ subtraction.getResult());
        MathEquation multiplication = new MathEquation(11,3,'m');
        multiplication.execute();
        System.out.println("result= "+multiplication.getResult());

    }
}
