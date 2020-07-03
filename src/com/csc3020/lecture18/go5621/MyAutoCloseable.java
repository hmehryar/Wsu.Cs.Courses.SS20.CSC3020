package com.csc3020.lecture18.go5621;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyAutoCloseable implements AutoCloseable{

    public void saySomething() throws IOException {
        FileReader reader = new FileReader("fileName.txt");
        throw new IOException("Custom exception");
        //System.out.println("Something");
    }

    public void ReaderFromStreamByFileName() throws FileNotFoundException {

    }

    @Override
    public void close() throws Exception {
        throw new IOException("Custom IOException from close method");
        //System.out.println("close");
    }
}
