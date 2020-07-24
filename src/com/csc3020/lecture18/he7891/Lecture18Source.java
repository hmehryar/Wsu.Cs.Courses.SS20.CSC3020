package csc3020.lecture18.he7891;
/*
 * Author: Nathan Tattrie
 * Student ID: he7891
 * Lecture 18: Input and Output with Streams and Files Continued
 * */

/* Automating Cleanup
* ~ AutoCloseable interface
* ~ 1 method: close
* ~ Base interface of Closeable interface
* ~ Provides support for try-with-resources
* ~ Try-with-resources
* ~~ Automates cleanup of 1 or more resources
* ~~~ A "resource" is any type that implements AutoCloseable
* ~~ Syntax similar to traditional try statement
* ~~ Optionally includes catch block(s)
* ~~~ Handle try body
* ~~~ Handle close method call
* */

/* Chaining Streams
* ~ Streams are often chained together
* ~~ ONe stream instance leverages another
* ~~ Creates higher-level functionality
* ~~ Simplifies reusability
* ~~ Chain using constructor
* ~ InputStreamReader leverages chaining
* ~~ Reader behavior over InputStream
* ~~ Character behavior over binary
* */

/* Accessing Files
* ~ Often use streams for file-based I/O
* ~ Class for each stream type in java.io package
* ~~ FileReader
* ~~ FileWriter
* ~~ FileInputStream
* ~~ FileOutputStream
* ~ The java.io classes are now deprecated
* ~~ Still widely used in code
* */

/* Buffered Streams
* ~ Direct file access can be inefficient
* ~ Buffered streams can improve efficiency
* ~~ Buffers content in memory
* ~~ Performs reads/writes in large chucks
* ~~ Reduces underlying stream interaction
* ~ Buffering available for all 4 stream types
* ~~ BufferedReader
* ~~ BufferedWriter
* ~~ BufferedInputStream
* ~~ BufferedOutputStream
* */

/* Buffered Streams and Line Breaks
* ~ Line breaks vary across platforms
* ~~ Unix: \n (new line)
* ~~ Windows: \r\n (carriage return & new line)
* ~ Buffered streams add line break support
* ~~ Uses correct value for current platform
* ~~ BufferedWriter - Generate line breaks: newLine()
* ~~ BufferedReader - Line based read: readLine()
* */



import java.io.*;

public class Lecture18Source {
    public static void main(String[] args) {

        doTryCatchFinally();
        System.out.println();
        System.out.println("____________________________");
        doTryWithResources();
        System.out.println();
        System.out.println("____________________________");
        doTryWithMultiResources();
        System.out.println();
        System.out.println("____________________________");
        doClosingThing();
        System.out.println();
        System.out.println("____________________________");
        doBufferReading();
        System.out.println();
        System.out.println("____________________________");
        System.out.println("doBufferedWriting");
        String[] data = {
                "Line 1",
                "Line 2 2",
                "Line 3 3 3",
                "Line 4 4 4 4",
                "Line 5 5 5 5 5"};
        doBufferedWriting(data);
        System.out.println();
        System.out.println("____________________________");
        try {
            doBufferedReadingLineByLine();
        }
        catch (IOException ioException) {
            ioException.printStackTrace();
        }
        System.out.println();
        System.out.println("____________________________");

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

    public static void doTryWithResources() {
        char[] buffer = new char[8];
        int length;
        //Reader reader = null;
        try (Reader reader = Helper.openReader("file1.txt");){
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
    }

    public static void doTryWithMultiResources() {
        char[] buff = new char[8];
        int length;
        try (Reader reader = Helper.openReader("file1.txt");
            Writer writer = Helper.openWriter("file2.txt")) {
            while ((length = reader.read(buff)) >= 0) {
                System.out.println("\nlength: " + length);
                writer.write(buff, 0, length);
            }
        }
        catch (IOException ioException) {
            System.out.println(ioException.getClass().getSimpleName() + " _ " + ioException.getMessage());
        }
    }


    public static void doClosingThing() {
        try (MyAutoClosable oMyAutoCloseable = new MyAutoClosable()) {
            //throw new Exception("New Exception");
            oMyAutoCloseable.saySomething();
        }
        catch (Exception exception) {
            System.out.println(exception.getClass().getSimpleName() + " _ " + exception.getMessage());
            for (Throwable throwable : exception.getSuppressed() ) {
                System.out.println("Suppressed: " + throwable.getMessage());
            }
        }
    }


    public static void doBufferReading() {
        try (BufferedReader oBufferedReader = new BufferedReader(new FileReader("file1.txt"))) {
            int intVal;
            while ((intVal = oBufferedReader.read()) >= 0) {
                char charVal = (char)intVal;
                System.out.print(charVal);
            }
            System.out.println();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }


    public static void doBufferedWriting(String[] data) {
        try(BufferedWriter oBufferedWriter = new BufferedWriter(new FileWriter("data.txt"))) {
            for (String stringItem : data) {
                oBufferedWriter.write(stringItem);
                oBufferedWriter.newLine();
            }
        }
        catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }


    public static void doBufferedReadingLineByLine() throws IOException {
        try (BufferedReader oBufferedReader = new BufferedReader(new FileReader("data.txt"))) {
            String strValue;
            while ((strValue = oBufferedReader.readLine()) != null) {
                System.out.println(strValue);
            }
        }
    }

}
