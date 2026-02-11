package Path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Example {
    static void main() {
        String fileLocation = "/home/fathia-oyinloye/Documents/Git Repositories/Practice/LeetCode/Java Practice/Path";
        String fileName = "user.json";
        Path path = Path.of(fileLocation, fileName);
        try{
            Files.createFile(path);
        }catch (IOException exception){
            exception.printStackTrace();
        }

    }
}
