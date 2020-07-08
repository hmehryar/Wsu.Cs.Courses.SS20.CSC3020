package lecture18.go1277;

import java.io.*;

public class Lecture18Source {
    public static void main(String[] args) {
        System.out.println("\n---------------------");
            doTryCatchFinally();
        System.out.println("\n---------------------");
            doTryCatchSources();
        System.out.println("\n---------------------");
            doTryWithMultiResources();
        System.out.println("\n---------------------");
            doClosingThing();
        System.out.println("\n---------------------");
            doBufferedStreaming();
        System.out.println("\n---------------------");
            String[] data = {
                    "Line 1",
                    "Line 2 2",
                    "Line 3 3 3",
                    "Line 4 4 4 4",
                    "Line 5 5 5 5 5",};
            doBufferedWriting(data);
        System.out.println("\n---------------------");
            try {
                doBufferedReadlingLine();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        System.out.println("\n---------------------");
    }

    public static void doTryCatchFinally() {
        char[] buff = new char[8];
        int length;
        Reader reader = null;

        try {
            reader = Helper.openReader("file1.txt");
            while ((length = reader.read(buff)) >= 0) {
                System.out.println("\nlength: " + length);
                for (int i = 0; i < length; i++) {
                    System.out.print(buff[i]);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getClass().getSimpleName() + " _ " + e.getMessage());
        } finally {
            try {
                if (reader != null)
                    reader.close();
            } catch (IOException e) {
                System.out.println(e.getClass().getSimpleName() + " _ " + e.getMessage());
            }
        }
    }

    public static void doTryCatchSources() {
        char[] buff = new char[8];
        int length;

        try (Reader reader = Helper.openReader("file1.txt")) {

            while ((length = reader.read(buff)) >= 0) {
                System.out.println("\nlength: " + length);
                for (int i = 0; i < length; i++) {
                    System.out.print(buff[i]);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getClass().getSimpleName() + " _ " + e.getMessage());
        }
    }

    public static void doTryWithMultiResources() {
        char[] buff = new char[8];
        int length;
        try (Reader reader = Helper.openReader("file1.txt");
             Writer writer = Helper.openWriter("file2.txt")) {
            while ((length = reader.read(buff)) >= 0) {
                System.out.println("\nlength: " + length);
                for (int i = 0; i < length; i++) {
                    System.out.print(buff[i]);
                }
                writer.write(buff, 0, length);
            }
        } catch (IOException e) {
            System.out.println(e.getClass().getSimpleName() + " _ " + e.getMessage());
        }
    }

    public static void doClosingThing() {
        try (MyAutoClosable myAutoClosable = new MyAutoClosable()) {
            throw new Exception("La di da.");
            //myAutoClosable.saySomething();
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName() + " _ " + e.getMessage());
            for (Throwable throwable : e.getSuppressed()) {
                System.out.println("Suppressed: " + throwable.getClass().getSimpleName() + " _ " + throwable.getMessage());
            }
        }
    }

    public static void doBufferedStreaming() {
        try (BufferedReader oBufferedReader = new BufferedReader(new FileReader("file1.txt"))) {
            int intVal;
            while ((intVal = oBufferedReader.read()) >= 0) {
                char charVal = (char) intVal;
                System.out.print(charVal);
            }
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    public static void doBufferedWriting(String[] data){
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("data.txt"))) {
            for (String stringItem: data) {
                bufferedWriter.write(stringItem);
                bufferedWriter.newLine();
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    public static void doBufferedReadlingLine() throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("data.txt"))) {
            String strValue;
            while ((strValue = bufferedReader.readLine()) != null) {
                System.out.println(strValue);
            }
        }
    }
}
