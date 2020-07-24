package csc3020.lecture18.he7891;
/*
 * Author: Nathan Tattrie
 * Student ID: he7891
 * Lecture 18: Input and Output with Streams and Files Continued
 * */

import javax.annotation.processing.Filer;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;

public class MyAutoClosable implements AutoCloseable {

    public void saySomething() throws IOException {
        //FileReader reader = new FileReader("filePath.txt");
        throw new IOException("Custom Exception");
        //throw new Exception("New Exception Message");
        //System.out.println("Something");
    }

    public void ReadFromStreamByFileName() throws FileNotFoundException {

    }

    public void ReadFromStreamByURL() throws MalformedURLException {

    }

    @Override
    public void close() throws Exception {
        throw new IOException("Custom IO Exception from close method");
        //System.out.println("close");
    }

}
