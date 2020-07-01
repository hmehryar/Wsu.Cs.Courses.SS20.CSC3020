package csc3020.lecture16.hc7391;

import java.io.IOException;
import java.io.Reader;

public class Lecture16Source {
    //Reading one byte using input stream
    public static void main(String[] args) {
//        InputStream input = null;
//       try {
//
//           int intVal;
//
//           while ((intVal = input.read()) >= 0) {
//               byte byteValue = (byte) intVal;
//               //Do something with byte value
//           }
//       } catch(IOException ioException){
//           System.out.println("IO Exception: Not Implemented");
//       }
//    // Use reader to read characters from source
//   Reader reader = null;
//     try {
//         int intVal;
//         while((intVal=reader.read())>=0){
//             char charVal =(char) intVal;
//             //do something to charVal
//     }
//
//     }catch(IOException ioException){
//         System.out.println("IO Exception: Not Implemented");
//     }
//
//     //Reading an array of Bytes
//     //InputStream input
//
//     try{
//         int length;
//         byte[]  byteBuff= new byte[10];
//         while((length = input.read(byteBuff))>=0){
//             for (int i = 0; i < length ; i++) {
//               byte byteVal = byteBuff[i];
//               //do something
//             }
//         }
//     }catch(IOException ioException){
//         System.out.println("IO Exception: Not Implemented");
//     }
//
//     //Reading character array
//     //InputStream input
//     //Reader reader = null;
//     try{
//        int length;
//        char[] charBuff = new char[10];
//        while((length = reader.read(charBuff))>= 0){
//            for (int i = 0; i < length ; i++) {
//                char charVal = charBuff[i];
//                //do something
//            }
//        }
//     }catch(IOException ioException){
//         System.out.println("IO Exception: Not Implemented");
//     }
//
//    //Writing bytes
//    OutputStream output = null;
//    try{
//        byte byteVal= 100;
//        output.write(byteVal);
//
//        byte[] byteBuff={0,63,127};
//        output.write(byteBuff);
//    }catch(IOException ioException){
//        System.out.println("IO Exception: Not Implemented");
//    }
//
//    //Writing characters
//    Writer writer = null;
//    try{
//       char charVal = 'a';
//       writer.write(charVal);
//       //array of characters
//       char[] charBuff = {'a','b','c'};
//       writer.write(charBuff);
//       //sending string value
//       String stringVal = "Hello World";
//       writer.write(stringVal);
//    }catch(IOException ioException){
//        System.out.println("IO Exception: Not Implemented");
//    }
//
//    //Exception Handling and closing
//    try{
//        reader= new FileReader("d:\\resource");
//        //do something with reader
//    }catch(IOException ioException){
//        System.out.println("IO Exception: Not Implemented");
//    }finally{
//        try {
//            reader.close();
//        }catch(IOException ioException){
//            System.out.println("IO Exception: 2nd Level Not Implemented");
//        }
//    }

    doTryCatchFinally();


    }//end static main

    public static void doTryCatchFinally(){
        char[] buff = new char[8];
        int length;
        Reader reader = null;
        try{
            reader = Helper.openReader("file1.txt");
            while((length = reader.read(buff))>=0){
                System.out.println("\nlength: "+length);
                for (int i = 0; i < length ; i++) {
                    System.out.print(buff[i]);
                }
            }
        }catch(IOException exception){
            System.out.println(exception.getClass().getSimpleName()+" " + exception.getMessage());
        }finally {
            try{
                if(reader!=null)
                reader.close();
            }catch(IOException exception){
                System.out.println(exception.getClass().getSimpleName()+" " + exception.getMessage());
            }
        }
    }
}// class main
