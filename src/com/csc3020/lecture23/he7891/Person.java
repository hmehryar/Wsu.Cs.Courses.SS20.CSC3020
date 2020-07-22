package com.csc3020.lecture23.he7891;

public abstract class Person implements IPerson {
    private int id;

    public int getID() {
        return id;
    }

    public void setId (int id) {
        this.id = id;
    }

    @Override
    public void walk() {

    }

    @Override
    public int see() {
        return 0;
    }

    @Override
    public double smell() {
        return 0;
    }
}
