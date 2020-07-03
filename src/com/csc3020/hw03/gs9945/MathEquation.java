package com.csc3020.hw03.gs9945;

public class MathEquation {
    private double firstValue;
    private double secondValue;
    private double answers;
    private char operation;
    {
        firstValue = 0;
        secondValue = 0;
        answers = 0;
        operation = 'N';
    }
    public MathEquation(){
    }
    public MathEquation(char op){
        this();
        this.operation = op;
    }
    public MathEquation(int v1, int v2){
        this();
        this.firstValue=v1;
        this.secondValue=v2;
    }
    public MathEquation(int n1, int n2, char op){
        this(n1,n2);
        this.operation = op;
    }
    public void setNumbers(int num1, int num2){
        this.firstValue=num1;
        this.secondValue=num2;
    }
    public void setOperation(char op){
        this.operation = op;
    }
    /*
    public void getNumbers(){
        System.out.println("First Value: " + firstValue + " Second Value: " + secondValue);
    }
    */
    public void execute(){
            switch (operation) {
                case '+':
                    System.out.println(" ");
                    answers = firstValue + secondValue;
                    System.out.println("Addition Results: " + firstValue + " + " + secondValue + " = " + answers);
                    break;
                case '-':
                    System.out.println(" ");
                    answers = firstValue - secondValue;
                    System.out.println("Subtraction Results: " + firstValue + " - " + secondValue + " = " + answers);
                    break;
                case '*':
                    System.out.println(" ");
                    answers = firstValue * secondValue;
                    System.out.println("Multiplication Results: " + firstValue + " * " + secondValue + " = " + answers);
                    break;
                case '/':
                    System.out.println(" ");
                    answers = firstValue / secondValue;
                    if(secondValue==0){
                        System.out.println("Division Results: " + firstValue + " / " + secondValue + " = Cannot Divide By Zero");
                        break;
                    }
                    System.out.println("Division Results: " + firstValue + " / " + secondValue + " = " + answers);
                    break;
                default:
                    System.out.println("Switch Statement Is No Good");
            }
    }
}
