package com.csc3020.lecture16.go5621;

import java.io.*;

public class Lecture16Source {

    public static void doTryCatchFinally() {
        char[] buff = new char[8];
        int length;
        Reader reader = null;
        try {
            reader = Helper.openReader("file1.txt");
            while((length = reader.read(buff)) >= 0) {
                System.out.println("\nlength: " + length);
                for(int index = 0; index < length; index++) {
                    System.out.println(buff[index]);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getClass().getSimpleName() + "_" + e.getMessage());
        } finally {
            try {
                if(reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println(e.getClass().getSimpleName() + "_" + e.getMessage());
            }

        }
    }


    public static void main(String[] args) {

        //Reading one byte at a time
        InputStream input = null;
        try {
            int intVal;
            while ((intVal = input.read()) >= 0) {
                byte byteVal = (byte) intVal;
            }
        } catch(IOException e) {
            System.out.println("IOException: " + e.getMessage());
        } catch(Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

        //Reading one character at a time
        try {
            int intVal;
            while ((intVal = input.read()) >= 0) {
                char charVal = (char) intVal;
            }
        } catch(IOException e) {
            System.out.println("IOException: " + e.getMessage());
        } catch(Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

        //Reading array of bytes
        try {
            int length;
            byte[] byteBuff = new byte[10];
            while((length = input.read(byteBuff)) >= 0) {
                for (int i = 0; i < length; i++) {
                    byte byteVal = byteBuff[i];
                }
            }
        } catch(IOException e) {
            System.out.println("IOException: " + e.getMessage());
        } catch(Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

        //Reading array of characters
        Reader reader = null;
        try {
            int length;
            char[] charBuff = new char[10];
            while((length = reader.read(charBuff)) >= 0) {
                for (int i = 0; i < length; i++) {
                    char charVal = charBuff[i];
                }
            }
        } catch(IOException e) {
            System.out.println("IOException: " + e.getMessage());
        } catch(Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

        //Writing Bytes
        OutputStream output = null;
        try {
            byte byteVal = 100;
            output.write(byteVal);

            byte[] byteBuff = {0, 63, 127};
            output.write(byteBuff);

        } catch(IOException e) {
            System.out.println("IOException: " + e.getMessage());
        } catch(Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

        //Writing characters
        Writer writer = null;
        try {
            char charVal = 'a';
            writer.write(charVal);

            char[] charBuff = {'a', 'b', 'c'};
            writer.write(charBuff);

            String stringVal = "Hello World";
            writer.write(stringVal);

        } catch(IOException e) {
            System.out.println("IOException: " + e.getMessage());
        } catch(Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

//        //Exception handling and closing
//        //Reader reader
//        try {
//            reader = null;
//            reader.read();
//        } catch (IOException e) {
//            System.out.println("IOException: " + e.getMessage());
//        } catch(Exception e) {
//            System.out.println("Exception: " + e.getMessage());
//        } finally {
//            try {
//                if(reader != null) {
//                    reader.close();
//                }
//            } catch(IOException e) {
//                System.out.println("2nd IOException: " + e.getMessage());
//            }
//
//        }

        doTryCatchFinally();


    }

}
