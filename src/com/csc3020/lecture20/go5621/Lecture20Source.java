package com.csc3020.lecture20.go5621;

import java.util.*;

public class Lecture20Source {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add("Food");
        list.add("Bar");

        System.out.println("Elements: " + list.size());

        for (Object o: list) {
            System.out.println(o.toString());
        }

        String strValue = (String)list.get(0);
        SomeClassIMadeUp oSomeClassIMadeUp = new SomeClassIMadeUp();
        list.add(oSomeClassIMadeUp);

        //Strongly typed
        ArrayList<String> strList = new ArrayList<>();

        strList.add("Food");
        strList.add("Bar");

        System.out.println("Elements: " + strList.size());

        for (Object o: strList) {
            System.out.println(o.toString());
        }

        String strItem = strList.get(0);
        //SomeClassIMadeUp oSomeClassIMadeUp1 = new SomeClassIMadeUp();
        //strList.add(oSomeClassIMadeUp);

        LinkedList<String> stringLinkedList = new LinkedList<>();
        stringLinkedList.add("Bax");
        stringLinkedList.add("Boo");

        strList.addAll(stringLinkedList);
        for(String s: strList) {
            System.out.println(s);
        }

        ArrayList<MyClass> oMyClassList = new ArrayList<>();
        MyClass v1 = new MyClass("v1", "abc");
        MyClass v2 = new MyClass("v2", "abc");
        MyClass v3 = new MyClass("v3", "abc");

        oMyClassList.add(v1);
        oMyClassList.add(v2);
        oMyClassList.add(v3);

        oMyClassList.remove(v3);

        for(MyClass oMyClassItem: oMyClassList) {
            System.out.println(oMyClassItem.getLabel());
        }

        ArrayList<MyClass> oMyClassList1 = new ArrayList<>();
        MyClass v11 = new MyClass("v1", "abc");
        MyClass v21 = new MyClass("v2", "xyz");
        MyClass v31 = new MyClass("v3", "abc");

        oMyClassList.add(v11);
        oMyClassList.add(v21);
        oMyClassList.add(v31);

        oMyClassList.forEach(oMyClassItem -> System.out.println(oMyClassItem.getLabel()));

        ArrayList<MyClass> oMyClassList2 = new ArrayList<>();
        MyClass v12 = new MyClass("v1", "abc");
        MyClass v22 = new MyClass("v2", "abc");
        MyClass v32 = new MyClass("v3", "abc");

        oMyClassList.add(v1);
        oMyClassList.add(v2);
        oMyClassList.add(v3);

        oMyClassList.removeIf(oMyClassItem -> oMyClassItem.getValue().equals("abc"));

        printArrayList(oMyClassList);

        oMyClassList.clear();
        oMyClassList.forEach(current -> System.out.println(current.getLabel()));

        Object[] oMyClassObjectArray = oMyClassList.toArray();
        MyClass[] oMyClassArray1 = oMyClassList.toArray(new MyClass[0]);
        System.out.println(oMyClassArray1.length);
        MyClass[] oMyClassArray2 = new MyClass[3];
        System.out.println(oMyClassArray2.length);
        MyClass[] oMyClassArray3 = oMyClassList.toArray(oMyClassArray2);
        System.out.println(oMyClassArray3.length);

        if(oMyClassArray2 == oMyClassArray3) {
            System.out.println("a2 and a3 reference the same array");
        }

        MyClass[] oMyClassArray = {
                new MyClass("value1", "abc"),
                new MyClass("value2", "xyz"),
                new MyClass("value3", "abc"),
        };

        Collection<MyClass> oMyClassCollection = Arrays.asList(oMyClassArray);
        oMyClassCollection.forEach(current -> System.out.println(current.getLabel()));

        TreeSet<MyClass> oMyClassTree = new TreeSet<>();
        oMyClassTree.add(new MyClass("1111", "ghi"));
        oMyClassTree.add(new MyClass("2222", "abc"));
        oMyClassTree.add(new MyClass("3333", "def"));
        //oMyClassTree.forEach(current -> System.out.println(current.getValue()));
    }

    public static void printArrayList(ArrayList<MyClass> oMyClassList) {
        oMyClassList.forEach(current -> {
            System.out.print(current.getLabel());
            System.out.print("->");
            System.out.println(current.getValue());
        });
    }
}
