package csc3020.lecture05.go3480;

public class CalculatorEngine {
    public void showSum(float x, float y, int count){
        float sum = x + y;
        for (int i = 0; i < count; i++)
            System.out.println(sum);
    }
}
