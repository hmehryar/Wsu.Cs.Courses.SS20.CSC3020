package csc3020.hw05.hm;

public class Hw05Source {
    public static void main(String[] args) {
//        “divide 100.0 50.0”
//        “add 25.0 92.0”
//        “subtract 225.0 17.0”
//        “multiply 11.0 3.0”
        String[] statements= {
                        "divide 100.0 50.0",
                        "add 25.0 92.0",
                        "subtract 225.0 17.0",
                        "multiply 11.0 3.0"
                };

        CalculateHelper helper=new CalculateHelper();
        for (String statement:statements){
            helper.process(statement);
            System.out.println(helper);
        }
    }
}
