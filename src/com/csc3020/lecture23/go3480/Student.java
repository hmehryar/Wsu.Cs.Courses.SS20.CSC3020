package csc3020.lecture23.go3480;

public class Student extends Person implements IStudent{
    public Student(int id) {
        setId(id);
    }

    @Override
    public int see() {
        return 8;
    }

    @Override
    public void study() {

    }
}
