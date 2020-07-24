package csc3020.lecture16.ee7708;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class Helper {
    static FileReader openReader(String filePath) throws FileNotFoundException {
        return  new FileReader(filePath);
    }
}
