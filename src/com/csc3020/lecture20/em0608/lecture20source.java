package com.csc3020.lecture20.em0608;

import java.util.*;

public class lecture20source {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Dog");
        list.add("Cat");
        System.out.println("Elements " + list.size());

        for(Object object : list){
            System.out.println(object.toString());
        }
        String strValue=(String) list.get(0);
        SomeClass oSomeClass = new SomeClass();
        list.add(oSomeClass);

        //Strongly Typed List
        ArrayList<String> strList = new ArrayList<>();
        strList.add("Pig");
        strList.add("Cow");
        System.out.println("Elements " + strList.size());
        for(String strItem : strList){
            System.out.println(strItem);
        }
        String strItem = strList.get(0);
        SomeClass oSomething = new SomeClass();
      //  strList.add(oSomething);

        LinkedList<String> stringLinkedList = new LinkedList<>();
        stringLinkedList.add("Kelly");
        stringLinkedList.add("Maisel");

        strList.addAll(stringLinkedList);
        for(String strItem1: strList){
            System.out.println(strItem1);
        }

        ArrayList<MyClass> oMyClassList = new ArrayList<>();
        MyClass oMyClassList1 = new MyClass("b1", "b2");
        MyClass oMyClassList2 = new MyClass("c1", "c2");
        MyClass oMyClassList3 = new MyClass("d1", "d2");

        oMyClassList.add(oMyClassList1);
        oMyClassList.add(oMyClassList2);
        oMyClassList.add(oMyClassList3);

        oMyClassList.remove(oMyClassList3);
        for(MyClass myClassList : oMyClassList){
            System.out.println(myClassList.getLabel());
        }


        ArrayList<MyClass> oMyClassListP1 = new ArrayList<>();
        MyClass oMyClassListV1 = new MyClass("b1", "b2");
        MyClass oMyClassListV2 = new MyClass("c1", "c2");
        MyClass oMyClassListV3 = new MyClass("d1", "d2");
        oMyClassListP1.add(oMyClassListV1);
        oMyClassListP1.add(oMyClassListV2);
        oMyClassListP1.add(oMyClassListV3);

        System.out.println("Before Removing:");
        oMyClassListP1.forEach(current -> {
            System.out.print(current.getLabel());
            System.out.print(" -> ");
            System.out.println(current.getValue());
        });


        oMyClassListP1.removeIf(current -> current.getValue().equalsIgnoreCase("c2"));

        System.out.println("After Removing:");
        oMyClassListP1.forEach(current -> {
            System.out.print(current.getLabel());
            System.out.print(" -> ");
            System.out.println(current.getValue());
        });

        oMyClassList.clear();
        System.out.println("After Clearing");
        oMyClassList.forEach(current-> System.out.println(current.getLabel()));

        oMyClassList.forEach(current-> System.out.println(current.getLabel()));
        oMyClassList.add(oMyClassList1);
        oMyClassList.add(oMyClassList2);
        oMyClassList.add(oMyClassList3);
        oMyClassList.forEach(current -> {
            System.out.print(current.getLabel());
            System.out.print(" -> ");
            System.out.println(current.getValue());
        });

        Object[] oMyClassObjectArray = oMyClassList.toArray();
        MyClass[] oMyClassArray1 = oMyClassList.toArray(new MyClass[0]);
        System.out.println(oMyClassArray1.length);
        MyClass[] oMyClassArray2 = new MyClass[3];
        MyClass[] oMyClassArray3 = oMyClassList.toArray(oMyClassArray2);
        System.out.println(oMyClassArray2.length);
        System.out.println(oMyClassArray3.length);
        if(oMyClassArray2 == oMyClassArray3){
            System.out.println("Two references are the same values");
        }

        MyClass[] myArray = {new MyClass("val1", "abc"),
                            new MyClass("val2", "def"),
                            new MyClass("val3", "abc")};

        Collection<MyClass> myClassCollection = Arrays.asList(myArray);
        myClassCollection.forEach(current-> System.out.println(current.getLabel()));

        //Implementing Comparable
        TreeSet<MyClass> oMyClassTreeSet = new TreeSet<>();
        oMyClassTreeSet.add(new MyClass("222", "ghi"));
        oMyClassTreeSet.add(new MyClass("111", "abc"));
        oMyClassTreeSet.add(new MyClass("333", "def"));

        oMyClassTreeSet.forEach(current-> System.out.println(current.getValue()));



    }
}
