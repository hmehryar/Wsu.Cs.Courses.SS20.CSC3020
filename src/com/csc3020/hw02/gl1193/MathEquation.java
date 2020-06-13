package com.csc3020.hw02.gl1193;

public class MathEquation {
    public double[] a1 = {100.0, 25.0, 225.0, 11.0}; //declare arrays Left and Right
    public double[] a2 = {50.0, 92.0, 17.0, 3.0};
    public char opCode;
    public double result[];

    MathEquation(char opCodeX) {
        result = new double[a1.length];
        opCode = opCodeX;
    }


    int i;
    int Size = 4;
    //int j=;
    double[] add = new double[Size];   //new arrays to store operations values
    double[] sub = new double[Size];
    double[] mul = new double[Size];
    double[] div = new double[Size];

    public void execute() {

        System.out.print("LeftArray: ");
        for (double array : a1) {
            System.out.print(array);
            System.out.print(" ");

        }
        System.out.println(" ");

        System.out.print("RightArray: ");
        for (double array : a2) {
            System.out.print(array);
            System.out.print(" ");

        }
        System.out.println(" ");
// operations execution
        for (i = 0; i < Size; i++) {
            add [i]= a1[i] + a2[i];
            sub[i] = a1[i] - a2[i];
            mul[i] = a1[i] * a2[i];
            div[i] = a1[i] / a2[i];
        }
        //double r[];
        //double equals=0.0000;
        //double l, r;
        for (int i = 0; i < a1.length; i++) {
            //l = a1[i];
            //r = a2[i];
            switch (opCode) {
                case 'a':
                    System.out.print("Addition Results: ");
                    for (double array : add) {
                       System.out.print(array);
                       System.out.print(" ");
                    }
                    System.out.println(" ");

                    break;

                case 's':
                    System.out.print("Subtraction Results: ");
                    for (double array : sub) {
                       System.out.print(array);
                       System.out.print(" ");
                       }
                    System.out.println(" ");

                    break;
                case 'm':
                    System.out.print("Multiplication Results: ");
                    for (double array : mul) {
                        System.out.print(array);
                        System.out.print(" ");
                      }
                    System.out.println(" ");
                    break;
                case 'd':
                    System.out.print("Division Results: ");
                    for (double array : div) {
                        System.out.print(array);
                        System.out.print(" ");
                    }
                    System.out.println(" ");
                    break;
            }

            //result[i] = equals;
            //System.out.println(" ");
        }
        //System.out.println(" ");
        //if(opCode=='a')
        //   System.out.print("Addition Results: ");



    }
}
