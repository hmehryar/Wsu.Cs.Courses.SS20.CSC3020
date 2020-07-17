package csc3020.lecture22.hc7391;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Lecture22Source {
    public static void main(String[] args) {
        // write your code here
//        if(args.length < 1){
//            System.out.println("No Arguements");
//        }else{
//            for (String word: args) {
//                System.out.println(word);
//            }
//        }

        if(args.length==0){
            showUsage();
            return;
        }
        String fileName = args[0];
        if(!Files.exists(Paths.get(fileName))){
            System.out.println("\n File not Found: "+fileName);
            return;
        }
        showFileLines(fileName);
    }
    private static void showUsage(){
        System.out.println("Welcome to lecture 22");
        System.out.println("This code can read a file stream");
        System.out.println("arg: fileName.txt");
    }

    private static void showFileLines(String fileName){
        System.out.println("In Method");
        try(BufferedReader oBufferReader = Files.newBufferedReader(Paths.get(fileName))) {
            String lines = null;
            while((lines = oBufferReader.readLine())!=null)   {
                System.out.println(lines);
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
