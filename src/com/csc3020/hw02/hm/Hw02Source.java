package csc3020.hw02.hm;

public class Hw02Source {
    public static void main(String[] args) {
        double[] leftValues={100.0d, 25.0d, 225.0d, 11.0d};;
        double[] rightValues={50.0d, 92.0d, 17.0d, 3.0d};
        double[] results;
        char[] opCodes={'a','s','m','d'};
        if(leftValues.length!=rightValues.length){
            System.out.println("Error: Left Values Array and Right Values array do not have the same length!!!!");
            return;
        }
        System.out.print("Left Values: ");
        for (int index = 0; index < leftValues.length; index++) {
            System.out.print(leftValues[index]+"\t");
        }
        System.out.println();

        System.out.print("Right Values: ");
        for (int index = 0; index < rightValues.length; index++) {
            System.out.print(leftValues[index]+"\t");
        }
        System.out.println();

        MathEquation[] mathEquations=new MathEquation[leftValues.length];
        for (int opCodeIndex = 0; opCodeIndex < opCodes.length; opCodeIndex++) {
            results=new double[leftValues.length];
            for (int index = 0; index < leftValues.length; index++) {
                mathEquations[index]=create(leftValues[index],rightValues[index],opCodes[opCodeIndex]);
                mathEquations[index].Execute();
                results[index]=mathEquations[index].result;
            }
            switch (opCodes[opCodeIndex]){
                case 'a':
                    System.out.print("Addition: ");
                    break;
                case 's':
                    System.out.print("Subtraction: ");
                    break;
                case 'm':
                    System.out.print("Multiplication: ");
                    break;
                case 'd':
                    System.out.print("Division: ");
                        break;
            }

            for (int index = 0; index < results.length; index++) {
                System.out.print(results[index]+"\t");
            }
            System.out.println();
        }
    }
    public  static  MathEquation create(double leftValue,double rightValue, char opCode){
        MathEquation oMathEquation= new MathEquation();
        oMathEquation.rightValue=rightValue;
        oMathEquation.leftValue=leftValue;
        oMathEquation.opCode=opCode;
        return oMathEquation;
    }
}
