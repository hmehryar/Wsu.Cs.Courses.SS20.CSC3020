package csc3020.lecture20.gr4381;

import java.util.*;

public class Lecture20Source {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add("Foo");
        list.add("Bar");

        System.out.println("Elements: " + list.size());
        for(Object o:list){
            System.out.println(o.toString());
        }
        String strValue = (String)list.get(0);

        SomeClassIMadeUp oSomeClassIMadeUp = new SomeClassIMadeUp();
        list.add(oSomeClassIMadeUp);

        //Strongly typed list
        ArrayList<String> strList = new ArrayList<>();

        strList.add("Foo");
        strList.add("Bar");

        System.out.println("Elements: " + strList.size());
        for(String strItem:strList){
            System.out.println(strItem);
        }
        String str = strList.get(0);

        SomeClassIMadeUp oSomeClassIMadeUp1 = new SomeClassIMadeUp();
//        strList.add(oSomeClassIMadeUp1);

        LinkedList<String> strLinkedList = new LinkedList<>();
        strLinkedList.add("Baz");
        strLinkedList.add("Boo");

        strList.addAll(strLinkedList);
        System.out.println("Elements: " + strList.size());
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
        for (MyClass oMyClassItem:oMyClassList) {
            System.out.println(oMyClassItem.getLabel() + " " + oMyClassItem.getValue());
        }

        ArrayList<MyClass> oMyClassList1 = new ArrayList<>();
        MyClass oMyClass11 = new MyClass("v1", "abc");
        MyClass oMyClass12 = new MyClass("v2", "xyz");
        MyClass oMyClass13 = new MyClass("v3", "abc");

        oMyClassList1.add(oMyClass11);
        oMyClassList1.add(oMyClass12);
        oMyClassList1.add(oMyClass13);

        System.out.println("Before Removing:");
//        oMyClassList1.forEach(current -> {
//            System.out.print(current.getLabel());
//            System.out.print(" -> ");
//            System.out.println(current.getValue());
//        });
        printArrayList(oMyClassList1);

        oMyClassList1.removeIf(current -> current.getValue().equalsIgnoreCase("ABC"));
        System.out.println("After Removing:");
//        oMyClassList1.forEach(current -> {
//            System.out.print(current.getLabel());
//            System.out.print(" -> ");
//            System.out.println(current.getValue());
//        });
        printArrayList(oMyClassList1);

        oMyClassList.clear();
        System.out.println("After clear:");
        oMyClassList.forEach(current -> System.out.println(current.getLabel()));
        oMyClassList.add(oMyClass11);
        oMyClassList.add(oMyClass12);
        oMyClassList.add(oMyClass13);
        printArrayList(oMyClassList);

        Object[] oMyClassObjectsArray = oMyClassList.toArray();
        MyClass[] oMyClassArray1 = oMyClassList.toArray(new MyClass[0]);
        System.out.println(oMyClassArray1.length);
        MyClass[] oMyClassArray2 = new MyClass[3];
        System.out.println(oMyClassArray2.length);
        MyClass[] oMyClassArray3 = oMyClassList.toArray(oMyClassArray2);
        System.out.println(oMyClassArray3.length);
        if(oMyClassArray2 == oMyClassArray3){
            System.out.println("a2 & a3 reference the same array!");
        }

        MyClass[] oMyClassArray = {
                new MyClass("val1", "abc"),
                new MyClass("val2", "xyz"),
                new MyClass("val3", "abc")
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

    public static void printArrayList(ArrayList<MyClass> oMyClassList){
        oMyClassList.forEach(current -> {
            System.out.print(current.getLabel());
            System.out.print(" -> ");
            System.out.println(current.getValue());
        });
    }
}
