package Path.stream.input;

import java.awt.im.InputContext;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;

public class CloudDataReader {
    public static void main(String... args) {

        final String file ="/home/fathia-oyinloye/Documents/Git Repositories/Practice/LeetCode/Java Practice/Path/stream/output/posts.json";
        String url = "https://jsonplaceholder.typicode.com/posts";
        String data = readDataFrom(url);

        try( FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write(data);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static String readDataFrom(String cloudLocation) {
        URI uri = URI.create(cloudLocation);
        try (InputStream inputStream = uri.toURL().openStream()) {
            byte[] data = inputStream.readAllBytes();
            return new String(data);

        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return "";
    }
}


