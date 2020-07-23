package csc3020.lecture16.gg6997;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Helper {
    static FileReader openReader(String filePath) throws FileNotFoundException {
        return  new FileReader(filePath);
    }
}
