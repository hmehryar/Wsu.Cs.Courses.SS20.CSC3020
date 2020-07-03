package csc3020.hw03.gr4381;
//
// Author: Matthew Martin
// Date: 2020-05-31
// Homework 03
//
public class Hw03Source {
    public static void main(String[] args){

        MathEquation[] mathEquationsArray = new MathEquation[4];

        mathEquationsArray[0] = new MathEquation(100, 50, 'd');
        mathEquationsArray[1] = new MathEquation(25, 92, 'a');
        mathEquationsArray[2] = new MathEquation(225, 17, 's');
        mathEquationsArray[3] = new MathEquation(11, 3, 'm');

        for (int index = 0; index < mathEquationsArray.length; index++) {
            mathEquationsArray[index].printResult();
        }

    }

}
