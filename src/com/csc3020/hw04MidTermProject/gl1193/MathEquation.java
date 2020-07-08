package com.csc3020.hw04MidTermProject.gl1193;

public class MathEquation {

    public char opCode;
    public double getResults;
    double leftVal;
    double rightVal;
    double results;
    public double setResults;


    public MathEquation(){

    }


    MathEquation(double leftVal, double rightVal, char opCode) {
        this.leftVal=leftVal;
        this.rightVal=rightVal;
        this.opCode=opCode;
        this.results=results;
    }

    public double execute() {

            switch (opCode) {
                case 'a':
                    System.out.print("Addition Results: ");
//                    for (double array : add) {
//                        System.out.print(array);
//                        System.out.print(" ");
//                    }

                   // this.setResults(this.leftVal + this.rightVal);
                    //this.setResults(this.getLeftVal() + this.getRightVal());
                    //this.setResults=(leftVal+rightVal);
                    //setResults(leftVal+rightVal);
                    System.out.println(rightVal+leftVal);
                    System.out.println(" ");
                    //System.out.print(getResults);
                    break;

                case 's':
                    System.out.print("Subtraction Results: ");
//                    for (double array : sub) {
//                        System.out.print(array);
//                        System.out.print(" ");
//                    }
//                    System.out.println(" ");
                    //this.setResults=leftVal-rightVal;
                    System.out.println(rightVal-leftVal);
                    System.out.println(" ");
                    break;
                case 'm':
                    System.out.print("Multiplication Results: ");
//                    for (double array : mul) {
//                        System.out.print(array);
//                        System.out.print(" ");
//                    }
//                    System.out.println(" ");
                    //this.setResults=leftVal*rightVal;
                    System.out.println(rightVal*leftVal);
                    System.out.println(" ");
                    break;
                case 'd':
                    System.out.print("Division Results: ");
//                    for (double array : div) {
//                        System.out.print(array);
//                        System.out.print(" ");
//                    }
//                    System.out.println(" ");
                    //return this.result = this.leftVal/this.rightVal;
                    //this.setResults=leftVal/rightVal;
                    //System.out.println(" ");

                    System.out.println(leftVal/rightVal);
                    //System.out.println(" ");
                    break;
            }
        System.out.println(" ");
return result;

    }

    public  double getLeftVal(){
        return leftVal;
    }
    public void setLeftVal(double leftVal){
        this.leftVal = leftVal;
    }
    public  double getRightVal(){
        return rightVal;
    }
    public void setRightVal(double rightVal){
        this.rightVal = rightVal;
    }
    public double getResults(){
        return results;
    }
    public void setResults(double results){
        this.results = results;
    }
    public void print() {
        System.out.println(getResults());
    }

   //hw4
   double result;
   public double getResult() {
       return result;
   }
   public void setResult(double result) {
       this.result = result;
   }



    //overload for execute method
    void execute(double leftVal, double rightVal, char opCode)
    {
        System.out.println("Using overloads");
        System.out.println("result: "+(leftVal/rightVal));
    }
    void execute(int leftVal, int rightVal, char opCode)
    {
        System.out.println("results: "+(leftVal/rightVal));
        System.out.println(" ");
    }


}



