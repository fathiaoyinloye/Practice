package Path.stream.Serialization;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class PostSerializerAndDeserializer {
    public static void serialize(Post post){
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(System.out)){
            objectOutputStream.writeObject(post);
        }catch (IOException exception){
            exception.printStackTrace();
        }

    }

    public static void serialize(Post post, Path path){
        try(OutputStream outputStream = Files.newOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream)){
            objectOutputStream.writeObject(post);
        }catch (IOException exception){
            exception.printStackTrace();
        }

    }


    public static Post deserialize(Path path){
        try(InputStream inputStream = Files.newInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream)){
            Object object = objectInputStream.readObject();
            return (Post) object;

        }catch(IOException | ClassNotFoundException exception){
            exception.printStackTrace();
        }
        return  null;
    }


}
