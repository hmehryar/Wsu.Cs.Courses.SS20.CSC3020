package com.csc3020.lecture18.he7891;
/*
 * Author: Nathan Tattrie
 * Student ID: he7891
 * Lecture 18: Input and Output with Streams and Files Continued
 * */

import java.io.*;

public class Helper {
    static Reader openReader(String filePath) throws FileNotFoundException {
        return new FileReader(filePath);
    }

    static FileWriter openWriter(String filePath) throws IOException {
        return new FileWriter(filePath);
    }

}
