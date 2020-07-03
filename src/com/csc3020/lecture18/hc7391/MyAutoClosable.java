package csc3020.lecture18.hc7391;

import java.io.IOException;

public class MyAutoClosable implements AutoCloseable {
   public void saySomething() throws IOException{
       //FileReader reader = new FileReader("filepath.txt");
       throw new IOException("Custom Exception");
       //throw new Exception("New Exception Message");
       //System.out.println("Something");
   }

    @Override
    public void close() throws Exception {
       throw new IOException("Custom IO Exception from close method");
       // System.out.println("close");
    }
}
