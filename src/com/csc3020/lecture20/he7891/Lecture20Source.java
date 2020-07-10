package com.csc3020.lecture20.he7891;
/*
 * Author: Nathan Tattrie
 * Student ID: he7891
 * Lecture : Collections
 * */

/* Managing Groups of Data
* ~ Apps often need to manage data in commonly typed groups
* ~~ Most basic solution is to use arrays
* ~ Arrays have limitations
* ~~ Statically sized
* ~~ Requires explicit position management
* ~~ Little more than a bunch of values
* ~ Collections provide more powerful options
* */

/* The Role of Collections
* ~ Collections hold and organize values
* ~~ Iterable
* ~~ Can provide type safety
* ~~ Tend to dynamically size
* ~ A wide variety of collections are available
* ~~ May be a simple list of values
* ~~ Can provide optimization or sophistication
* ~~~ Ordering
* ~~~ Prevent duplicates
* ~~~ Manage data as name/value pairs
* */

/* Collections and Type Safety
* ~ By default collections hold Object types
* ~~ Must convert return values to desired type
* ~~ Doesn't restrict types of values added
* ~ Collections can be type restricted
* ~~ Uses the Java concept of generics
* ~~ Type specified during collection creation
* ~ Collection type restriction is pervasive
* ~~ Return values appropriately typed
* ~~ Adding values limited to appropriate type
* */

/* Collection Interface
* ~ Each collection type has its own features
* ~~ But there are many that are common
* ~ Collection interface
* ~~ Provides common collection methods
* ~~ Implemented by most collection types
* ~~~ Map collections are notable exceptions
* ~~ Extends Iterable interface
* */

/* Common Equality-Based Methods
* ~ Method: Contains       |  Description: Return true if contains elements
* ~ Method: containsAll    |  Description: Return true if contains all members of another collection
* ~ Method: remove         |  Description: Remove element
* ~ Method: removeAll      |  Description: Remove all elements contained in another collection
* ~ Method: retainAll      |  Description: Remove all elements not contained in another collection
* */

/* Java 8 Collection Methods
* ~ Java 8 Introduced Lambda expressions
* ~~ simplify passing code as arguments
* ~ Collection methods that leverage lambdas
* ~~ forEach
* ~~~ Perform code for each member
* ~~ removeIf
* ~~~ Remove element if test is true
* */

/* Converting Between Collections and Arrays
* ~ Sometimes APIs require an array
* ~~ Often due to legacy or library code
* ~ Collection interface can return an array
* ~~ toArray() method
* ~~~ Returns Object array
* ~~ toArray(T[] array) method
* ~~~ Returns array of type T
* ~ Array content can be retrieved as collection
* ~~ Use Arrays class' asList method
* */

/* Collection Types
* ~ Java provides a wide variety of collections
* ~~ Each with specific behaviors
* ~ Collection interfaces
* ~~ Provide contract for collection behavior
* ~ Collection classes
* ~~ Provide collection implementation
* ~~ Implement 1 or more collection interfaces
* */

/* Common Collection Interfaces
* ~ Interface: Collection   |  Description: Basic collection operations
* ~ Interface: List         |  Description: Collection that maintains a particular order
* ~ Interface: Queue        |  Description: Collection with the concept of order and specific "head" element
* ~ Interface: Set          |  Description: Collection that contains no duplicate values
* ~ Interface: SortedSet    |  Description: A Set whose members are sorted
* */

/* Common Collection Classes
* ~ Interface: ArrayList
* ~~ Description: A List backed by a resizable array. Efficient random access but inefficient random inserts
* ~ Interface: LinkedList
* ~~ Description: A List and Queue backed by a doubly-linked list Efficient random insert but inefficient random access
* ~ Interface: HashSet
* ~~ Description: A Set implemented as a hash table Efficient general purpose usage at any size
* ~ Interface: TreeSet
* ~~ Description: A SortedSet implemented as a balanced binary tree Members accessible in order but less efficient to
*    modify and search than a HashSet
* */

