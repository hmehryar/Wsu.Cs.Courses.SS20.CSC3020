package com.csc3020.hw03.gl1193;

public class MathEquation {

    public char opCode;
    public double getResults;
    double l;
    double r;
    double results;
    public double setResults;
    public char getopCode;
    public double getL;
    public double getR;

    public MathEquation(){

    }
//    public MathEquation(double l) {
//        this();
//        this.l= l;
//    }
//
//    public MathEquation(double r) {
//        this();
//        this.r = r;
//    }


    MathEquation(double l,double r,char opCode) {
        //result = new double[a1.length];
        //opCode = opCodeX;
        this.l=l;
        this.r=r;
        this.opCode=opCode;
        this.results=results;
    }

    public void execute() {
//        this.l=l;
//        this.r=r;
//        this.opCode=opCode;
//        this.results=results;


            switch (opCode) {
                case 'a':
                    System.out.print("Addition Results: ");
//                    for (double array : add) {
//                        System.out.print(array);
//                        System.out.print(" ");
//                    }
//                    System.out.println(" ");
                    //results=l+r;

                    this.setResults(this.l + this.r);
                    this.setResults(this.getL + this.getR);
                    this.setResults=(l+r);
                    setResults(l+r);
                    System.out.println(" ");
                    System.out.print(getResults);
                    break;

                case 's':
                    System.out.print("Subtraction Results: ");
//                    for (double array : sub) {
//                        System.out.print(array);
//                        System.out.print(" ");
//                    }
//                    System.out.println(" ");
                    this.setResults=l-r;
                    System.out.println(" ");
                    break;
                case 'm':
                    System.out.print("Multiplication Results: ");
//                    for (double array : mul) {
//                        System.out.print(array);
//                        System.out.print(" ");
//                    }
//                    System.out.println(" ");
                    this.setResults=l*r;
                    System.out.println(" ");
                    break;
                case 'd':
                    System.out.print("Division Results: ");
//                    for (double array : div) {
//                        System.out.print(array);
//                        System.out.print(" ");
//                    }
//                    System.out.println(" ");
                    this.setResults=l/r;
                    System.out.println(" ");
                    break;
            }
            setResults(results);


    }

    public  double getL(){
        return l;
    }
    public void setL(double l){
        this.l = l;
    }
    public  double getR(){
        return r;
    }
    public void setR(double r){
        this.r = r;
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
}
