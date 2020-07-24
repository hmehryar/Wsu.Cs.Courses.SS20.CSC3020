package csc3020.hw05.gn8271;
// Homework 05
// Author: Raisa Zaman
public class Hw05Source {
    public static void main(String[] args)  {
        String[] stringArray = {"divide 100.0 50.0" , "add 25.0 92.0" , "subtract 225.0 17.0" , "multiply 11.0 3.0" };
        com.csc3020.hw05.gn8271.CalculateHelper calculateHelperO = new com.csc3020.hw05.gn8271.CalculateHelper();
        for (int i = 0; i < 4; i++)
        {
            calculateHelperO.process(stringArray[i]);
            System.out.println(calculateHelperO.toString());
        }



    }
}
