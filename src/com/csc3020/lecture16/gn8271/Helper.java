package csc3020.lecture16.gn8271;
import java.io.FileNotFoundException;
import java.io.FileReader;
// *
// Author: Raisa Zaman
// Student ID: gn8271
// Lecture16
// *
public class Helper {
    public static FileReader openReader(String filePath) throws FileNotFoundException {
        return  new FileReader(filePath);
    }
}
