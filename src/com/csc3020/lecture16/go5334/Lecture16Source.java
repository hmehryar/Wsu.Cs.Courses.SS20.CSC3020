package com.csc3020.lecture16.go5334;

import java.io.*;

public class Lecture16Source {
    public static void main(String[] args)  {
        doTryCatchFinally();
    }
    public static void doTryCatchFinally(){
        char[] buff=new char[8];
        int length;
        Reader reader=null;
        try{
            reader=helper.openReader("file1.txt");
            while ((length= reader.read(buff))>=0){
                System.out.println("\nlength: "+length);
                for (int index = 0; index <length ; index++) {
                    System.out.print(buff[index]);
                }
            }
        }catch (IOException exception){
            System.out.println(exception.getClass().getSimpleName()+" _ "+exception.getMessage());
        }finally {
            try{
                if(reader!=null)
                    reader.close();
            }catch (IOException exception){
                System.out.println(exception.getClass().getSimpleName()+" _ "+exception.getMessage());
            }
        }
    }
}