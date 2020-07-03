package com.csc3020.lecture18.go5621;

import java.io.*;

public class Lecture18Source {

    public static void main(String[] args) {
        doTryCatchFinally();
        System.out.println("-------------------------------");

        doTryWithResources();
        System.out.println("-------------------------------");

        doTryWithMultiResources();
        System.out.println("-------------------------------");

        doClosingThing();
        System.out.println("-------------------------------");

        doBufferedReading();
        System.out.println("-------------------------------");

        System.out.println("doBufferedWriting");
        String[] data = {
                "Line 1",
                "Line 2 2",
                "Line 3 3 3",
                "Line 4 4 4 4",
                "Line 5 5 5 5 5",
        };
        doBufferedWriting(data);
        System.out.println("-------------------------------");

        try {
            doBufferedReadingLineByLine();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public static void doTryCatchFinally() {
        char[] buff = new char[8];
        int length;
        try (Reader reader = Helper.openReader("file1.txt")) {
            while ((length = reader.read(buff)) >= 0) {
                System.out.println("\nlength: " + length);
                for (int index = 0; index < length; index++) {
                    System.out.println(buff[index]);
                }
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println(e.getClass().getSimpleName() + "_" + e.getMessage());

        }
    }

    public static void doTryWithResources() {
        char[] buff = new char[8];
        int length;
        try (Reader reader = Helper.openReader("file1.txt")) {
            while ((length = reader.read(buff)) >= 0) {
                System.out.println("\nlength: " + length);
                for (int index = 0; index < length; index++) {
                    System.out.println(buff[index]);
                }
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println(e.getClass().getSimpleName() + "_" + e.getMessage());

        }
    }

    public static void doTryWithMultiResources() {
        char[] buff = new char[8];
        int length;
        try (Reader reader = Helper.openReader("file1.txt");
            Writer writer = Helper.openWriter("file2.txt")) {
            while ((length = reader.read(buff)) >= 0) {
                System.out.println("\nlength: " + length);
                writer.write(buff, 0, length);
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println(e.getClass().getSimpleName() + "_" + e.getMessage());

        }
    }

    public static void doClosingThing() {
        try(MyAutoCloseable oMyAutoCloseable = new MyAutoCloseable()) {
            throw new Exception("new exception");
            //oMyAutoCloseable.saySomething();
        } catch(Exception e) {
            System.out.println(e.getClass().getSimpleName() + "_" + e.getMessage());
            for ( Throwable throwable: e.getSuppressed()) {
                System.out.println("Suppressed: " + throwable);
            }
        }
    }

    public static void doBufferedReading() {
        try(BufferedReader oBufferedReader = new BufferedReader(new FileReader("file.txt"))) {
            int intVal;
            while((intVal = oBufferedReader.read()) >= 0) {
                char charVal = (char) intVal;
                System.out.println(charVal);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void doBufferedWriting(String[] data){
        try (BufferedWriter oBufferedWriter = new BufferedWriter(new FileWriter("data.txt"))) {
            for (String d : data) {
                oBufferedWriter.write(d);
                oBufferedWriter.newLine();
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public static void doBufferedReadingLineByLine() throws IOException{
        try(BufferedReader oBufferedReader = new BufferedReader(new FileReader("data.txt"))) {
            String inValue;
            while((inValue = oBufferedReader.readLine()) != null) {
                System.out.println(inValue);
            }
        }
    }

}

