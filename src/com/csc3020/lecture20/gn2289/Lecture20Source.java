package lecture20.gn2289;

import javax.swing.*;
import java.util.*;

public class Lecture20Source {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Foo");
        list.add("Bar");
        System.out.println("Elements: "+list.size());
        for (Object object: list) {
            System.out.println(object.toString());
        }
        String strVal = (String)list.get(0);
        SomeClassIMadeUp someClassIMadeUp = new SomeClassIMadeUp();
        list.add(someClassIMadeUp);

        //Strongly typed list
        ArrayList<String> strList = new ArrayList<>();
        strList.add("Foo");
        strList.add("Bar");
        System.out.println("Elements: "+strList.size());
        for (String strItem:strList) {
            System.out.println(strItem);
        }
       // String strItem = strList.get(0);
//        SomeClassIMadeUp oSomeClassIMadeUp1 = new SomeClassIMadeUp();
//        strList.add(oSomeClassIMadeUp1);

        LinkedList<String> strLinkedList = new LinkedList<>();
        strLinkedList.add("Baz");
        strLinkedList.add("Boo");

        strList.addAll(strLinkedList);
        for (String strItem:strList) {
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
            System.out.println(oMyClassItem.getLabel());
        }

        ArrayList<MyClass> oMyClassList1 = new ArrayList<>();
        MyClass oMyClass11 = new MyClass("v1", "xyz");
        MyClass oMyClass22 = new MyClass("v2", "xyz");
        MyClass oMyClass33 = new MyClass("v3", "xyz");
        oMyClassList1.add(oMyClass11);
        oMyClassList1.add(oMyClass22);
        oMyClassList1.add(oMyClass33);
        oMyClassList1.forEach(current -> {
            System.out.print(current.getLabel());
            System.out.print("---->");
            System.out.println(current.getValue());
        });
        System.out.println("B4 removing...");
        oMyClassList1.removeIf(current -> current.getValue().equals("abc"));
        System.out.println("After removing...");
        oMyClassList1.forEach(current -> {
            System.out.print(current.getLabel());
            System.out.print("---->");
            System.out.println(current.getValue());
        });

        oMyClassList.clear();
        System.out.println("after clears");
        oMyClassList.forEach(current -> System.out.println(current.getLabel()));
        oMyClassList1.add(oMyClass11);
        oMyClassList1.add(oMyClass22);
        oMyClassList1.add(oMyClass33);
        oMyClassList.forEach(current -> {
            System.out.print(current.getLabel());
            System.out.print("---->");
            System.out.println(current.getValue());
        });

        Object[] oMyClassObjectArray = oMyClassList.toArray();
        MyClass[] oMyClassArray1 = oMyClassList.toArray(new MyClass[0]);
        System.out.println(oMyClassArray1.length);
        MyClass[] oMyClassArray2 = new MyClass[3];
        MyClass[] oMyClassArray3 = oMyClassList.toArray(oMyClassArray2);

        if(oMyClassArray2 == oMyClassArray3) {
            System.out.println("a2 & a3 reference the same array");
        }

        MyClass[] oClassArray = {
            new MyClass("value1", "abc"),
            new MyClass("value2", "abc"),
            new MyClass("value3", "abc"),
        };
        Collection<MyClass> oMyClassCollection = Arrays.asList(oClassArray);
        oMyClassCollection.forEach(current -> System.out.println(current.getLabel()));

        //comparable

        TreeSet<MyClass> oMyClassTree = new TreeSet<>();
        oMyClassTree.add(new MyClass("1111", "abc"));
        oMyClassTree.add(new MyClass("2222", "efg"));
        oMyClassTree.add(new MyClass("333", "hij"));
        oMyClassTree.forEach(current -> System.out.println(current.getValue()));





    }


}
