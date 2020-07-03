package hw03.gg6997;

/**
 * Calculator Engine v4
 * Author: Manraj Singh
 * Email: manrajsingh@wayne.edu
 * Date: 06/05/2020
 * Description: Create a calculator engine with constructors, accessors, & mutators if needed
 * */
public class Hw03Source {
    public static void main(String[] args) {

        //declare and assign variable for MathEquation class, create an object with new,
        //and call constructor to initialize new object and refer to variable
        hw03.gg6997.MathEquation calculations[]=new hw03.gg6997.MathEquation[4];
        //new variable given values and assigns them to MathEquation class
        calculations[0] = new hw03.gg6997.MathEquation(100,50,'/');
        calculations[1] = new hw03.gg6997.MathEquation(25,92,'+');
        calculations[2] = new hw03.gg6997.MathEquation(225,17,'-');
        calculations[3] = new hw03.gg6997.MathEquation(11,3,'*');

        //for loop goes through each array value in calculations and calls the execute function to compute answers
        for(int index = 0; index < calculations.length; index++) {
            calculations[index].execute();
        }
    }
}
