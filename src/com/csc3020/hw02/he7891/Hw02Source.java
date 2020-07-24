package csc3020.hw02.he7891;

public class Hw02Source {
    public static void main(String[] args) {

        char[] operator = {'a', 's', 'd', 'm'};
        float[] leftVals = {100.0f, 25.0f, 225.0f, 11.0f};
        float[] rightVals = {50.0f, 92.0f, 17.0f, 3.0f};

        MathEquation[] instances = new MathEquation[4];

        MathEquation oMathEquation = new MathEquation();
        for (int i = 0; i < operator.length; i++) {
            oMathEquation = new MathEquation(leftVals, rightVals, operator[i]);
            instances[i] = oMathEquation; // Doesn't do anything, but PDF mentions it

        }
    }

    // No "public static MathEquation create()" needed for this implementation

}
