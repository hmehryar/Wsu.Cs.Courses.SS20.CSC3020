package csc3020.hw06.hc7391;

public class InvalidStatementException extends Exception{

   private InvalidStatementException() {
     super();
    }

    public InvalidStatementException(String reason, String statement){
       super(reason + ": "+ statement);
    }

    public InvalidStatementException(String statement, String reason, Throwable cause){
       super((statement + ": "+ reason), cause);
    }
}
