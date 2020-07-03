package com.csc3020.hw04MidTermProject.gs9945;

public class Subtractor extends CalculateBase {
    public Subtractor(){

    }

    public Subtractor(int lVal, int rVal){
        setLeftVal(lVal);
        setRightVal(rVal);
    }

    public void calculate(){
        setResult(getLeftVal() - getRightVal());
    }
}
