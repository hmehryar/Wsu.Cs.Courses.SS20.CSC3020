package csc3020.hw06.hm;

public class Hw06Source {
    public static void main(String[] args) {
        String[] statements= {
                "add 1.0",              //Error: Incorrect number of values
                "add xx 25.0",          //Error: Non-numeric data
                "addX 0.0 0.0",         //Error: invalid command
                "divide 100.0 50.0",
                "add 25.0 92.0",
                "subtract 225.0 17.0",
                "multiply 11.0 3.0"
        };
        CalculateHelper helper=new CalculateHelper();
        for (String statement:statements) {
            try{
                helper.process(statement);
                System.out.println(helper);
            }
            catch (InvalidStatementException oInvalidStatementException){
                System.out.println(oInvalidStatementException.getMessage());
                if(oInvalidStatementException.getCause()!=null){
                    System.out.println("   Original exception: "+oInvalidStatementException.getCause().getMessage());
                }
            }


        }
    }
}
