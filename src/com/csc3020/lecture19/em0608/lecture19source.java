package com.csc3020.lecture19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.*;

public class lecture19source {
    public static void main(String[] args) throws IOException, URISyntaxException {
        try {
            readData();
            System.out.println("----------------");
            readThemAll();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } catch (SecurityException securityException) {
            securityException.printStackTrace();
        }
//        try{
//            FileSystem zipFs = openZip(Paths.get("myData.zip"));
//        }catch (Exception e){
//            System.out.println(e.getClass().getSimpleName() + "-" + e.getMessage());
//        }

        String[] data = {
                "Line 1",
                " Line 2 2",
                " Line 3 3 3",
                " Line 4 4 4 4",
                "Line 5 5 5 5 5"
        };

        try(FileSystem zipFs = openZip(Paths.get("myData.zip"))){
            System.out.println("Before copying");
            copyToZip(zipFs);
            System.out.println("After copying");
            System.out.println("Before writing v1");
            writeToFileInZipV1(zipFs, data);
            System.out.println("After writing v!");
            System.out.println("Before writing v1");
            writeToFileInZipV2(zipFs, data);
            System.out.println("After writing v!");


        }catch (Exception e){
            System.out.println(e.getClass().getSimpleName() + "-" + e.getMessage());
        }
    }

    FileSystem zipFs;

    {
        try {
            zipFs = openZip(Paths.get("myData.zip"));
        } catch(Exception e){
            System.out.println(e.getClass().getSimpleName() + " - " + e.getMessage());
        }
    }

    //open a zip file
    private static FileSystem openZip(Path zipPath) throws IOException, URISyntaxException {
        Map<String, String> providerProps = new HashMap<>();
        providerProps.put("create", "true");
        URI zipUri = new URI("jar:file", zipPath.toUri().getPath(), null);
        FileSystem zipFs = FileSystems.newFileSystem(zipUri, providerProps);
        return zipFs;
    }

    //Put files into a Zip
    public static void copyToZip(FileSystem zipFs) throws IOException{
        Path sourceFile = Paths.get("file1.txt");
//        Path sourceFile = FileSystems.getDefault().getPath("file1.txt");
        Path destinationFile = zipFs.getPath("fileCopy.txt");
        Files.copy(sourceFile, destinationFile, StandardCopyOption.REPLACE_EXISTING);
    }





    private static void readData() throws IOException, SecurityException {
        try(BufferedReader oBufferedReader = Files.newBufferedReader(Paths.get("file1.txt"))){
            String inputValue;
//            List<String> lines = new ArrayList<>();
           while((inputValue = oBufferedReader.readLine())!= null){
               System.out.println(inputValue);
//               lines.add(inputValue);
           }
        }
//        return lines;
    }

    private static void readThemAll() throws IOException, SecurityException{
        List<String> lines = Files.readAllLines(Paths.get("file1.txt"));
        for (String line: lines){
            System.out.println(line);
        }
    }

    private static void writeToFileInZipV1(FileSystem zipFs, String[] data) throws IOException{
        try(BufferedWriter oBufferedWritier = Files.newBufferedWriter(zipFs.getPath("newFile2.txt"))){
            for (String dataItem:data) {
                oBufferedWritier.write(dataItem);
                oBufferedWritier.newLine();
            }
        }
    }

    public static void writeToFileInZipV2(FileSystem zipFs, String[] data) throws IOException{
        Files.write(zipFs.getPath("newFile3.txt"), Arrays.asList(data),
                Charset.defaultCharset(), StandardOpenOption.CREATE);
    }

}
