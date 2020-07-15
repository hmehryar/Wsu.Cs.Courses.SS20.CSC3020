package com.csc3020.lecture21.go5621;

import java.util.*;

public class Lecture21Source {
    public static void main(String[] args) {
        ArrayList<String> oStringArrayList = new ArrayList<>();
        LinkedList<String> oStringLinkedList = new LinkedList<>();
        //oStringLinkedList.get(0);

        //Implementing Comparable
        System.out.println("Comparable");
        TreeSet<MyClass> oMyClassTree = new TreeSet<>();
        oMyClassTree.add(new MyClass("2222", "ghi"));
        oMyClassTree.add(new MyClass("1111", "abc"));
        oMyClassTree.add(new MyClass("3333", "def"));
        oMyClassTree.forEach(current -> System.out.println(current.getValue()));

        System.out.println("Comparator");
        TreeSet<MyClass> oMyClassTreeWithComparator = new TreeSet<>(new MyComparator());
        oMyClassTreeWithComparator.add(new MyClass("2222", "ghi"));
        oMyClassTreeWithComparator.add(new MyClass("3333", "abc"));
        oMyClassTreeWithComparator.add(new MyClass("1111", "def"));
        oMyClassTreeWithComparator.forEach(current -> System.out.println(current.toString()));

        //Map Collection
        Map<String, String> map = new HashMap<>();
        map.put("2222", "ghi");
        map.put("1111", "abc");
        map.put("3333", "def");

        String s1 = map.get("3333");
        System.out.println(s1);

        String s2 = map.get("9999");
        System.out.println(s2);

        String s3 = map.getOrDefault("9999", "xyz");
        System.out.println(s3);

        map.forEach( (k, v) -> System.out.println(k + " | " + v));
        map.replaceAll( (k, v) -> v.toUpperCase());
        map.forEach( (k, v) -> System.out.println(k + " | " + v));

        //SortedMap
        SortedMap<String, String> sortedMap = new TreeMap<>();
        sortedMap.put("2222", "ghi");
        sortedMap.put("3333", "abc");
        sortedMap.put("1111", "def");
        sortedMap.put("6666", "xyz");
        sortedMap.put("4444", "mno");
        sortedMap.put("5555", "pqr");
        sortedMap.forEach( (k, v) -> System.out.println(k + " -> " + v));
        System.out.println(sortedMap.firstKey());
        System.out.println(sortedMap.lastKey());

        SortedMap<String, String> hMap = sortedMap.headMap("3333");
        hMap.forEach( (k, v) -> System.out.println(k + " -> " + v));

        SortedMap<String, String> tMap = sortedMap.tailMap("3333");
        tMap.forEach( (k, v) -> System.out.println(k + " -> " + v));


    }
}
