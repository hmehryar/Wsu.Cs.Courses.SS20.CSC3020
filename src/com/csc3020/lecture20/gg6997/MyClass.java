package lecture20.gg6997;

public class MyClass implements Comparable<MyClass>{
    private String label, value;

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

    public MyClass(String label, String value) {
        this.label = label;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        lecture20.gg6997.MyClass myClass = (lecture20.gg6997.MyClass) o;
//        return value.equalsIgnoreCase(myClass.value);
        return label.equalsIgnoreCase(myClass.label);
    }

    @Override
    public int compareTo(lecture20.gg6997.MyClass o) {
        return value.compareToIgnoreCase(o.value);
    }
}
