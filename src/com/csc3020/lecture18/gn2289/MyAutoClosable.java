package csc3020.lecture18.gn2289;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyAutoClosable implements AutoCloseable{

    public void saySomething() throws IOException {
        FileReader reader = new FileReader("file1.txt");
        throw new IOException("custom exception");
        //System.out.println("something");
    }

//    public void ReadFromStreamByFileName() throws FileNotFoundException() {
//
//    }

    @Override
    public void close() throws Exception {
        throw new IOException("Custom io exception from close method");
        //System.out.println("close");
    }
}
