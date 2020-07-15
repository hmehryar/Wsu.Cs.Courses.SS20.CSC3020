package csc3020.lecture20.gx0225;


public class MyClass implements Comparable<MyClass>{
    private String label, value;

    public MyClass(String label, String value) {
        this.value = value;
        this.label = label;
    }

    public void setValue(String value) {
        this.label=label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getValue() {
        return value;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public boolean equals(Object o) {
        MyClass myClass=(MyClass) o;
        //return value.equalsIgnoreCase(myClass.value);
        return label.equalsIgnoreCase(myClass.label);
    }

    @Override
    public int compareTo(MyClass o) {
        return value.compareToIgnoreCase(o.value);
    }

}
