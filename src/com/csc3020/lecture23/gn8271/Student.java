package csc3020.lecture23.gn8271;
// *
// Author: Raisa Zaman
// Student ID: gn8271
// Lecture23
// *

public class Student extends Person implements IStudent {
    public Student(int id){
        setId(id);
    }

    @Override
    public int see(){
        return 8;
    }
    @Override
    public void study() {

    }
}
