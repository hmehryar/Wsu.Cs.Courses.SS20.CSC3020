package csc3020.lecture05.hc7391;

public class CalculatorEngine {
    public void showSum(float x, float y, int count){
        float sum = x+y;
        if(count > 10){
            System.out.println("Exiting With Return Statement");
            return;
        }

        for(int i = 0; i < count; i++){
            System.out.println(sum);
        }
    }

}
