package com.csc3020.lecture16.he7891;
/*
 * Author: Nathan Tattrie
 * Student ID: he7891
 * Lecture 16: Input and Output with Streams and Files
 * */

/* Primary Packages
* ~ java.io
* ~~ Types related to stream-based I/O
* ~~ Legacy types related to files & filesystem
* ~ java.nio.file
* ~~ Types related to files & filesystem
* */

/* Streams
* ~ Stream is an ordered sequence of data
* ~~ Provides a common I/O model
* ~~ Abstracts detailing of underlying source or destination
* ~~ Stream types are unidirectional
* */

/* Two categories fo streams
* ~ Byte streams: interact as binary data
* ~ Text streams: interact as unicode characters
* ~ In general, interaction is the same for both stream types
* */

/* Stream Realities
* ~ Error Handling: Stream methods throw exceptions to indicate errors
* ~ Cleanup: Cannot rely on standard Java resource recovery
* */

/* Cleanup
* ~ Streams are backed by physical storage
* ~~ Often exist outside Java runtime
* ~~ Runtime may not reliably cleanup
* ~ Providing reliable cleanup
* ~~ Streams implement Closeable interface (1 method: close)
* */

/* Automating Cleanup
* ~ AutoCloseable interface
* ~~ 1 method: close
* ~~ Base interface of Closeable interface
* ~~ Provides support for try-with-resources
* ~ Try-with-resources
* ~~ Automates cleanup of 1 or more resources
* ~~~ A "resource" is any type that implements AutoCloseable
* ~~ Syntax similar to traditional try statement
* ~~ Optionally includes catch block(s)
* ~~~ Handle try body
* ~~~ Handle close method call
* */



import java.io.*;

public class Lecture16Source {
    public static void main(String[] args) {

//        // Reading One Byte at a Time
//        InputStream input = null; // create input stream
//        try {
//            int intVal;
//            while ((intVal = input.read()) >= 0) {
//                byte byteVal = (byte) intVal;
//                // do something with byteVal
//            }
//        }
//        catch (IOException ioException){
//            System.out.println("IOException : Not Implemented Exception");
//        }
//
//
//        // Reading Array of Bytes
//        try {
//            int length;
//            byte[] byteBuff = new byte[10];
//            while ((length = input.read(byteBuff)) >= 0) {
//                for (int i = 0; i < length; ++i) {
//                    byte byteVal = byteBuff[i];
//                    // do something with byteVal
//                }
//            }
//        }
//        catch (IOException ioException) {
//            System.out.println("IOException : Not Implemented Exception");
//        }
//
//
//        // Reading One Character at a Time
//        Reader reader = null; // create input stream
//        try {
//            int intVal;
//            while ((intVal = reader.read()) >= 0) {
//                char charVal = (char) intVal;
//                // do something with charVal
//            }
//        }
//        catch (IOException ioException){
//            System.out.println("IOException : Not Implemented Exception");
//        }
//
//        // Reading Array of Characters
//        try {
//            int length;
//            char[] charBuff = new char[10];
//            while ((length = reader.read(charBuff)) >= 0) {
//                for (int i = 0; i < length; ++i) {
//                    char charVal = charBuff[i];
//                    // do something with charVal
//                }
//            }
//        }
//        catch (IOException ioException) {
//            System.out.println("IOException : Not Implemented Exception");
//        }
//
//
//        // Writing Bytes
//        OutputStream output = null;
//        try {
//            // Single Byte
//            byte byteVal = 100;
//            output.write(byteVal);
//
//            // Array of Bytes
//            byte[] byteBuff = {0, 63, 127};
//            output.write(byteBuff);
//        }
//        catch (IOException ioException) {
//            System.out.println("IOException : Not Implemented Exception");
//        }
//
//
//        // Writing Characters
//        Writer writer = null;
//        try {
//            // Single Character
//            char charVal = 'a';
//            writer.write(charVal);
//
//            // Array of Characters
//            char[] charBuff = {'a', 'b', 'c'};
//            writer.write(charBuff);
//
//            // String
//            String stringVal = "Hello, World!";
//            writer.write(stringVal);
//        }
//        catch (IOException ioException) {
//            System.out.println("IOException : Not Implemented Exception");
//        }
//
//
//        // Exception Handling and Closing
//        //Reader reader;
//        try {
//            reader = new FileReader("D:\\resource.txt"); //open reader
//            // do something with reader
//        }
//        catch (IOException ioException) {
//            System.out.println("IOException : Not Implemented Exception");
//        }
//        finally {
//            try {
//                reader.close();
//            }
//            catch (IOException ioException) {
//                System.out.println("IOException : 2nd Level : Not Implemented Exception");
//            }
//        }
//
////        interface AutoCloseable {
////            void close() throws Exception;
////        }
////
////        interface Closeable extends AutoCloseable {
////            void close throws IOException;
////        }


        doTryCatchFinally();
    }

    public static void doTryCatchFinally() {
        char[] buffer = new char[8];
        int length;
        Reader reader = null;
        try {
            reader = Helper.openReader("file1.txt");
            while ((length = reader.read(buffer)) >= 0) {
                System.out.println("\nlength: " + length);
                for (int i = 0; i < length; i++) {
                    System.out.print(buffer[i]);
                }
            }
        }
        catch (IOException ioException) {
            System.out.println(ioException.getClass().getSimpleName() + " _ " + ioException.getMessage());
        }
        finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            }
            catch (IOException ioException) {
                System.out.println(ioException.getClass().getSimpleName() + " _ " + ioException.getMessage());
            }
        }
    }

}
