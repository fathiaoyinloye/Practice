package Path.stream.input;

import java.io.FileInputStream;
import java.io.IOException;

public class CustomFileInputReader {
    public static void main(String... args){
        String fileLocation = "/home/fathia-oyinloye/Documents/Git Repositories/Practice/LeetCode/Java Practice/Path/user.json";

        try (FileInputStream fileInputStream = new FileInputStream(fileLocation)){
            byte[] data = fileInputStream.readAllBytes();
            System.out.println( new String(data));
        }catch(IOException exception){
                exception.printStackTrace();
            }



        }
    }


















