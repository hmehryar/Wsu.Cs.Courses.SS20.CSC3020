package lecture19.gg6997;

import java.io.BufferedReader;
import java.io.BufferedWriter;
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
            readData();
            System.out.println("----------------------");
            readThemAll();
        } catch (Exception exception) {
            System.out.println(exception.getClass().getSimpleName() + " - " + exception.getMessage());
        }

//        try {
//            FileSystem zipFs = openZip(Paths.get("myData.zip"));
//        } catch (IOException ioException) {
//            ioException.printStackTrace();
//        } catch (URISyntaxException e) {
//            e.printStackTrace();
//        }

        String[] data = {
                "Line 1",
                "Line 2 2",
                "Line 3 3 3",
                "Line 4 4 4 4",
                "Line 5 5 5 5 5",

        };

        try (FileSystem zipFs = openZip(Paths.get("myData.zip"))) {
            System.out.println("Before Copying");
            copyToZip(zipFs);
            System.out.println("After Copying");
            System.out.println("Before Writing V1");
            writeToFileInZipV1(zipFs, data);
            System.out.println("After Writing V1");
            System.out.println("Before Writing V2");
            writeToFileInZipV2(zipFs, data);
            System.out.println("After Writing V2");

        } catch (Exception exception) {
            System.out.println(exception.getClass().getSimpleName() + " - " + exception.getMessage());
        }
    }

    private static void readData() throws IOException, SecurityException {
        try (BufferedReader oBufferedReader = Files.newBufferedReader(Paths.get("C:\\data.txt"))) {
            String inputValue;
//            List<String> lines = new ArrayList<>();
            while ((inputValue = oBufferedReader.readLine()) != null) {
                System.out.println(inputValue);
//                lines.add(inputValue);
            }
//            return lines;
        }
    }

    private static void readThemAll() throws IOException, SecurityException {
        List<String> lines = Files.readAllLines(Paths.get("C:\\data.txt"));
        for (String line : lines) {
            System.out.println(line);
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
        Path sourceFile = Paths.get("C:\\file1.txt");
//        Path sourceFile = FileSystems.getDefault().getPath("file1.txt");
        Path destinationFile = zipFs.getPath("/file1Copied.txt");
        Files.copy(sourceFile, destinationFile, StandardCopyOption.REPLACE_EXISTING);
    }

    private static void writeToFileInZipV1(FileSystem zipFs, String[] data) throws IOException {
        try (BufferedWriter oBufferedWriter = Files.newBufferedWriter(zipFs.getPath("/newFile1.txt"))) {
            for (String dataItem : data) {
                oBufferedWriter.write(dataItem);
                oBufferedWriter.newLine();
            }
        }
    }

    private static void writeToFileInZipV2(FileSystem zipFs, String[] data) throws IOException {
        Files.write(zipFs.getPath("/newFile2.txt"), Arrays.asList(data), Charset.defaultCharset(), StandardOpenOption.CREATE);
    }
}
