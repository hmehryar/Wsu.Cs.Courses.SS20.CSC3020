package com.csc3020.lecture18.eu6179;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;

public class MyAutoClosable implements  AutoCloseable{
    public void saySomething() throws IOException{
        //FileReader reader=new FileReader("filePath.txt");
        throw new IOException("Custom Exception");
        //throw new Exception("New Exception Message");
        //System.out.println("Something");
    }
    public void ReadFromStreamByFileName() throws FileNotFoundException{

    }
    public void ReadFromStreamByUrl() throws MalformedURLException {

    }
    @Override
    public void close() throws Exception {
        throw new FileNotFoundException("Custom FileNotFoundException from close method");
        //System.out.println("close");
    }
}
