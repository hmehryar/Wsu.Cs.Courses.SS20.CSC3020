package hw02.ee7708;

public class Hw02Source {

        public static void main(String[] args)
        {
            //___VARIABLES___
            // Initialize arrays to store:
            //  -operator: 4 mathematical operations
            //  -leftValues: 4 predetermined double values
            //  -rightValues: 4 predetermined double values
            char[] operator = new char[]{'+', '-', '/', '*'};
            double[] leftValues = new double[]{10.0, 12.0, 14.0, 16.0};
            double[] rightValues = new double[]{10.0, 12.0, 14.0, 16.0};


            // This section satisfies the assignment requirements to instantiate an array of MathEquation
            // We then iterate over this MathEquation array to illustrate the following behavior
            // Input A, Input B, OpCode  A OpCode B = Result
            // We use the overloaded constructor that accepts a single double for Input A and B
            // However, the overload constructor that accepts a array inputs is the better option for this scenario
            // It is important to note that we can pass single values, or an array of values to the MathEquation Constructor
            MathEquation equations = new MathEquation(leftValues, rightValues, operator);
            MathEquation[] instances = new MathEquation[equations.getSmallestArraySize()];

            for (int i = 0; i < instances.length; i++) {
                instances[i] = new MathEquation(leftValues[i], rightValues[i], operator[i]);
                instances[i].execute();
            }


            // Now let's use the overloaded constructor that accepts two input arrays and one operator array
            // Because we know that the inputs may be in an array format, let's accept that as well
            // We let the MathEquation class do the lifting for us!
            MathEquation equationsArray = new MathEquation(leftValues, rightValues, operator);
            equationsArray.execute();
        }
    }

