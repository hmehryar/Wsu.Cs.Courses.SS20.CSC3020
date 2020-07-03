package com.csc3020.hw04MidTermProject.gs9945;

public class Adder extends CalculateBase {
    public Adder(){

    }

    public Adder(int lVal, int rVal){
        setLeftVal(lVal);
        setRightVal(rVal);
    }

    public void calculate(){
        setResult(getLeftVal() + getRightVal());
    }
}
