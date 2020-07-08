package csc3020.lecture18.fy2906;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;

public class MyAutoClosable implements  AutoCloseable{
    public void saySomething() throws IOException {
        throw new IOException("Custom Exception");
    }
    public void ReadFromStreamByFileName() throws FileNotFoundException {

    }
    public void ReadFromStreamByUrl() throws MalformedURLException {

    }
    @Override
    public void close() throws Exception {
        throw new FileNotFoundException("Custom FileNotFoundException from close method");
    }
}
