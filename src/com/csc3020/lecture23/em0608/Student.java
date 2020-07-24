package com.csc3020.lecture23.em0608;

public class Student extends Person implements IStudent{

    public Student(){
    }

    public Student(int id){
        this();
        setId(id);
    }



    @Override
    public void study() {

    }

    @Override
    public void walk() {

    }

    @Override
    public int see() {
        return 0;
    }

    @Override
    public void smell() {

    }
}
