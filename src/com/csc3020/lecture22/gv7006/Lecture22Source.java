package com.csc3020.lecture22.gv7006;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Lecture22Source {
    public static void main(String[] args) {
//        if (args.length < 1) {
//            System.out.println("No argument provided");
//        } else {
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
            System.out.println("\nFile Not Found: " + fileName);
            return;
        }

        showFileLines(fileName);
    }

    private static void showFileLines(String fileName) {
        System.out.println("In method");
        try (BufferedReader oBufferedReader = Files.newBufferedReader(Paths.get(fileName))) {
            List<String> lines = Files.readAllLines(Paths.get(fileName));
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e.getClass().getSimpleName() + " : " + e.getMessage());
        }
    }

    private static void showUsage() {
        System.out.println("Welcome to lecture 22");
        System.out.println("This code can read a file steam");
        System.out.println("arg: fileName.txt");
    }
}

