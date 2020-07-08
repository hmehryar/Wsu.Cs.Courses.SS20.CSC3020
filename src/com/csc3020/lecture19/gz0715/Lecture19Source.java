package csc3020.lecture19.gz0715;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lecture19Source {
    public static void main(String[] args) {
        try {
            System.out.println("----------------------------------");
            readData();
            System.out.println("----------------------------------");
            readThemAll();
            System.out.println("----------------------------------");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SecurityException se) {
            se.printStackTrace();
        }

        String[] data = {
                "Line 1",
                "Line 2 2",
                "Line 3 3 3",
                "Line 4 4 4 4",
                "Line 5 5 5 5 5"
        };

//        try {
//            FileSystem zipFs = openZip(Paths.get("E:\\CSC3020SS20\\src\\com\\csc3020\\lecture19\\gz0715\\myData.zip"));
//        } catch (Exception e) {
//            System.out.println(e.getClass().getSimpleName() + " - " + e.getMessage());
//        }

        try (FileSystem zipFs = openZip(Paths.get("E:\\CSC3020SS20\\src\\com\\csc3020\\lecture19\\gz0715\\myData.zip"))) {
            System.out.println("Before Copying");
            copyToZip(zipFs);
            System.out.println("After Copying");
            System.out.println("Before Writing v1");
            writeToFileInZipV1(zipFs, data);
            System.out.println("After Writing v1");
            System.out.println("Before Writing v2");
            writeToFileInZipV2(zipFs, data);
            System.out.println("After Writing v2");
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName() + " - " + e.getMessage());
        }



    }

    private static FileSystem openZip(Path zipPath) throws IOException, URISyntaxException {
        Map<String, String> providerProps = new HashMap<>();
        providerProps.put("create", "true");
        URI zipUri = new URI("jar:file", zipPath.toUri().getPath(), null);
        FileSystem zipFs = FileSystems.newFileSystem(zipUri, providerProps);

        return zipFs;
    }

    public static void copyToZip(FileSystem zipFs) throws IOException {
        Path sourceFile = Paths.get("E:\\CSC3020SS20\\src\\com\\csc3020\\lecture19\\gz0715\\file1.txt");
        Path destinationFile = zipFs.getPath("/file1Copies.txt");
        Files.copy(sourceFile, destinationFile, StandardCopyOption.REPLACE_EXISTING);
    }

    public static void readData() throws IOException {
        try (BufferedReader oBufferedReader = Files.newBufferedReader(Paths.get("E:\\CSC3020SS20\\src\\com\\csc3020\\lecture19\\gz0715\\data.txt"))) {
            String inputValue;
//            List<String> lines = new ArrayList<>();

            while ( (inputValue = oBufferedReader.readLine()) != null) {
                System.out.println(inputValue);
//                lines.add(inputValue);
            }
//            return lines;
        }
    }

    public static void readThemAll() throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("E:\\CSC3020SS20\\src\\com\\csc3020\\lecture19\\gz0715\\data.txt"));
        for (String line : lines) {
            System.out.println(line);
        }
    }

    public static void writeToFileInZipV1(FileSystem zipFs, String[] data) throws IOException {
        try (BufferedWriter oBufferedWriter = Files.newBufferedWriter(zipFs.getPath("/newFile1.txt"))) {
            for (String dataItem : data) {
                oBufferedWriter.write(dataItem);
                oBufferedWriter.newLine();
            }
        }
    }

    public static void writeToFileInZipV2(FileSystem zipFs, String[] data) throws IOException {
        Files.write(
                zipFs.getPath("/newFile2.txt"),
                Arrays.asList(data),
                Charset.defaultCharset(),
                StandardOpenOption.CREATE
        );
    }
}
