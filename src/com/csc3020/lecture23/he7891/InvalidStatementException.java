package csc3020.lecture23.he7891;
/*
 * Author: Nathan Tattrie
 * Student ID: he7891
 * Homework Assignment 06
 * InvalidStatementException.java
 * */

// Required Items Step 2
public class InvalidStatementException extends Exception {

    // Required Items Step 2.1
    public InvalidStatementException(String reason, String statement) {
        super(reason + ": " + statement);
    }

    // Required Items Step 2.2
    public InvalidStatementException (String reason, String statement, Throwable cause) {
        super(reason + ": " + statement, cause);
    }


}
