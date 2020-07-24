package csc3020.hw06.go3480;

public class Hw06Source {
    public static void main(String[] args) {
        String[] equations= {
                "add 1.0",              //Error: incorrect number of values
                "add xx 25.0",          // Error: non-numeric data
                "addX 0.0 0.0",         // Error: invalid command
                "divide 100.0 50.0",
                "add 25.0 92.0",
                "subtract 225.0 17.0",
                "multiply 11.0 3.0"
        };

        for (String equation : equations) {
            CalculateHelper calculator = new CalculateHelper();
            try {
                calculator.process(equation);

                System.out.println(calculator.toString());
            } catch(InvalidStatementException e) {
                System.out.println(e.getMessage());
                if(e.getCause() != null)
                    System.out.println("\tOriginal exception: "+e.getCause().getMessage());
            }
        }
    }
}
