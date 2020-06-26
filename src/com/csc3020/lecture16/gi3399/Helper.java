package com.csc3020.lecture16.gi3399;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

//Author: George Esho
public class Helper {
    static Reader openReader(String filePath) throws FileNotFoundException {
        return new FileReader(filePath);
    }
}
