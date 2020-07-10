package com.csc3020.lecture20.he7891;

import java.util.Objects;

public class MyClass implements Comparable<MyClass> {

    private String label, value;

    public MyClass(String label, String value) {
        this.label = label;
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyClass)) return false;
        MyClass myClass = (MyClass) o;
        return value.equals(myClass.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLabel(), getValue());
    }


    @Override
    public int compareTo(MyClass o) {
        return value.compareToIgnoreCase(o.value);
    }
}
