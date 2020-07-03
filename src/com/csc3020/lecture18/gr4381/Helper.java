package csc3020.lecture18.gr4381;
import java.io.*;

public class Helper {
    public static Reader openReader(String fileName) throws FileNotFoundException {
        return new FileReader(fileName);
    }
    public static FileWriter openWriter(String fileName) throws IOException {
        return new FileWriter(fileName);
    }
}
