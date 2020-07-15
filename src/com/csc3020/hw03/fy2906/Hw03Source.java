package csc3020.hw03.fy2906;

public class Hw03Source {
    public static void main(String[] args) {
        //creates MathEquation objects to test the operations
        MathEquation test1 = new MathEquation(100, 50, 'd');
        MathEquation test2 = new MathEquation(25, 92, 'a');
        MathEquation test3 = new MathEquation(225, 17, 's');
        MathEquation test4 = new MathEquation(11, 3, 'm');

        //calculates 100 / 50 and outputs the result
        test1.execute();
        System.out.println("result = " + test1.getResult());

        //calculates 25 + 92 and outputs the result
        test2.execute();
        System.out.println("result = " + test2.getResult());

        //calculates 225 - 17 and outputs the results
        test3.execute();
        System.out.println("result = " + test3.getResult());

        //calculates 11 * 3 and outputs the results
        test4.execute();
        System.out.println("result = " + test4.getResult());

    }
}
