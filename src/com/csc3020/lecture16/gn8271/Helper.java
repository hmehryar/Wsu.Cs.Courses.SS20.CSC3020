package lecture16.gn8271;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Helper {
    static FileReader openReader(String filePath) throws FileNotFoundException {
        return  new FileReader(filePath);
    }
}
