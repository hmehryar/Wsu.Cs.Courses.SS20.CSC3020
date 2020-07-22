package com.csc3020.hw06.gv7006;

class InvalidStatementException extends Exception {
    InvalidStatementException(String reason, String statement) {
        super(String.format("%s: %s", reason, statement));
    }

    InvalidStatementException(String reason, String statement, Throwable cause) {
        super(String.format("%s: %s", reason, statement), cause);
    }
}
