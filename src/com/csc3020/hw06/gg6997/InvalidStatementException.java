package csc3020.hw06.gg6997;

//custom exception inherits exception and forms two constructors
public class InvalidStatementException extends Exception{
    public InvalidStatementException(String reason,String statement)
    {
        super(reason+": "+statement);
    }
    public InvalidStatementException(String reason,String statement,Throwable cause)
    {
        super(reason+": "+statement,cause);
    }
}
