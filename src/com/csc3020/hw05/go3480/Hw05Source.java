package csc3020.hw05.go3480;

public class Hw05Source {
    public static void main(String[] args) {
        String[] equations = new String [] {
                "divide 100.0 50.0",
                "add 25.0 92.0",
                "subtract 225.0 17.0",
                "multiply 11.0 3.0"};

        for (String equation : equations) {
            CalculateHelper calculator = new CalculateHelper();
            calculator.process(equation);
            System.out.println(calculator.toString());
        }
    }
}
