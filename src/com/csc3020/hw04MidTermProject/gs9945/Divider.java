package com.csc3020.hw04MidTermProject.gs9945;

public class Divider extends CalculateBase {
    public Divider(){

    }

    public Divider(int lVal, int rVal){
        setLeftVal(lVal);
        setRightVal(rVal);
    }

    public void calculate(){
        setResult(getLeftVal() / getRightVal());
    }
}
