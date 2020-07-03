package com.csc3020.lecture18.gi3399;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyAutoClosable implements AutoCloseable {
    public void saySomething() throws IOException {
//        FileReader reader = new FileReader("filePath.txt");
        throw new IOException("Custom Exception");
//        throw new Exception("New Exception Message");
        //        System.out.println("Something");
    }

    public void ReadeFromStreamByFileName() throws FileNotFoundException {

    }

    public void ReadFromStreamByUrl() throws FileNotFoundException {

    }
    @Override
    public void close() throws Exception {
        throw new FileNotFoundException("Custom FileNotFoundException from close method");
//        System.out.println("close");
    }
}
