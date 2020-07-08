package csc3020.lecture18.gr4381;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;

public class MyAutoClosable implements AutoCloseable{
    public void saySomething() throws IOException{
        //FileReader reader = new FileReader("filePath.txt");
        throw new IOException("Custom Exception");
        //throw new Exception("New Exception Message");
        //System.out.println("Something");
    }
    public void readFromStreamByFileName() throws FileNotFoundException{

    }
    public void readFromStreamByURL() throws MalformedURLException {

    }
    @Override
    public void close() throws Exception {
        throw new IOException("Custom IO Exception from close method");
        //System.out.println("close");
    }
}
