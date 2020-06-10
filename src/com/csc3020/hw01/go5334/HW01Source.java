package com.csc3020.hw01.go5334;

public class HW01Source {
        public static void main(String[] args) {

            double LeftVals[] = {100.0, 25.0, 225.0, 11.0};
            double RightVals[] = {50.0, 92.0, 17.0, 3.0};
            double Calculation;

            System.out.print("LeftVals= ");
            for (int i = 0; i < LeftVals.length; i++) {
                System.out.printf("%.1f ", LeftVals[i]);
            }
            System.out.println();

            System.out.print("RightVals= ");
            for (int i = 0; i < RightVals.length; i++) {
                System.out.printf("%.1f ", RightVals[i]);
            }
            System.out.println();

            char opcode = '+';
            System.out.print("Addition Result= ");

            for (int i = 0; i < LeftVals.length; i++) {
                Calculation = work(opcode, LeftVals[i], RightVals[i]);
                System.out.printf("%.1f ", Calculation);
            }
            System.out.println();

            opcode = '-';
            System.out.print("Subtraction Result= ");

            for (int i = 0; i < LeftVals.length; i++) {
                Calculation = work(opcode, LeftVals[i], RightVals[i]);
                System.out.printf("%.1f ", Calculation);
            }
            System.out.println();

            opcode = '/';
            System.out.print("Division Result= ");

            for (int i = 0; i < LeftVals.length; i++) {
                Calculation = work(opcode, LeftVals[i], RightVals[i]);
                System.out.printf("%.1f ", Calculation);
            }
            System.out.println();

            opcode = '*';
            System.out.print("Multiplication Result= ");

            for (int i = 0; i < LeftVals.length; i++) {
                Calculation = work(opcode, LeftVals[i], RightVals[i]);
                System.out.printf("%.1f ", Calculation);
            }
            System.out.println();
        }

        private static double work(char c, double LeftVals, double RightVals) {
            double Calculation = 0.0;
            switch (c) {
                case '+': {
                    Calculation = LeftVals + RightVals;
                    break;
                }
                case '-': {
                    Calculation = LeftVals - RightVals;
                    break;
                }
                case '*': {
                    Calculation = LeftVals * RightVals;
                    break;
                }
                case '/': {
                    Calculation = LeftVals / RightVals;
                    break;
                }
            }
            return Calculation;

        }
    }

