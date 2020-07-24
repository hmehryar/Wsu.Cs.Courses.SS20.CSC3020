package csc3020.lecture23.gg6997;

import csc3020.lecture23.gg6997.IStudent;
import csc3020.lecture23.gg6997.Person;


public class Student extends Person implements IStudent{
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
