package csc3020.lecture16.gn2289;

import java.io.*;

public class Lecture16Source {
    public static void main(String[] args) {
//        InputStream input = null;
//        try {
//            int intVal;
//            while ((intVal = input.read()) >= 0){
//                byte byteVal = (byte) intVal;
//            }
//        }catch (IOException ioException) {
//            System.out.println("IO Exception: Not Implemented");
//        }
//
//
//        //read 1 character at a time
//        int intVal;
//        try {
//            while((intVal = input.read()) >= 0) {
//                char charVal = (char) intVal;
//                //todo
//            }
//        }catch (IOException ioException) {
//            System.out.println("IO Exception: Not Implemented");
//        }
//
//        //read array of bytes
//        try {
//            int length;
//            byte[] byteBuff = new byte[10];
//            while ((length = input.read(byteBuff)) >= 0){
//                for (int index = 0; index < length; index++) {
//                    byte byteValue = byteBuff[index];
//                    //todo something with bytevalue
//                }
//            }
//        }catch (IOException ioException){
//            System.out.println("IO Exception: Not Implemented");
//        }
//
//        //read array of characters
//        Reader reader = null;
//        try {
//            int length;
//            char[] charBuff = new char[10];
//            while ((length = reader.read(charBuff)) >= 0) {
//                for (int index = 0; index < length; index++) {
//                    char charVal = charBuff[index];
//                    //todo
//                }
//            }
//        }catch (IOException ioException) {
//            System.out.println("IO Exception: Not Implemented");
//        }
//
//        //writing bytes
//        OutputStream output = null;
//        try {
//            byte byteVal = 100;
//            output.write(byteVal);
//
//            byte[] byteBuffer = {0,63,127};
//            output.write(byteBuffer);
//        }catch (IOException ioException) {
//            System.out.println("IO Exception: Not Implemented");
//        }
//
//        //writing characters
//        Writer writer = null;
//        try {
//            char charVal = 'a';
//            writer.write(charVal);
//            char[] charBuff =  {'a', 'b', 'z'};
//            writer.write(charBuff);
//
//            String stringVal = "Hello world";
//            writer.write(stringVal);
//        }catch (IOException ioException){
//            System.out.println("IO Exception: Not Implemented");
//        }
//
//        //exceptions handling and closing
//        try {
//            reader = new FileReader("E://resource.txt");
//            //do something
//
//        }catch (IOException ioException){
//            System.out.println("IO Exception: Not Implemented");
//        }finally {
//            try {
//                reader.close();
//            }catch (IOException ioException) {
//                System.out.println("IO Exception: Not Implemented");
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
            while ((length = reader.read(buff)) >= 0){
                System.out.println("\nlength: "+length);
                for (int index = 0; index < length; index++) {
                    System.out.print(buff[index]);
                }
            }
        }catch (IOException exception){
            System.out.println(exception.getClass().getSimpleName()+"   "+exception.getMessage());
        }finally {
            try {
                if (reader != null) {
                    reader.close();
                }

            }catch (IOException exception){
                System.out.println(exception.getClass().getSimpleName()+"   "+exception.getMessage());
            }
        }
    }
}
