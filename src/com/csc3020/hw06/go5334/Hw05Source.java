package com.csc3020.hw06.go5334;

public class Hw05Source {
    public static void main(String[] args) {
        String[] functions = {
                "Add 1.0",
                "Add xx 25.0",
                "Addx 0.0 0.0",
                "Divide 100.0 50.0",
                "Add 25.0 92.0",
                "Subtract 225.0 17.0",
                "Multiply 11.0 3.0"
        };
        CalculateHelper helper = new CalculateHelper();
        for (int i = 0; i < functions.length; i++){
            try{
                helper.process(functions[i]);
                helper.calculate();
                System.out.println(helper);
            }catch(InvalidStatementException e){
                System.out.println(e.getMessage());
                if(e.getCause()!=null){
                    System.out.println("\tOriginal exception: "+e.getCause().getMessage());
                }
            }
        }
    }
}
