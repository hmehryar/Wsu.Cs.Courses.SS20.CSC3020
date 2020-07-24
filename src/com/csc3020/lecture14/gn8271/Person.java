package csc3020.lecture14.gn8271;
// *
// Author: Raisa Zaman
// Student ID: gn8271
// Lecture14
// *
public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
