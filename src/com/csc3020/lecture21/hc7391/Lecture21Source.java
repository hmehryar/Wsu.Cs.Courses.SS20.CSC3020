package csc3020.lecture21.hc7391;

import java.util.*;

public class Lecture21Source {

    public static void main(String[] args) {
        //Implementing Comparable

        TreeSet<MyClass> oMyClassTreeSet = new TreeSet<>();

        oMyClassTreeSet.add(new MyClass("2222", "ghi"));
        oMyClassTreeSet.add(new MyClass("1111", "abc"));
        oMyClassTreeSet.add(new MyClass("3333", "def"));
        System.out.println("Using Comparable");
        oMyClassTreeSet.forEach(current-> System.out.println(current.getValue()));

        System.out.println("--------------------");

        System.out.println("Using a Comparator");
        //sorts according to label
        TreeSet<MyClass> oMyClassTreeWithComparator= new TreeSet<>(new MyComparator());
        oMyClassTreeWithComparator.add(new MyClass("2222", "ghi"));
        oMyClassTreeWithComparator.add(new MyClass("3333", "abc"));
        oMyClassTreeWithComparator.add(new MyClass("1111", "def"));
        oMyClassTreeWithComparator.forEach(current-> System.out.println(current.toString()));

        System.out.println("----------------------------");
        System.out.println("Using Map Collection");
        //Map Collection
        Map<String,String> oHashMap = new HashMap<>();
        oHashMap.put("2222","ghi");
        oHashMap.put("3333","abc");
        oHashMap.put("1111","def");

        String oString1 = oHashMap.get("3333");
        System.out.println(oString1);

        String oString2 = oHashMap.get("9999");
        System.out.println(oString2);

        String oString3 = oHashMap.getOrDefault("9999", "xyz");
        System.out.println(oString3);

        System.out.println("---------------------");
        System.out.println("Using Lamba Expression To Print Out");
        oHashMap.forEach((key, value)-> System.out.println(key+"-> "+value)); //not sorted

        System.out.println("------------------------");
        System.out.println("Using replace all to uppercase");
        oHashMap.replaceAll((key,value)->{return value.toUpperCase();}); //use return statement with brackets
        oHashMap.forEach((key, value)-> System.out.println(key+"-> "+value));

        //sorted map
        System.out.println("-------------------");
        System.out.println("With Sorted map");
        SortedMap<String, String> oSortedMap = new TreeMap<>();
        oSortedMap.put("2222","ghi");
        oSortedMap.put("3333","abc");
        oSortedMap.put("1111","def");
        oSortedMap.put("6666","xyz");
        oSortedMap.put("4444","mno");
        oSortedMap.put("5555","pqr");

        oSortedMap.forEach((key,value)->
            System.out.println(key+"->"+value)
        );

       System.out.println(oSortedMap.firstKey());
       System.out.println(oSortedMap.lastKey());
        System.out.println("Head");
        SortedMap<String, String> oHeadSortedMap = oSortedMap.headMap("3333");
        oHeadSortedMap.forEach((key,value)->System.out.println(key+"->"+value));

        System.out.println("Tail");
        SortedMap<String,String> oSortedTailMap = oSortedMap.tailMap("3333");
        oSortedTailMap.forEach((key,value)->System.out.println(key+"->"+value));



    }// end main

}// end class
