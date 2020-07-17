package csc3020.lecture21.go1527;

import java.util.*;

public class Lecture21Source {
    public static void main(String[] args) {
        ArrayList<String> oStringArrayList = new ArrayList<>();

        System.out.println("Comparable");
        LinkedList<String> oStringLinkedList = new LinkedList<>();
        TreeSet<MyClass> oMyClassTree = new TreeSet<>();
        oMyClassTree.add(new MyClass("2222", "ghi"));
        oMyClassTree.add(new MyClass("1111", "abc"));
        oMyClassTree.add(new MyClass("3333", "def"));
        oMyClassTree.forEach(current -> System.out.println(current.getValue()));

        System.out.println("Comparator");
        TreeSet<MyClass> oMyClassTreeWithComparator = new TreeSet<>(new MyComparator());
        oMyClassTreeWithComparator.add(new MyClass("2222", "ghi"));
        oMyClassTreeWithComparator.add(new MyClass("1111", "abc"));
        oMyClassTreeWithComparator.add(new MyClass("3333", "def"));
        oMyClassTreeWithComparator.forEach(current -> System.out.println(current.toString()));

        //Map Collection
        Map<String, String> oHashMap = new HashMap<>();
        oHashMap.put("2222", "ghi");
        oHashMap.put("3333", "abc");
        oHashMap.put("1111", "def");

        String oString1 = oHashMap.get("3333");
        System.out.println(oString1);

        String oString2 = oHashMap.get("9999");
        System.out.println(oString2);

        String oString3 = oHashMap.getOrDefault("9999", "xyz");
        System.out.println(oString3);

        oHashMap.forEach((key, value) -> {
            System.out.println(key+" -> "+value);
        });

        oHashMap.replaceAll((key, value) -> {
            return value.toUpperCase();
        });

        oHashMap.forEach((key, value) -> {
            System.out.println(key+" -> "+value);
        });

        //SortedMap
        System.out.println("Sorted Map");

        SortedMap<String, String> oSortedMap = new TreeMap<>();
        oSortedMap.put("2222", "ghi");
        oSortedMap.put("3333", "abc");
        oSortedMap.put("1111", "def");
        oSortedMap.put("6666", "xyz");
        oSortedMap.put("4444", "mno");
        oSortedMap.put("5555", "pqr");

        oSortedMap.forEach((key, value) -> {
            System.out.println(key+" -> "+value);
        });
        System.out.println(oSortedMap.firstKey());
        System.out.println(oSortedMap.lastKey());

        System.out.println("Head");
        SortedMap<String, String> oHeadSortedMap = oSortedMap.headMap("3333");
        oHeadSortedMap.forEach((key, value) -> {
            System.out.println(key+" -> "+value);
        });

        System.out.println("Tail");
        SortedMap<String, String> oTailSortedMap = oSortedMap.tailMap("3333");
        oTailSortedMap.forEach((key, value) -> {
            System.out.println(key+" -> "+value);
        });
    }
}
