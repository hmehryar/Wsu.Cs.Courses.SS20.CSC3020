package csc3020.lecture16.gp7633;

import csc3020.lecture16.hm.Helper;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;

public class Lecture16Source {
    public static void main(String[] args) throws FileNotFoundException {
//        InputStream input = null;
//
//        // Read One Byte at a Time
//        try {
//            int intVal;
//            while ((intVal = input.read()) >= 0) {
//                byte byteVal = (byte) intVal;
//                // To Do: Do something with byteVal
//            }
//        } catch (IOException ioException) {
//            System.out.println("IOException : Not Implemented");
//        }
//
//        // Read One Character at a Time
//        // InputStream input;
//        try {
//            int intVal;
//            while ((intVal = input.read()) >= 0) {
//                char charVal = (char) intVal;
//                // To Do: Do something with charVal
//            }
//        } catch (IOException ioException) {
//            System.out.println("IOException : Not Implemented");
//        }
//
//        // Reading Array of Bytes
//        try {
//            int length;
//            byte[] byteBuff = new byte[10];
//            while ((length = input.read(byteBuff)) >= 0) {
//                for (int index = 0; index < length; index++) {
//                    byte byteVal = byteBuff[index];
//                    // To Do: Do something with byteVal
//                }
//            }
//        } catch (IOException ioException) {
//            System.out.println("IOException : Not Implemented");
//        }
//
//        // Reading Array of Characters
//        Reader reader = null;
//        try {
//            int length;
//            char[] charBuff = new char[10];
//            while ((length = reader.read(charBuff)) >= 0) {
//                for (int index = 0; index < length; index++) {
//                    char charVal = charBuff[index];
//                    // To Do: Do something with charVal
//                }
//            }
//        } catch (IOException ioException) {
//            System.out.println("IOException : Not Implemented");
//        }
//
//        // Writing Bytes
//        OutputStream output = null;
//        try {
//            byte byteVal = 100;
//            output.write(byteVal);
//
//            byte[] bytebuff = {0, 63, 127};
//            output.write(bytebuff);
//        } catch (IOException ioException) {
//            System.out.println("IOException : Not Implemented");
//        }
//
//        // Writing Characters
//        Writer writer = null;
//        try {
//            char charVal = 'a';
//            writer.write(charVal);
//
//            char[] charBuff = {'a', 'b', 'c'};
//            writer.write(charBuff);
//
//            String stringVal = "Hello World";
//            writer.write(stringVal);
//        } catch (IOException ioException) {
//            System.out.println("IOException : Not Implemented");
//        }
//
//        // Exception Handling and Closing
//        try {
//            reader = new FileReader("c:\\resource.txt");
//            // Do something with reader
//        } catch (IOException ioException) {
//            System.out.println("IOException : Not Implemented");
//        } finally {
//            try {
//                reader.close();
//            } catch (IOException ioException) {
//                System.out.println("IOException : 2nd Level : Not Implemented");
//            }
//        }
        doTryCatchFinally();
       }
    public static void doTryCatchFinally() {
        char[] buff = new char[8];
        int length;
        Reader reader = null;
        try {
            reader = Helper.openReader("file1.txt");
            while ((length = reader.read(buff)) >= 0) {
                System.out.println("\nLength: " + length);
                for (int i = 0; i < length; i++) {
                    System.out.println(buff[i]);
                }
            }
        } catch(IOException exception) {
            System.out.println(exception.getClass().getSimpleName() + " _ " + exception.getMessage());
        } finally {
            try {
                if (reader != null)
                    reader.close();
            } catch (IOException exception) {
                System.out.println(exception.getClass().getSimpleName() + " _ " + exception.getMessage());
            }
        }
    }
}
