package csc3020.lecture18.gz0715;

import java.io.FileReader;
import java.io.IOException;

public class MyAutoClosable implements AutoCloseable {
    public void saySomething() throws IOException {
        FileReader reader = new FileReader("E:\\CSC3020SS20\\src\\com\\csc3020\\lecture18\\gz0715\\file1.txt");
        throw new IOException("custom Exception");
        //throw new Exception("New Exception Message");
        //System.out.println("Something!");
    }

    @Override
    public void close() throws Exception {
        throw new IOException("Custom IO Exception from close method");
        //System.out.println("close");
    }
}
