package com.csc3020.lecture18.gi3399;

import java.io.*;

//Author: George Esho
public class Lecture18Source {
    public static void main(String[] args) {
        doTryCatchFinally();
        System.out.println("---------------------");
        doTryWithResources();
        System.out.println("---------------------");
        doTryWithMultiResouces();
        System.out.println("---------------------");
        doClosingThing();
        System.out.println("---------------------");
        doBufferedReading();
        System.out.println("---------------------");
        System.out.println("doBufferedWriting");
        String[] data = {
                "Line 1",
                "Line 2 2",
                "Line 3 3 3",
                "Line 4 4 4 4",
                "Line 5 5 5 5 5"};
        try {
            doBufferedWriting(data);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        try {
            doBufferedReadingLineByLine();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    public static void doTryCatchFinally() {
        char[] buff = new char[8];
        int length;
        Reader reader = null;
        try {
            reader = Helper.openReader("C:\\file1.txt");
            while ((length = reader.read(buff)) >= 0) {
                System.out.println("\nlength: " + length);
                for (int index = 0; index < length; index++) {
                    System.out.print(buff[index]);
                }
            }
            System.out.println();
        } catch (IOException exception) {
            System.out.println(exception.getClass().getSimpleName() + " _ " + exception.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException exception) {
                System.out.println(exception.getClass().getSimpleName() + " _ " + exception.getMessage());
            }
        }
    }

    public static void doTryWithResources() {
        char[] buff = new char[8];
        int length;
        try (Reader reader = Helper.openReader("C:\\file1.txt")) {
            while ((length = reader.read(buff)) >= 0) {
                System.out.println("\nlength: " + length);
                for (int index = 0; index < length; index++) {
                    System.out.print(buff[index]);
                }
            }
            System.out.println();
        } catch (IOException exception) {
            System.out.println(exception.getClass().getSimpleName() + " _ " + exception.getMessage());
        }
    }

    public static void doTryWithMultiResouces() {
        char[] buff = new char[8];
        int length;
        try (Reader reader = Helper.openReader("C:\\file1.txt");
             Writer writer = Helper.openWriter("file2.txt")) {
            while ((length = reader.read(buff)) >= 0) {
                System.out.println("\nlength: " + length);
                for (int index = 0; index < length; index++) {
                    System.out.print(buff[index]);
                    writer.write(buff, 0, length);
                }
            }
            System.out.println();
        } catch (IOException exception) {
            System.out.println(exception.getClass().getSimpleName() + " _ " + exception.getMessage());
        }
    }

    public static void doClosingThing() {
        try (MyAutoClosable oMyAutoClosable = new MyAutoClosable()) {
//            throw new Exception("New Exception");
            oMyAutoClosable.saySomething();
        } catch (Exception exception) {
            System.out.println(exception.getClass().getSimpleName() + " _ " + exception.getMessage());
            for (Throwable throwable : exception.getSuppressed()) {
                System.out.println("Suppressed: " + throwable.getMessage());
            }
        }
    }

    public static void doBufferedReading() {
        try (BufferedReader oBufferedReader = new BufferedReader(new FileReader("C:\\file1.txt"))) {
            int intVal;
            while ((intVal = oBufferedReader.read()) >= 0) {
                char charVal = (char) intVal;
                System.out.print(charVal);
            }
            System.out.println();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    public static void doBufferedWriting(String[] data) throws IOException {
        try (BufferedWriter oBufferedWriter = new BufferedWriter(new FileWriter("data.txt"))) {
            for (String stringItem : data) {
                oBufferedWriter.write(stringItem);
                oBufferedWriter.newLine();
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    public static void doBufferedReadingLineByLine() throws IOException {
        try (BufferedReader oBufferedReader = new BufferedReader(new FileReader("data.txt"))) {
            String strval;
            while ((strval = oBufferedReader.readLine()) != null) {
                System.out.println(strval);
            }
        }
    }
}
