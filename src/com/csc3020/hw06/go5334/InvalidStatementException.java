package com.csc3020.hw06.go5334;

class InvalidStatementException extends Exception
{
    public InvalidStatementException(String reason,String statement)
    {
        super(reason+": "+statement);
    }
    public InvalidStatementException(String reason,String statement,Throwable cause)
    {
        super(reason+": "+statement,cause);
    }
}