/* Sorting
* ~ Some collections rely on sorting
* ~~ Two ways to specify sort behavior
* ~ Comparable interface
* ~~ Implemented by the type to be sorted
* ~~ Type specifies own short behavior
* ~~~ Should be consistent with equals
* ~ Comparator interface
* ~~ Implemented by type to perform sort Specifies sort behavior for another type
* */


import java.sql.SQLOutput;
import java.util.*;

public class Lecture20Source {

    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        list.add("Foo");
        list.add("Bar");
        System.out.println("Elements: " + list.size());
        for (Object object : list) {
            System.out.println(object.toString());
        }
        String strValue = (String) list.get(0);
        SomeClassIMadeUp oSomeClassIMadeUp = new SomeClassIMadeUp();
        list.add(oSomeClassIMadeUp);

        // Strongly typed list
        ArrayList<String> strList = new ArrayList<>();
        strList.add("Foo");
        strList.add("Bar");
        System.out.println("Elements: " + strList.size());
        for (String strItem: strList) {
            System.out.println(strItem);
        }
        String str = strList.get(0);
//        SomeClassIMadeUp oSomeClassIMadeUp1 = new SomeClassIMadeUp();
//        strList.add(oSomeClassIMadeUp1)
        LinkedList<String> stringLinkedList = new LinkedList<>();
        stringLinkedList.add("Baz");
        stringLinkedList.add("Boo");

        strList.addAll(stringLinkedList);
        for (String strItem : strList) {
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
        for (MyClass oMyClassItem: oMyClassList) {
            System.out.println(oMyClassItem.getLabel());
        }


        ArrayList<MyClass> oMyClassList1 = new ArrayList<>();
        MyClass oMyClass4 = new MyClass("v4", "xyz");
        MyClass oMyClass5 = new MyClass("v5", "xyz");
        MyClass oMyClass6 = new MyClass("v6", "xyz");
        oMyClassList1.add(oMyClass4);
        oMyClassList1.add(oMyClass5);
        oMyClassList1.add(oMyClass6);
        printArrayList(oMyClassList);

//        System.out.println("Before removing");
//        oMyClassList1.removeIf(current->current.getValue().equalsIgnoreCase("xYz"));
//        System.out.println("After removing");

        printArrayList(oMyClassList1);

//        oMyClassList.clear();
//        System.out.println("After Clear");
//        oMyClassList.forEach(current-> System.out.println(current.getLabel()));

        Object[] oMyClassObjectArray = oMyClassList.toArray();
        MyClass[] oMyClassArray1 = oMyClassList.toArray(new MyClass[0]);
        System.out.println(oMyClassArray1.length);
        MyClass[] oMyClassArray2 = new MyClass[3];
        MyClass[] oMyClassArray3 = oMyClassList.toArray(oMyClassArray2);
        System.out.println(oMyClassArray2.length);
        System.out.println(oMyClassArray3.length);


        if (oMyClassArray2 == oMyClassArray3) {
            System.out.println("a2 & a3 reference the same array");
        }

        MyClass[] oMyClassArray = {
            new MyClass("value1", "abc"),
            new MyClass("value2", "xyz"),
            new MyClass("value3", "abc")
        };
        Collection<MyClass> oMyClassCollection = Arrays.asList(oMyClassArray);
        oMyClassCollection.forEach(current-> System.out.println(current.getLabel()));

        // Implementing Comparable
        TreeSet<MyClass> oMyClassTree = new TreeSet<>();
        oMyClassTree.add(new MyClass("2222", "ghi"));
        oMyClassTree.add(new MyClass("1111", "abc"));
        oMyClassTree.add(new MyClass("3333", "def"));
        oMyClassTree.forEach(current -> System.out.println(current.getValue()));


    }

    public static void printArrayList(ArrayList<MyClass> oMyClassList) {
        oMyClassList.forEach(current -> {
            System.out.print(current.getLabel());
            System.out.print("->");
            System.out.println(current.getValue());
        });
    }
}
