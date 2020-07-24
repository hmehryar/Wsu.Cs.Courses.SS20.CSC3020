package csc3020.lecture22.gg6997;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Lecture22Source {

    public static void main(String[] args) {

        // run -> Edit configurations -> Program Arguments -> *enter arguments*
        // Open command window:
        //  $csc3020\lecture22\>ls
        //  $csc3020\lecture22\>dir
        //  $csc3020\lecture22\>cd gg6997
        //  $csc3020\lecture22\gg6997\> java com.csc3020.lecture22.gg6997.Lecture22Source.class
        //  $csc3020\lecture22\gg6997\>
//        if (args.length < 1) {
//            System.out.println("No arguments provided.");
//        }
//        else {
//            for (String word : args) {
//                System.out.println(word);
//            }
//        }

        if (args.length == 0) {
            showUsage();
            return;
        }
        String fileName = args[0];
        if (!Files.exists(Paths.get(fileName))) {
            System.out.println("\n File not Fount: " + fileName);
        }
        showFileLines(fileName);
    }

    private static void showFileLines(String filename) {
        System.out.println();
        try (BufferedReader oBufferedReader = Files.newBufferedReader((Paths.get(filename)))) {
            String line = null;
            while ((line = oBufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch (Exception oException) {
            System.out.println(oException.getClass().getSimpleName() + " : " + oException.getMessage());
        }
    }

    private static void showUsage() {
        System.out.println("Welcome to lecture 22!");
        System.out.println("This code can read a file stream.");
        System.out.println("arg: filename.txt");
    }

}
