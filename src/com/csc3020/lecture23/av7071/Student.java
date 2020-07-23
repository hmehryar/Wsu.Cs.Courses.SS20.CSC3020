package csc3020.lecture23.av7071;

public class Student extends Person implements IStudent{
    public Student (int id) {
        setId(id);
    }

    @Override
    public void walk() {
    }

    @Override
    public int see() {
        return 8;
    }

    @Override
    public double smell() {
        return 0;
    }

    @Override
    public void study() {

    }
}
