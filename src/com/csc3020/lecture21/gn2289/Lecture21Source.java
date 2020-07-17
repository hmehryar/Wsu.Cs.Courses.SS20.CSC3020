package csc3020.lecture21.gn2289;

import java.util.*;

public class Lecture21Source {
    public static void main(String[] args) {
        ArrayList<String> oStringArrayList = new ArrayList<>();

        LinkedList<String> oStringLinkedList = new LinkedList<>();
        //oStringLinkedList.get(0);


        //comparable
        System.out.println("comparable");
        TreeSet<MyClass> oMyClassTree = new TreeSet<>();
        oMyClassTree.add(new MyClass("1111", "abc"));
        oMyClassTree.add(new MyClass("2222", "efg"));
        oMyClassTree.add(new MyClass("333", "hij"));
        oMyClassTree.forEach(current -> System.out.println(current.getValue()));

        System.out.println("comparator");
        TreeSet<MyClass> oMyClassTreeWithComparator = new TreeSet<>(new MyComparator());
        oMyClassTreeWithComparator.add(new MyClass("1111", "abc"));
        oMyClassTreeWithComparator.add(new MyClass("2222", "efg"));
        oMyClassTreeWithComparator.add(new MyClass("333", "hij"));
        oMyClassTreeWithComparator.forEach(current -> System.out.println(current.toString()));

        //map collections
        Map<String, String> oHashMap = new HashMap<>();
        oHashMap.put("2222", "efg");
        oHashMap.put("1111", "abc");
        oHashMap.put("3333", "hij");

        String oString1 = oHashMap.get("3333");
        System.out.println(oString1);

        String oString2 = oHashMap.get("9999");
        System.out.println(oString2);

        String oString3 = oHashMap.getOrDefault("9999", "xyz");
        System.out.println(oString3);

        oHashMap.forEach((key,value) -> {
            System.out.println(key+" -> "+value);
        });

        oHashMap.replaceAll((key,value)->{
            return value.toUpperCase();
        });

        oHashMap.forEach((key,value) -> {
            System.out.println(key+" -> "+value);
        });

        //sorted map
        SortedMap<String, String> oSortedMap = new TreeMap<>();
        oSortedMap.put("2222", "efg");
        oSortedMap.put("1111", "abc");
        oSortedMap.put("3333", "hij");
        oSortedMap.put("6666", "xyz");
        oSortedMap.put("4444", "mno");
        oSortedMap.put("5555", "pqr");

        oSortedMap.forEach((key, value)-> {
            System.out.println(key+" -> "+value);
        });

        System.out.println(oSortedMap.firstKey());
        System.out.println(oSortedMap.lastKey());

        SortedMap<String, String> oHeadSortedMap = oSortedMap.headMap("3333");
        oHeadSortedMap.forEach((key, value) -> {
            System.out.println(key+" -> "+value);
        });

        System.out.println("tail");
        SortedMap<String, String > oTailSortedmap = oSortedMap.tailMap("3333");
        oTailSortedmap.forEach((key, value) -> {
            System.out.println(key+ " -> "+value);
        });
    }
}
