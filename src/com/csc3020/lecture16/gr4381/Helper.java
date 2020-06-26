package csc3020.lecture16.gr4381;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
public class Helper {
    public static Reader openReader(String fileName) throws FileNotFoundException {
        return new FileReader(fileName);

    }
}
