package csc3020.lecture18.gn2289;

import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.rmi.server.ExportException;
import java.security.spec.ECField;

public class Lecture18Source {
    public static void main(String[] args) throws IOException {
        doTryCatchFinally();
        System.out.println("-----------------");
        doTryWithResources();
        System.out.println("-----------------");
        doTryWithMultiResources();
        System.out.println("-----------------");
        doClosingThing();
        System.out.println("-----------------");
        doBufferedReading();
        System.out.println("-----------------");
        String[] data = {
                "Line 1",
                "Line 2 2",
                "Line 3 3 3",
                "Line 4 4 4 4"
        };
        doBufferedWriting(data);
        System.out.println("-----------------");
        doBufferedReadingLineByLine();
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


    public static void doTryWithResources() {

            char[] buff = new char[8];
            int length;
            //Reader reader = null;
            try (Reader reader = Helper.openReader("file1.txt")){
                while ((length = reader.read(buff)) >= 0){
                    System.out.println("\nlength: "+length);
                    for (int index = 0; index < length; index++) {
                        System.out.print(buff[index]);
                    }
                }
            }catch (IOException exception){
                System.out.println(exception.getClass().getSimpleName()+"   "+exception.getMessage());
            }
    }

    public static void doTryWithMultiResources() {
        char[] buff = new char[8];
        int length;
        try(Reader reader =  Helper.openReader("file1.txt");
        Writer writer = Helper.openWriter("file2.txt")) {

            while ((length = reader.read(buff)) >= 0) {
                System.out.println("\nlength: "+length);
                for (int i = 0; i < length; i++) {
                    System.out.print(buff[i]);
                }
                writer.write(buff, 0, length);
            }
        }catch (IOException ioException) {
            System.out.println(ioException.getClass().getSimpleName()+" _ "+ioException.getMessage());
        }
    }

    public static void doClosingThing() {
        try(MyAutoClosable oMyAutoClosable = new MyAutoClosable()) {
            //throw new Exception("new exception");
           oMyAutoClosable.saySomething();

        }catch (Exception exception) {
            System.out.println(exception.getClass().getSimpleName()+" - "+exception.getMessage());
            for (Throwable throwable : exception.getSuppressed()) {
                System.out.println("Suppressed: "+ throwable.getMessage());
            }
        }
    }

    public static void doBufferedReading() throws FileNotFoundException {
        try(BufferedReader oBufferedReader = new BufferedReader(new FileReader("file1.txt"))) {
            int intVal;
            while ((intVal = oBufferedReader.read()) >= 0) {
                char charVal = (char) intVal;
                System.out.println(charVal);
            }

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    public static void doBufferedWriting(String[] data) throws IOException {
        try(BufferedWriter oBufferedWriter = new BufferedWriter(new FileWriter("data.txt"))) {
            for (String stringItem :data) {
                oBufferedWriter.write(stringItem);
            }
        }

    }

    public static void doBufferedReadingLineByLine() throws IOException {
        try(BufferedReader oBufferedReader = new BufferedReader(new FileReader("data.txt"))) {
            String strVal;
            while((strVal = oBufferedReader.readLine())!= null) {
                System.out.println(strVal);
            }
        }
    }
}
