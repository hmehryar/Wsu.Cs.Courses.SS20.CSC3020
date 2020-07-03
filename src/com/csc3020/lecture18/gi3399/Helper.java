package com.csc3020.lecture18.gi3399;

import java.io.*;

//Author: George Esho
public class Helper {
    static Reader openReader(String filePath) throws FileNotFoundException {
        return new FileReader(filePath);
    }

    static FileWriter openWriter(String filepath) throws IOException {
        return new FileWriter(filepath);
    }
}
