package cs3020.lecture05.av7071;

import java.awt.*;

public class CalculatorEngine {
    public static void showSum(float x, float y, int count){
//        try {
//            throw new Exception("Exception");
//        }catch(Exception ex){
//
//        }

        float sum = x + y;

        if (count > 1000){
            System.out.println(sum);
        }

        for(int i = 0; i < count; i++)
            System.out.println(sum);
    }

}
