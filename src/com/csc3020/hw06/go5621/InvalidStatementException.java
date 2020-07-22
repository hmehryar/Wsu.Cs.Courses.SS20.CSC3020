package com.csc3020.hw06.go5621;
//*
// Author: Patricia Liu
// Homework 6: InvalidStatementException
// */
public class InvalidStatementException extends Exception {
    InvalidStatementException(String reason, String statement) {
        super(reason + ": " + statement);
    }

    InvalidStatementException(String reason, String statement, Throwable cause) {
        super(reason + ": " + statement, cause);
    }
}
