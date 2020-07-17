package com.csc3020.lecture22.eu6179;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class lecture22Source {
        public static void main(String[] args) {
            //fh fh19
//        if (args.length < 1) {
//            System.out.println("No arguments provided");
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
                System.out.println("\n File Not Found: " + fileName);
                return;
            }
            showFileLines(fileName);
        }

        private static void showFileLines(String fileName) {
            System.out.println();
            try (BufferedReader oBufferedReader = Files.newBufferedReader(Paths.get(fileName))) {
                String lines = null;
                while ((lines = oBufferedReader.readLine())!= null){
                    System.out.println(lines);
                }
                Files.readAllLines(Paths.get(fileName)).toArray();
            } catch (Exception oException) {
                System.out.println(oException.getClass().getSimpleName() + " : " + oException.getMessage());
            }
        }

        private static void showUsage() {
            System.out.println("Welcome to lecture 22");
            System.out.println("This code can read a file stream");
            System.out.println("arg: fileName.txt");
        }
    }
