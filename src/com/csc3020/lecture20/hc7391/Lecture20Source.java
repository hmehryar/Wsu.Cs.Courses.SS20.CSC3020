package csc3020.lecture20.hc7391;

import java.util.*;

public class Lecture20Source {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("foo");
        list.add("bar");

        System.out.println("Elements: " + list.size());
        for(Object object: list){
            System.out.println(object.toString());
        }

        String strValue = (String) list.get(0); // casted since object is generic

        SomeClassIMadeUp oSomeClassIMadeUp = new SomeClassIMadeUp();
        list.add(oSomeClassIMadeUp);

        ArrayList<String> strList = new ArrayList<>();
        strList.add("Foo");
        strList.add("Bar");

        System.out.println("Elements: "+strList.size());

        for(String strItem: strList){
            System.out.println(strItem);
        }
        System.out.println();

        String str = strList.get(0);

        //SomeClassIMadeUp oSomeClassIMadeUp1 = new SomeClassIMadeUp();
        //strList.add(oSomeClassIMadeUp1); the object is not a string

        LinkedList<String> stringLinkedList = new LinkedList<>();
        stringLinkedList.add("Baz");
        stringLinkedList.add("Boo");

        strList.addAll(stringLinkedList);
        for(String strItem:strList){
            System.out.println(strItem);
        }

        ArrayList<MyClass> oMyClassList = new ArrayList<>();
        MyClass oMyClass1 = new MyClass("v1", "abc");
        MyClass oMyClass2 = new MyClass("v2", "abc");
        MyClass oMyClass3 = new MyClass("v3", "abc");

        oMyClassList.add(oMyClass1);
        oMyClassList.add(oMyClass2);
        oMyClassList.add(oMyClass3);

        oMyClassList.remove(oMyClass3);

        for(MyClass oMyClassItem: oMyClassList){
            System.out.println(oMyClassItem.getLabel());
            //deletes first instance of "abc" if comparison is not a label
        }
        System.out.println("--------------------------");
        ArrayList<MyClass> oMyClassList1 = new ArrayList<>();
        MyClass oMyClass11 = new MyClass("v1", "abc");
        MyClass oMyClass22 = new MyClass("v2", "xyz");
        MyClass oMyClass33 = new MyClass("v3", "abc");

        oMyClassList1.add(oMyClass11);
        oMyClassList1.add(oMyClass22);
        oMyClassList1.add(oMyClass33);
        System.out.println("Before Removing");
        oMyClassList1.forEach(current -> {System.out.print(current.getLabel());
            System.out.print("->");
            System.out.println(current.getValue());
            System.out.println();});

        System.out.println();

        System.out.println("After Removing");
        oMyClassList1.removeIf(current->current.getValue().equalsIgnoreCase("AbC"));
        oMyClassList1.forEach(current -> {System.out.print(current.getLabel());
            System.out.print("->");
            System.out.print(current.getValue());
            System.out.println();});

        System.out.println();

        oMyClassList.clear();
        System.out.println("After Clearing");
        oMyClassList.forEach(current -> System.out.println(current.getLabel()));

        oMyClassList.add(oMyClass11);
        oMyClassList.add(oMyClass22);
        oMyClassList.add(oMyClass33);
        printArrayList(oMyClassList);

        Object[]  oMyClassObjectArray = oMyClassList.toArray();
        MyClass[] oMyClassArray1 = oMyClassList.toArray(new MyClass[0]);
        System.out.println(oMyClassArray1.length);
        MyClass[] oMyClassArray2 = new MyClass[3];
        MyClass[] oMyClassArray3 = oMyClassList.toArray(oMyClassArray2);
        System.out.println(oMyClassArray2.length);
        System.out.println(oMyClassArray3.length);

        if(oMyClassArray2 == oMyClassArray3){
            System.out.println("a2 and a3 reference the same array");
        }

       MyClass[] oMyClassArray = {
               new MyClass("value1", "abc"),
                new MyClass("value2", "xyz"),
                new MyClass("value3", "abc")
        };
       Collection<MyClass> oMyClassCollection = Arrays.asList(oMyClassArray);

       oMyClassCollection.forEach(current-> System.out.println(current.getLabel()));

       //Implementing Comparable

        TreeSet<MyClass> oMyClassTreeSet = new TreeSet<>();

        oMyClassTreeSet.add(new MyClass("2222", "ghi"));
        oMyClassTreeSet.add(new MyClass("1111", "abc"));
        oMyClassTreeSet.add(new MyClass("3333", "def"));

        oMyClassTreeSet.forEach(current-> System.out.println(current.getValue()));


    }// end main

    public static void printArrayList(ArrayList<MyClass> oMyClassList){
        oMyClassList.forEach(current -> {System.out.print(current.getLabel());
            System.out.print("->");
            System.out.print(current.getValue());});
            System.out.println();
    }
}// end class
