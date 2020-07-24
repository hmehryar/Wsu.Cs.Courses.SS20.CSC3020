package csc3020.lecture05.gz0715;

public class CalculateEngine {
    public void showSum(float x, float y, int count) {
        float sum = x + y;//
        if (count > 10){
            System.out.println("Exited with return statement");
            return;
        }
        for(int i = 0; i < count; i++)
            System.out.println(sum);
    }
}
