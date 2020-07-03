package com.csc3020.hw04MidTermProject.gs9945;

public class Multiplier extends CalculateBase {
    public Multiplier(){

    }

    public Multiplier(int lVal, int rVal){
        setLeftVal(lVal);
        setRightVal(rVal);
    }

    public void calculate(){
        setResult(getLeftVal() * getRightVal());
    }
}
