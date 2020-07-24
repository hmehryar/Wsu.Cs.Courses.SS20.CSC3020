package csc3020.lecture21.he7891;
/*
 * Author: Nathan Tattrie
 * Student ID: he7891
 * Lecture 21: Collections Cont'd
 * */

/* Collection Types
* ~ Java provides a wide variety of collections
* ~~ Each with specific behaviors
* ~ Collection interfaces
* ~~ Provide contract for collection behavior
* ~ Collection Classes
* ~~ Provide collection implementation
* ~~ Implement 1 or more collection interfaces
* */

/* Map Collections
* ~ Maps store key/value pairs
* ~~ Key used to identify/locate values
* ~~ Keys are unique
* ~~ Values can be duplicated
* ~~ Values can be null
* */

/* Common Map Types
* ~ Interface: Map
* ~~ Description: Basic map operations
* ~ Interface: SortedMap
* ~~ Description: Map whose keys are sorted
* ~ Class: HashMap
* ~~ Description: Efficient general purpose Map implementation
* ~ Class: TreeMap
* ~~ Description: SortedMap implemented as a self-balancing tree. Supports Comparable and Comparator sorting
* */

/* Common Map Methods
*  __________________________________________________________________________________________________
* | METHOD        | Description                                                                      |
* |---------------|----------------------------------------------------------------------------------|
* | put           | Add key and value                                                                |
* | putIfAbsent   | Add key and value if key not contained or value null                             |
* | get           | Return value for key, if key not found return null                               |
* | getOrDefault  | Return value for key, if key not found return the provided default code          |
* | values        | Return a Collection of the contained values                                      |
* | keySet        | Return a Set of the contained keys                                               |
* | forEach       | Perform action for each entry                                                    |
* | replaceAll    | Perform action for each entry replacing the key's value with the action's result |
* |--------------------------------------------------------------------------------------------------|
* */

/* Common SortedMap Methods
 *  _____________________________________________________________________________________________________
 * | METHOD     | Description                                                                            |
 * |------------|----------------------------------------------------------------------------------------|
 * | firstKey   | Return first key                                                                       |
 * | lastKey    | Return last key                                                                        |
 * | headMap    | Return a map for all keys that are less than the specified key                         |
 * | tailMap    | Return map for all keys that are greater than or equal to the specified key            |
 * | subMap     | Return a map for all keys that are >= to the starting key and less than the ending key |
 * |-----------------------------------------------------------------------------------------------------|
 * */

import java.util.*;

public class Lecture21Source {

    public static void main(String[] args) {

        ArrayList<String> oStringArrayList = new ArrayList<>();

        LinkedList<String> oStringLinkedList = new LinkedList<>();
        //oStringLinkedList.get(0);

        // Implementing Comparable
        TreeSet<MyClass> oMyClassTree = new TreeSet<>();
        oMyClassTree.add(new MyClass("2222", "ghi"));
        oMyClassTree.add(new MyClass("1111", "abc"));
        oMyClassTree.add(new MyClass("3333", "def"));
        oMyClassTree.forEach(current -> System.out.println(current.getValue()));

        // Comparator
        System.out.println("Comparator");
        TreeSet<MyClass> oMyClassTreeWithComparator = new TreeSet<>(new MyComparator());
        oMyClassTreeWithComparator.add(new MyClass("2222", "ghi"));
        oMyClassTreeWithComparator.add(new MyClass("3333", "abc"));
        oMyClassTreeWithComparator.add(new MyClass("1111", "def"));
        oMyClassTreeWithComparator.forEach(current -> System.out.println(current.toString()));


        // Map Collection
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
            System.out.println(key + " -> " + value);
        });

        oHashMap.replaceAll((key, value) -> {
            return value.toUpperCase();
        });

        oHashMap.forEach((key, value) -> {
            System.out.println(key + " -> " + value);
        });

        // SortedMap
        System.out.println("SortedMap");
        SortedMap<String, String> oSortedMap = new TreeMap<>();
        oSortedMap.put("2222", "ghi");
        oSortedMap.put("3333", "abc");
        oSortedMap.put("1111", "def");
        oSortedMap.put("6665", "xyz");
        oSortedMap.put("4444", "mno");
        oSortedMap.put("5555", "pqr");

        oSortedMap.forEach((key,value) -> {
            System.out.println(key + " -> " + value);
        });
        System.out.println("First Key: " + oSortedMap.firstKey());
        System.out.println("Last Key " + oSortedMap.lastKey());

        System.out.println("Head");
        SortedMap<String, String> oHeadSortedMap = oSortedMap.headMap("3333");
        oHeadSortedMap.forEach((key, value) -> {
            System.out.println(key + " -> " + value);
        });

        System.out.println("Tail");
        SortedMap<String, String> oTailSortedMap = oSortedMap.tailMap("3333");
        oTailSortedMap.forEach((key, value) -> {
            System.out.println(key + " -> " + value);
        });
    }
}
