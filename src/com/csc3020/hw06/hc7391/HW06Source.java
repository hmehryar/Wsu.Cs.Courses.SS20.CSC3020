package csc3020.hw06.hc7391;
//CSC 3020 HW06
//Author: Bryan Vinson hc7391
//This program implements custom try/catch exception handling to catch input errors
public class HW06Source {

    public static void main(String[] args) throws InvalidStatementException {
	String[] arrayCalc =
            {"add 1.0", "add xx 25.0", "addX 0.0 0.0", "divide 100.0 50.0","add 25.0 92.0","subtract 225.0 17.0","multiply 11.0 3.0"};

	CalculateHelper parse = new CalculateHelper();

    for (int i = 0; i < arrayCalc.length; i++) {
        try {
            parse.process(arrayCalc[i]);
            System.out.println(parse.toString());
        }catch(InvalidStatementException e){
            System.out.println(e.getMessage()+((e.getCause()!=null)?("\n\t\tOriginal Exception: "+e.getCause().getMessage()) : ""));
        }
    }


    } //end public
}
