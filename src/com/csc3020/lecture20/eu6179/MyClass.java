package com.csc3020.lecture20.eu6179;

import java.util.Objects;

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
            MyClass myClass = (MyClass) o;
//        return value.equalsIgnoreCase(myClass.value);
            return label.equalsIgnoreCase(myClass.label);
        }

        @Override
        public int compareTo(MyClass o) {
            return value.compareToIgnoreCase(o.value);
        }
    }

