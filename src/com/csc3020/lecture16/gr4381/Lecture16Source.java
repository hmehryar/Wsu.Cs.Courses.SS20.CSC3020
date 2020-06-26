package csc3020.lecture16.gr4381;

import java.io.*;

public class Lecture16Source {
    public static void main(String[] args) {
        InputStream input = null;
        Reader reader = null;
/*
        // Reading one byte at a time
        try {
            int intVal;
            while ((intVal = input.read()) >= 0){
                byte byteVal = (byte) intVal;
                // do something with byteVal
            }
        } catch (IOException ioException){
            System.out.println("IOException: Not implemented exception");
        }

        // Reading one character at a time
        try {
            int intVal;
            while ((intVal = input.read()) >= 0){
                char charVal = (char) intVal;
                // do something with charVal
            }
        } catch (IOException ioException){
            System.out.println("IOException: Not implemented exception");
        }

        // Reading an array of bytes
        try {
            int length;
            byte[] byteBuff = new byte[10];
            while ((length = input.read(byteBuff)) >= 0) {
                for (int i = 0; i < length; i++) {
                    byte byteVal = byteBuff[i];
                    // do something with byteVal
                }
            }
        } catch (IOException ioException){
            System.out.println("IOException: Not implemented exception");
        }

        // Reading an array of chars
        try {
            int length;
            char[] charBuff = new char[10];
            while ((length = reader.read(charBuff)) >= 0) {
                for (int i = 0; i < length; i++) {
                    char charVal = charBuff[i];
                    // do something with charVal
                }
            }
        } catch (IOException ioException){
            System.out.println("IOException: Not implemented exception");
        }

        // Writing bytes
        OutputStream output = null;

        try {
            byte byteVal = 100;
            output.write(byteVal);

            byte[] byteBuff = {0, 63, 127};
            output.write(byteBuff);
        } catch (IOException ioException){
            System.out.println("IOException: Not implemented exception");
        }

        // Writing chars
        Writer writer = null;

        try {
            char charVal = 'a';
            writer.write(charVal);

            char[] charBuff = {'a', 'b', 'c'};
            writer.write(charBuff);

            String stringVal = "Hello World!";
            writer.write(stringVal);
        } catch (IOException ioException){
            System.out.println("IOException: Not implemented exception");
        }


        // Exception handling and closing
        try {
            reader = new FileReader("D:\\resource.txt");
            // do something with the reader

        } catch (IOException ioException){
            System.out.println("IOException: Not implemented exception");
        } finally{
            try {
                reader.close();
            } catch (IOException ioException){
                System.out.println("IOException: 2nd Level: Not implemented exception");
            }
        }
*/

        doTryCatchFinally();
    }
    public static void doTryCatchFinally(){
        char[] buff = new char[8];
        int length;
        Reader reader = null;
        try{
            reader = Helper.openReader("file1.txt");
            while ((length = reader.read(buff)) >= 0){
                System.out.println("\nlength: " + length);
                for (int index = 0; index < length; index++){
                    System.out.print(buff[index]);
                }
            }
        }catch (IOException exception){
            System.out.println(exception.getClass().getSimpleName() + " - " + exception.getMessage());
        }finally{
            try{
                if (reader != null) {
                    reader.close();
                }
            }catch(IOException exception){
                System.out.println(exception.getClass().getSimpleName() + " - " + exception.getMessage());
            }
        }
    }
}
