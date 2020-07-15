package csc3020.lecture21.gr4381;

import java.util.Comparator;

public class MyComparator implements Comparator<MyClass> {

    @Override
    public int compare(MyClass o1, MyClass o2) {
        return o1.getLabel().compareToIgnoreCase(o2.getLabel());
    }
}
