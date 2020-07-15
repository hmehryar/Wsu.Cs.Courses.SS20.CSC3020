package com.csc3020.lecture20.gl1193;

import java.util.*;

public class Lecture20Source {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Foo");
        list.add("Bar");
        System.out.println("Elements: " + list.size());
        for (Object object : list) {
            System.out.println(object.toString());
        }
        String strValue = (String) list.get(0);
        SomeClassIMadeUp oSomeClassIMadeUp = new SomeClassIMadeUp();
        list.add(oSomeClassIMadeUp);

        //Strongly typed list
        ArrayList<String> strList = new ArrayList<>();
        strList.add("Foo");
        strList.add("Bar");
        System.out.println("Elements: " + strList.size());
        for (String strItem : strList) {
            System.out.println(strItem);
        }
        String str = strList.get(0);
//        SomeClassIMadeUp oSomeClassIMadeUp1 = new SomeClassIMadeUp();
//        strList.add(oSomeClassIMadeUp1)

        LinkedList<String> stringLinkedList = new LinkedList<>();
        stringLinkedList.add("Baz");
        stringLinkedList.add("Boo");

        strList.addAll(stringLinkedList);
        for (String strItem : strList) {
            System.out.println(strItem);
        }
        ArrayList<MyClass> oMyClassList = new ArrayList<>();
        MyClass oMyClassV1 = new MyClass("v1", "abc");
        MyClass oMyClassV2 = new MyClass("v2", "abc");
        MyClass oMyClassV3 = new MyClass("v3", "abc");

        oMyClassList.add(oMyClassV1);
        oMyClassList.add(oMyClassV2);
        oMyClassList.add(oMyClassV3);

        oMyClassList.remove(oMyClassV3);
        for (MyClass oMyClassItem : oMyClassList) {
            System.out.println(oMyClassItem.getLabel());
        }

        ArrayList<MyClass> oMyClassList1 = new ArrayList<>();
        MyClass oMyClassV11 = new MyClass("v1", "abc");
        MyClass oMyClassV12 = new MyClass("v2", "xyz");
        MyClass oMyClassV13 = new MyClass("v3", "abc");
        oMyClassList1.add(oMyClassV11);
        oMyClassList1.add(oMyClassV12);
        oMyClassList1.add(oMyClassV13);
//        oMyClassList1.forEach(current -> System.out.println(current.getLabel()));
        oMyClassList1.forEach(current -> {
            System.out.print(current.getLabel());
            System.out.print("->");
            System.out.println(current.getValue());
        });
        System.out.println("Before Removing");
        oMyClassList1.removeIf(current -> current.getValue().equalsIgnoreCase("abc"));
        System.out.println("After Removing");
        oMyClassList1.forEach(current -> {
            System.out.print(current.getLabel());
            System.out.print("->");
            System.out.println(current.getValue());
        });
        oMyClassList.clear();
        System.out.println("After Clear");
        oMyClassList.forEach(current -> System.out.println(current.getLabel()));

        oMyClassList.add(oMyClassV11);
        oMyClassList.add(oMyClassV12);
        oMyClassList.add(oMyClassV13);
        printArrayList(oMyClassList);

        Object[] oMyClassObjectArray = oMyClassList.toArray();
        MyClass[] oMyClassArray1 = oMyClassList.toArray(new MyClass[0]);
        System.out.println(oMyClassArray1.length);
        MyClass[] oMyClassArray2 = new MyClass[3];
        MyClass[] oMyClassArray3 = oMyClassList.toArray(oMyClassArray2);
        System.out.println(oMyClassArray2.length);
        System.out.println(oMyClassArray3.length);
        if (oMyClassArray2 == oMyClassArray3) {
            System.out.println("A2 & a3 reference the same array");
        }

        MyClass[] oMyClassArray = {
                new MyClass("value1", "abc"),
                new MyClass("value2", "xyz"),
                new MyClass("value3", "abc")
        };
        Collection<MyClass> oMyClassCollection = Arrays.asList(oMyClassArray);
        oMyClassCollection.forEach(current -> System.out.println(current.getLabel()));
        //Implementing Comparable
        TreeSet<MyClass> oMyClassTree = new TreeSet<>();
        oMyClassTree.add(new MyClass("2222", "ghi"));
        oMyClassTree.add(new MyClass("1111", "abc"));
        oMyClassTree.add(new MyClass("3333", "def"));
        oMyClassTree.forEach(current -> System.out.println(current.getValue()));
    }

    public static void printArrayList(ArrayList<MyClass> oMyClassList) {
        oMyClassList.forEach(current -> {
            System.out.print(current.getLabel());
            System.out.print("->");
            System.out.println(current.getValue());
        });
    }
}
