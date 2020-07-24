package csc3020.lecture21.gn8271;
// *
// Author: Raisa Zaman
// Student ID: gn8271
// Lecture21
// *
import java.util.Comparator;

public class MyComparator implements Comparator<MyClass> {
    @Override
    public int compare(MyClass o1, MyClass o2) {
        return o1.getLabel().compareToIgnoreCase(o2.getLabel());
    }
}
