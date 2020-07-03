package csc3020.lecture16.go3480;

import java.io.*;

public class Lecture16Source {
    public static void main(String[] args) {
//        InputStream input = null;
//
//        //Reading One Byte at a Time
//        try {
//            int intVal;
//            while ((intVal = input.read()) >= 0) {
//                byte byteVal = (byte) intVal;
//                //Do something with byteVal
//            }
//        } catch (IOException ioException) {
//            System.out.println("IOException : Not Implemented Exception");
//        }
//
//        //Reading One Character at a Time
//        try {
//            int intVal;
//            while ((intVal = input.read()) >= 0) {
//                char charVal = (char) intVal;
//                //Do something with charVal
//            }
//        } catch (IOException ioException) {
//            System.out.println("IOException : Not Implemented Exception");
//        }
//
//        //Reading Array of Bytes
//        try {
//            int length;
//            byte[] byteBuff = new byte[10];
//            while ((length = input.read(byteBuff)) >= 0) {
//                for (int i = 0; i < length; i++) {
//                    byte byteVal = byteBuff[i];
//                    //Do something with byteVal
//                }
//            }
//        } catch (IOException ioException) {
//            System.out.println("IOException : Not Implemented Exception");
//        }
//
//        Reader reader = null;
//
//        //Reading Array of Characters
//        try {
//            int length;
//            char[] charBuff = new char[10];
//            while ((length = reader.read(charBuff)) >= 0) {
//                for (int i = 0; i < length; i++) {
//                    char charVal = charBuff[i];
//                    //Do something with charVal;
//                }
//            }
//        } catch (IOException ioException) {
//            System.out.println("IOException : Not Implemented Exception");
//        }
//
//        //Writing Bytes
//        OutputStream output = null;
//        try {
//            byte byteVal = 100;
//            output.write(byteVal);
//
//            byte[] byteBuff = {0, 63, 127};
//        } catch (IOException ioException) {
//            System.out.println("IOException : Not Implemented Exception");
//        }
//
//        //Writing Characters
//        Writer writer = null;
//        try {
//            char charVal = 'a';
//            writer.write(charVal);
//
//            char[] charBuff = {'a', 'b', 'z'};
//            writer.write(charBuff);
//
//            String stringVal = "Hello World";
//            writer.write(stringVal);
//        } catch (IOException ioException) {
//            System.out.println("IOException : Not Implemented Exception");
//        }
//
//        //Exception Handling and Closing
//        try {
//            reader = new FileReader("d:\\resource.txt");
//            //Do something with reader
//        } catch (IOException ioException) {
//            System.out.println("IOException : Not Implemented Exception");
//        } finally {
//            try {
//                reader.close();
//            } catch (IOException ioException) {
//                System.out.println("IOException : 2nd Level : Not Implemented Exception");
//            }
//        }
        doTryCatchFinally();
    }
    public static void doTryCatchFinally() {
        char[] buff = new char[0];
        int length;
        Reader reader = null;
        try {
            reader = Helper.openReader("file1.txt");
            while ((length = reader.read(buff)) >= 0) {
                System.out.println("\nLength: "+length);
                for (int i = 0; i < length; i++) {
                    System.out.println(buff[i]);
                }
            }
        } catch (IOException exception) {
            System.out.println(exception.getClass().getSimpleName()+" - "+exception.getMessage());
        } finally {
            try {
                if (reader != null)
                    reader.close();
            } catch (IOException exception) {
                System.out.println(exception.getClass().getSimpleName()+" - "+exception.getMessage());
            }
        }
    }
}
