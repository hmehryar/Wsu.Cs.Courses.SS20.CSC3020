package hw01.ee7708;

public class Hw01Source {

    public static void main(String[] args) {

        //___VARIABLES___
        // Initialize arrays to store:
        //  -opCode: 4 mathematical operations and the contents of each array
        //  -valueArray(02): 4 predetermined double values
        char[] opCode = new char[]{'+', '-', '/', '*'};
        double[] leftArray = new double[]{10.0, 12.0, 14.0, 16.0};
        double[] rightArray = new double[]{10.0, 12.0, 14.0, 16.0};

        //Determine bounds of the smallest array to ensure that loops do not exceed smallest array length
        int smallestArraySize = getSmallestArraySize(leftArray, rightArray);
        double result;


        //___SECTION 01___
        //Print Contents Of Each Array
        System.out.printf(System.lineSeparator() + "LeftVals=");
        for (int j = 0; j < smallestArraySize; j++)
        {
            System.out.print(leftArray[j] + "   ");
        }

        System.out.printf(System.lineSeparator() + "RightVals=");
        for (int j = 0; j < smallestArraySize; j++)
        {
            System.out.print(rightArray[j] + "   ");
        }


        //___SECTIONS 02 through 05___
        //Loop using bounds of opCode array
        for(int i = 0; i < opCode.length; i++) {

            //Perform calculator operation
            switch (opCode[i]) {
                case '+': {
                    System.out.printf(System.lineSeparator() + "Addition Result=");
                    for (int j = 0; j < smallestArraySize; j++) {
                        result = leftArray[j] + rightArray[j];
                        System.out.print(result + "   ");
                    }
                    break;
                }

                case '-': {
                    System.out.printf(System.lineSeparator() + "Subtraction Result=");
                    for (int j = 0; j < smallestArraySize; j++) {
                        result = leftArray[j] - rightArray[j];
                        System.out.print(result + "   ");
                    }
                    break;
                }

                case '/': {
                    System.out.printf(System.lineSeparator() + "Division Result=");
                    for (int j = 0; j < smallestArraySize; j++) {
                        result = leftArray[j] / rightArray[j];
                        System.out.print(result + "   ");
                    }
                    break;
                }

                case '*': {
                    System.out.printf(System.lineSeparator() + "Multiplication Result=");
                    for (int j = 0; j < smallestArraySize; j++) {
                        result = leftArray[j] * rightArray[j];
                        System.out.print(result + "   ");
                    }
                    break;
                }
            }
        }
    }

    //Returns the smallest array size to ensure that the program does not exceed the bounds of an input array
    public static int getSmallestArraySize(double[] array01, double[] array02) {
        if (array01.length < array02.length) {
            return array01.length;
        }
        return array02.length;
    }
}
