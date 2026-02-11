package Path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CustomFileWriter {
     private Path path;

    public  void createPath(){
        String fileLocation = "/home/fathia-oyinloye/Documents/Git Repositories/Practice/LeetCode/Java Practice/Path";
        String fileName = "user.json";
        Path newPath = Path.of(fileLocation, fileName);
        try{
            Files.createFile(newPath);
        }catch (IOException exception){
            exception.printStackTrace();
        }
            this.path = newPath;
    }
    public  Path getPath(){
        return path;
    }

    public static Path getJsonFilePath(){
        String fileLocation = "/home/fathia-oyinloye/Documents/Git Repositories/Practice/LeetCode/Java Practice/Path";
        String fileName = "user.json";
        Path newPath = Path.of(fileLocation, fileName);
        try{
            Files.
                    createFile(newPath);
        }catch (IOException exception){
            exception.printStackTrace();
        }
        return newPath;
    }



    public static Path getYaml(){
        String fileLocation = "/home/fathia-oyinloye/Documents/Git Repositories/Practice/LeetCode/Java Practice/Path";
        String fileName = "fathia.yaml";
        Path path = Path.of(fileLocation,fileName);
        try{
            Files.createFile(path);
        }catch (IOException exception){
            exception.printStackTrace();
        }
        return path;
    }

    public static void writeJsonToFile(Path path, String json) throws IOException {
        Files.writeString(path,json);
    }

    public static String readFromFile(Path path) throws IOException {
        return Files.readString(path);
    }

    public static void writeYamlToFile(Path path, String yaml) throws IOException {
        Files.writeString(path,yaml);
    }

    public static void deleteFromFile(Path pathLocation) throws IOException {

        Files.deleteIfExists(pathLocation);
    }
}
