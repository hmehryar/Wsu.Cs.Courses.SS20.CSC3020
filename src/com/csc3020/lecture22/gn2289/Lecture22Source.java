package csc3020.lecture22.gn2289;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Lecture22Source {
    public static void main(String[] args) {
//        if(args.length < 1) {
//            System.out.println("No arguments");
//        }else{
//            for (String word:args) {
//                System.out.println(word);
//            }
//        }

        if(args.length == 0) {
            showUsage();
            return;
        }
        String fileName = args[0];
        if (Files.exists(Paths.get(fileName))) {
            System.out.println("\n File not found: "+fileName);
        }
        showFileLines(fileName);
    }

    public static void showUsage() {
        System.out.println("Lecture 22");
        System.out.println("this code can read filestream");
    }

    public static void showFileLines(String fileName) {
        System.out.println("in method");
        try(BufferedReader oBufferedReader = Files.newBufferedReader(Paths.get(fileName))) {
            String line = null;
            while((line = oBufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        }catch (Exception e) {
            System.out.println(e.getClass().getSimpleName()+" : "+e.getMessage());
        }
    }
}
