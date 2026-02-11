package Path.stream.input;

import java.io.DataInputStream;
import java.io.IOException;

public class CustomDataInputReader {
    public static void main(String... args){
        System.out.println("Enter Your name: ");
        try(DataInputStream dataInputStream = new DataInputStream(System.in);){
            byte[] data = dataInputStream.readNBytes(8);
            System.out.println("Name: " + new String(data));
    }catch (IOException exception){
            exception.printStackTrace();
        }

        }
}
