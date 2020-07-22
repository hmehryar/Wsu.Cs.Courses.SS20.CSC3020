package com.csc3020.hw06.gi3399;

public class InvalidStatementException extends Exception {
    public String reason;
    public String statement;

    public InvalidStatementException(String reason, String statement) {
        super(reason + ": " + statement);
    }

    public InvalidStatementException(String reason, String statement, Throwable cause) {
        super(reason + ": " + statement, cause);

    }
}
