package csc3020.lecture21.hc7391;

import java.util.Comparator;

public class MyComparator implements Comparator<MyClass> {

    @Override
    public int compare(MyClass o1, MyClass o2) {
        return o1.getLabel().compareToIgnoreCase(o2.getLabel()); //compareToIgnoreCase ignores cases
    }


}
