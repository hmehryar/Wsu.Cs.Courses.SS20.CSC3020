package csc3020.lecture23.he7891;

public class Student extends Person implements IStudent {

    public Student(int id) {
        setId(id);
    }

    @Override
    public int see() {
        return 0;
    }

    @Override
    public void study() {

    }

}
