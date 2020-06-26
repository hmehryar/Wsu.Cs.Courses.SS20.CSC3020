package lecture16.gg6997;

import java.io.IOException;
import java.io.Reader;

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
            reader = lecture16.gg6997.Helper.openReader("file1.txt");
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
