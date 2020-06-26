package csc3020.lecture16.em0608;

import java.io.IOException;
import java.io.Reader;

public class Lecture16Source {
    public static void main(String[] args) {

//        //Reading One Byte at a time
//        InputStream input = null;
//        try{
//        int intVal = 0;
//        while((intVal = input.read())>=0) {
//            byte byteVal = (byte) intVal;
//            //To Do: do something with byteVal
//             }
//        }catch (IOException ioException){
//            System.out.println("IO Exception Error");
//        }
//
//        //Reading One Character at a time
//        try{
//            int intVal;
//            while((intVal = input.read())>=0){
//                char charVal = (char)intVal;
//                //To do: do something with charVal
//            }
//        }catch (IOException ioException){
//            System.out.println("Error: IO Exception");
//        }
//
//        //Reading Array of Bytes
//        try{
//            int length;
//            byte[] buffByte = new byte[10];
//            while((length = input.read(buffByte))>=0){
//                for (int i = 0; i <length ; i++) {
//                    byte byteVal = buffByte[i];
//                    //To do: do something with byteVal
//                }
//
//            }
//        }catch (IOException ioException){
//            System.out.println("IO Exception Error");
//        }
//
//        //Reading Array of Characters
//        Reader reader = null;
//        try{
//            int length;
//            char[] charBuff = new char[10];
//            while((length = reader.read(charBuff))>=0){
//                for (int i = 0; i < length; i++) {
//                    char charVal = charBuff[i];
//                    //To do: do something with charVal
//                }
//            }
//        }
//        catch (IOException ioException){
//            System.out.println("IO Exception");
//        }
//
//        //Writing Bytes
//        OutputStream output = null; //Create output stream
//        try{
//            byte byteVal = 100;
//            output.write(byteVal);
//            byte[] byteBuffer = {0, 63, 127};
//            output.write(byteBuffer);
//        }
//        catch (IOException ioException){
//            System.out.println("IO Exception");
//        }
//
//
//        //Writing Characters
//        Writer writer = null;
//        try{
//            char charVal ='a';
//            writer.write(charVal);
//
//            char[] charBuff = {'a', 'b', 'c'};
//            writer.write(charBuff);
//
//            String stringVal = "Hello World!";
//            writer.write(stringVal);
//
//        }
//        catch (IOException ioException){
//            System.out.println("IO Exception");
//        }
//
//        //Exception Handling and Closing
//        try{
//          reader = new FileReader("files.txt");
//          //Do something with reader
//        }
//        catch (IOException ioException){
//            System.out.println("IO Exception Error");
//        }finally {
//            try{
//                reader.close();
//            }catch (IOException ioException){
//                System.out.println("IO Exception Error");
//            }
//        }
        doTryCatchFinally();
    }

        public static void doTryCatchFinally(){
            char[] buff = new char[8];
            int length;
            Reader reader;
            reader = null;
            try{
               reader=Helper.openReader("file.txt");
                while ((length = reader.read(buff))>= 0){
                    System.out.println("\nlength: " + length);
                    for (int i = 0; i < length; i++) {
                        System.out.print(buff[i]);
                    }
                }
            }catch(IOException ioException) {
                System.out.println(ioException.getClass().getSimpleName()+ " -" + ioException.getMessage());
            }finally {
                try{
                    if(reader!=null)
                    reader.close();
                }catch (IOException ioException){
                    System.out.println(ioException.getClass().getSimpleName()+ " -" + ioException.getMessage());
                }
            }
        }

    }



