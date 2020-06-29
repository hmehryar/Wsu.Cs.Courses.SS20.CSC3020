package com.csc3020.lecture16.go5334;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
public class helper {
    static FileReader openReader(String filePath) throws FileNotFoundException {
        return  new FileReader(filePath);
    }
}