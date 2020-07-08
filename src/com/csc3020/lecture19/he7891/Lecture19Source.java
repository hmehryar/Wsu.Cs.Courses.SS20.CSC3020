package com.csc3020.lecture19.he7891;
/*
 * Author: Nathan Tattrie
 * Student ID: he7891
 * Lecture 19: Input and Output with Streams and Files Continued Pt. 2
 * */

/* Accessing Files with the java.nio.file Package
* ~ java.nio.file preferred package for files
* ~~ java.io FileXXX streams are depreciated
* ~ Provides a number of benefits over java.io
* ~~ Better exception reporting
* ~~ Greater scalability
* ~~ More file system feature support
* ~~ Simplifies common tasks
* */

/* Files Type
* ~ Files
* ~~ Static methods for interacting with files
* ~~ Create, copy, delete, etc.
* ~~ Open file streams
* ~~~ newBufferedReader
* ~~~ newBufferedWriter
* ~~~ newOutputStream
* ~~ Read/write file contents
* ~~~ readAllLines
* ~~~ Write
* */

/* File Systems
* ~ Files are contained within a file system
* ~~ Has a default file system
* ~~ Specialized file systems are supported
* ~~~ Example: Zip File system
* ~~ Path instances are tied to a file system
* ~~~ Paths class works only for default
* */

/* File System Types
* ~ FileSystem
* ~~ Represents an individual file system
* ~~ Factory for Path instances
* ~ FileSystems
* ~~ Static FileSystem factory methods
* ~~ Open or create af ile system
* ~~~ newFileSystem
 */

/* Accessing File Systems
* ~ File systems identified by URI's
* ~~ Specifies of URI vary greatly
* ~~ Zip file system uses "jar:file" scheme
* ~~~ jar:file:/......
* ~ Files systems support customer properties
* ~~ Different for each file system type
* ~~ Examples
* ~~~ Whether to create if doesn't exist
* ~~~ String encoding
* */



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.*;

public class Lecture19Source {

    public static void main(String[] args) {
        try {
            readData();
            System.out.println("---------------------------");
            readThemAll();
        }
        catch (IOException ioException) {
            ioException.printStackTrace();
        }
        catch (SecurityException securityException) {
            securityException.printStackTrace();
        }

//        try {
//            FileSystem zipFs = openZip(Paths.get("myData.zip"));
//        }
//        catch (Exception e) {
//            System.out.println(e.getClass().getSimpleName() + " _ " + e.getMessage());
//        }

        String[] data = {
                "Line 1",
                "Line 2 2",
                "Line 3 3 3",
                "Line 4 4 4 4",
                "Line 5 5 5 5 5"
        };

        try (FileSystem zipFs = openZip(Paths.get("myData.zip"))) {
            System.out.println("Before copying");
            copyToZip(zipFs);
            System.out.println("After copying");

            System.out.println("Before writing V1");
            writeToFileInZipV1(zipFs, data);
            System.out.println("After writing V1");

            System.out.println("Before writing V2");
            writeToFileInZipV2(zipFs, data);
            System.out.println("After writing V2");

        }
        catch (Exception e) {
            System.out.println(e.getClass().getSimpleName() + " _ " + e.getMessage());
        }

    }

    private static FileSystem openZip(Path zipPath) throws IOException, URISyntaxException {
        Map<String, String> providerProps = new HashMap<>();
        providerProps.put("create", "true");
        URI zipUri = new URI("jar:file", zipPath.toUri().getPath(), null);
        FileSystem zipFs = FileSystems.newFileSystem(zipUri, providerProps);
        return zipFs;
    }
    private static void copyToZip(FileSystem zipFs) throws IOException {
        Path sourceFile = Paths.get("file1.txt");
        //Path sourceFile = FileSystems.getDefault().getPath("file1.txt");
        Path destinationFile = zipFs.getPath("/file1Copied.txt");
        Files.copy(sourceFile, destinationFile, StandardCopyOption.REPLACE_EXISTING);
    }
    private static List<String> readData() throws IOException, SecurityException {
        try (BufferedReader oBufferedReader = Files.newBufferedReader(Paths.get("data.txt"))) {
            String inputValue;
            List<String> lines = new ArrayList<>();

            while ((inputValue = oBufferedReader.readLine()) != null) {
                System.out.println(inputValue);
            }

            return lines;
        }
    }
    private static void readThemAll() throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("data.txt"));
        for (String line : lines) {
            System.out.println(line);
        }
    }
    private static void writeToFileInZipV1(FileSystem zipFs, String[] data) throws IOException {
        try(BufferedWriter oBufferedWriter = Files.newBufferedWriter(zipFs.getPath("/newFile1.txt"))) {
            for (String dataItem : data) {
                oBufferedWriter.write(dataItem);
                oBufferedWriter.newLine();
            }
        }
    }
    private static void writeToFileInZipV2(FileSystem zipFs, String[] data) throws IOException {
        Files.write(zipFs.getPath("/newFile2.txt"), Arrays.asList(data),
                Charset.defaultCharset(), StandardOpenOption.CREATE);
    }



}
