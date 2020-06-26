package hw02.ee7708;

public class MathEquation {

    public char[] operator;
    public double[] results;
    public double[] leftValues;
    public double[] rightValues;

    public MathEquation(double leftValues, double rightValues, char operator){
        this.leftValues = new double[]{leftValues};
        this.rightValues = new double[]{rightValues};
        this.operator = new char[]{operator};
        this.results = new double[1];
    }

    public MathEquation(double[] leftValues, double[] rightValues, char[] operator){
        this.leftValues = leftValues;
        this.rightValues = rightValues;
        this.operator = operator;
        this.results = new double[getSmallestArraySize(leftValues,rightValues)];
    }

    public void execute(){

        int size = getSmallestArraySize(this.leftValues, this.rightValues);
        printValues(size);

        //Loop using bounds of opCode array
        for(int i = 0; i < this.operator.length; i++) {
            //Perform calculator operation
            switch (operator[i]) {
                case '+': {
                    System.out.printf(System.lineSeparator() + "Addition Result=");
                    for (int j = 0; j < size; j++) {
                        this.results[j] = this.leftValues[j] + this.leftValues[j];
                        System.out.print(this.results[j] + "   ");
                    }
                    break;
                }

                case '-': {
                    System.out.printf(System.lineSeparator() + "Subtraction Result=");
                    for (int j = 0; j < size; j++) {
                        this.results[j] = this.leftValues[j] - this.leftValues[j];
                        System.out.print(this.results[j] + "   ");
                    }
                    break;
                }

                case '/': {
                    System.out.printf(System.lineSeparator() + "Division Result=");
                    for (int j = 0; j < size; j++) {
                        this.results[j] = this.leftValues[j] / this.leftValues[j];
                        System.out.print(this.results[j] + "   ");
                    }
                    break;
                }

                case '*': {
                    System.out.printf(System.lineSeparator() + "Multiplication Result=");
                    for (int j = 0; j < size; j++) {
                        this.results[j] = this.leftValues[j] * this.leftValues[j];
                        System.out.print(this.results[j] + "   ");
                    }
                    break;
                }
            }
        }
    }

    public void printValues(int size){

        System.out.printf(System.lineSeparator() + "LeftVals=");
        for (int i = 0; i < size; i++) {
            System.out.print(this.leftValues[i] + "   ");
        }

        System.out.printf(System.lineSeparator() + "RightVals=");
        for (int j = 0; j < size; j++)
        {
            System.out.print(this.rightValues[j] + "   ");
        }
    }

    public int getSmallestArraySize() {
        if (this.leftValues.length < this.rightValues.length) {
            return this.leftValues.length;
        }
        return this.rightValues.length;
    }

    //Returns the smallest array size to ensure that the program does not exceed the bounds of an input array
    public int getSmallestArraySize(double[] array01, double[] array02) {
        if (array01.length < array02.length) {
            return array01.length;
        }
        return array02.length;
    }
}
