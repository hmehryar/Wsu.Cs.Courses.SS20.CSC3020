package csc3020.lecture22.av7071;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.function.DoubleToIntFunction;

public class lecture22source {
    public static void main(String[] args) {

//        if (args.length < 1){
//            System.out.println("No arguments provided");
//        }else{
//            for (String word: args) {
//                System.out.println(word);
//            }
//        }

        if(args.length == 0){
            showUsage();
            return;
        }
        String fileName = args[0];
        if(!Files.exists(Paths.get(fileName))){
            System.out.println("\n File Not Found: " + fileName);
            return;
        }
        showFileLines(fileName);

    }

    private static void showFileLines(String fileName) {
        System.out.println("In method");
        try(BufferedReader bufferedReader = Files.newBufferedReader(Paths.get(fileName))){
            String lines;
            while((lines= bufferedReader.readLine())!=null){
                System.out.println(lines);
            }
        }catch (IOException ioException){
            System.out.println(ioException.getClass().getSimpleName() + "-" + ioException.getMessage());
        }
    }

    private static void showUsage(){
        System.out.println("Welcome to lecture 22");
        System.out.println("This code can read a file stream");
        System.out.println("args: fileName.txt");
    }
}
