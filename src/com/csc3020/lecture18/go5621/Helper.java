package com.csc3020.lecture18.go5621;

import java.io.*;

public class Helper {
    static FileReader openReader(String filePath) throws FileNotFoundException {
        return new FileReader(filePath);
    }

    static FileWriter openWriter(String filePath) throws IOException {
        return new FileWriter(filePath);
    }
}
