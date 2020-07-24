package csc3020.lecture13.he7891;
/*
 * Author: Nathan Tattrie
 * Student ID: he7891
 * Lecture 13: Packages
 * */

/* What Is A Package?
* ~ A package is a group of related types
* ~~ Create a namespace
* ~~ Provide an access boundary
* ~~ Act as a unit of distribution
* */

/* Declaring Packages
* ~ Each source file identifies the associated package (Use package keyword)
* ~~ Package declaration must appear before any type declarations
* ~~ Applies to all package types...
* */

/* Packages Create a Namespace
* ~ Package name is part of the type name
* ~~ Convention creates unique package name
* ~~~ Follows reverse domain name structure
* ~~ Type name is qualified by package name
* */

/* Determining a Type's Package
* ~ Compiler needs to know each type's package (explicitely qualifying each type is impractical)
* ~~ Java offers several alternatives explicitely qualifies types (allows use of a type's simple name in code)
* ~~~ Type in current package do not need to be qualified
* ~~~ Types in java.lang package do not need to be qualified
* ~~~~ Object ... String, StringBuilder, many more
* ~~~ ...
* */

/* Type Imports
* ~ Type imports guide compiler to map simple names to qualified names (use import keyword followed by qualified name)
* ~~ Single type import
* ~~~ provides mapping for a single type
* ~~~ Preferred way to import types
* ~~~ Most modern IDEs will add automatically
* ~~ Import on demand
* ~~~ Provides mapping for all type sin a package
* ~~~ Use with caution
* ~~~ Exposes code to potential breakages from changes in referenced packages
* */

/* Limiting Access to Package Content
* ~ Packages can serve as an access boundary (often referred to as package private)
* ~~ Useful for creating types and features to support functionality provided by the package
* ~~~ Types and features are not meant to be used stand-alone
* ~~~ Can apply to a type
* ~~~~ Entire type is inaccessible outside of the package
* ~~~ Can Apply to type members
* ~~~~ Specific members of an otherwise accessible type are inaccessible outside of the package
* */

/* Access Modifiers
* ~ no access modifier: only within its own package (Is usable on types, is usable on members)
* ~ public: everywhere (Is usable on types, is usable on members)
* ~ private: only within its own class (not usable on types, is usable on members)
* ~ protected: only within its own class and subclasses (not usable on types, is usable on members)
* */

/* Packages Provide a Unit of Distribution
* ~ Packages provide a predictable software structure (simplifies distribution)
* ~~ Class files organized in hierarchical folders reflecting the package name
* ~~~ Each part of the package name is a separate folder
* */

/* Archive Files
* ~ Package folder structure can be placed into an archive file (commonly known as a jar file)
* ~~ Places package folder structure into a single file (supports compressing content)
* ~~~ Optionally includes a manifest (provides information regarding archive content)
* ~~~~ List of name-value pairs
* ~~~~ Commonly used to define startup class
* */

/* Create Archive Files
* ~ The JDK provides a utility for creating archive files (jar command line utility)
* ~~ Capability included with many other tools
* ~~~ Integrated development environments (commonly known as IDEs)
* ~~~ Build automation systems (commonly known as build managers like Gradle or Maven)
* */

/**/


import csc3020.lecture12.he7891.CargoFlight;

//import csc3020.lecture13.he7891.travel.Passenger;
//import csc3020.lecture13.he7891.travel.Flight;
import csc3020.lecture13.he7891.travel.*;

//import csc3020.lecture13.he7891.xyzcompany.bar.Beer;
//import csc3020.lecture13.he7891.xyzcompany.bar.Wine;
import csc3020.lecture13.he7891.xyzcompany.bar.*;


public class Lecture13Source {
    public static void main(String[] args) {

        //new com.csc3020.lecture13.he7891.Lecture13Source();
        Flight oFlight = new Flight();
        csc3020.lecture11.he7891.Flight oLecture11Flight = new csc3020.lecture11.he7891.Flight();
        CargoFlight oCargoFlight = new CargoFlight();

        Flight lax175 = new Flight(175);
        Beer  liteBeer = new Beer();
        Passenger jane = new Passenger();
        Wine merlot = new Wine();

        lax175.getFlightNumber();


    }
}
