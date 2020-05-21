package com.csc3020.lecture05.go5621;

public class CalculateEngine {
    public void showSum(float x, float y, int count) {
//        try{
//            throw new Exception("Exception");
//        } catch(Exception ex) {}

        float sum = x + y;
        if (count > 10) {
            System.out.println("Exiting with Return Statement");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println(sum);
        }
    }
}
