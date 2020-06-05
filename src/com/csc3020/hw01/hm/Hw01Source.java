package csc3020.hw01.hm;
//Homework 01 implementation
public class Hw01Source {
    public static void main(String[] args) {
        double[] leftValues={100.0, 25.0 ,225.0, 11.0};
        double[] rightValues={50.0, 92.0 ,17.0 ,3.0};
        char[] opCodes={'a','s','d','m'};

        double[][] results=new double[leftValues.length][opCodes.length];

        System.out.print("LeftVals=");
        for (double leftVal:leftValues) {
            System.out.print(leftVal+"\t");
        }
        System.out.println();

        System.out.print("RightVals=");
        for (double rightVal:rightValues) {
            System.out.print(rightVal+"\t");
        }
        System.out.println();

        for (int index = 0; index < leftValues.length; index++) {
            for (int opIndex = 0; opIndex <opCodes.length ; opIndex++) {
                switch (opCodes[opIndex]){
                    case 'a':
                        results[opIndex][index]=leftValues[index]+rightValues[index];
                        break;
                    case 's':
                        results[opIndex][index]=leftValues[index]-rightValues[index];
                        break;
                    case 'd':
                        results[opIndex][index]=leftValues[index]/rightValues[index];
                        break;
                    case 'm':
                        if(rightValues[index]==0){
                            results[opIndex][index]=0;
                            break;
                        }
                        results[opIndex][index]=leftValues[index]*rightValues[index];
                        break;
                    default:
                        System.out.println("Error - Invalid operation code");
                        break;
                }
            }

        }

        for (int opIndex = 0; opIndex < opCodes.length; opIndex++) {
            switch (opCodes[opIndex]){
                case 'a':
                    System.out.print("Addition Result=");
                    break;
                case 's':
                    System.out.print("Subtraction Result=");
                    break;
                case 'd':
                    System.out.print("Division Result=");
                    break;
                case 'm':
                    System.out.print("Multiplication Result=");
                    break;
                default:
                    break;
            }


            for (double theResult:results[opIndex]){
                System.out.print(theResult+"\t");
            }
            System.out.println();
        }


    }
}
