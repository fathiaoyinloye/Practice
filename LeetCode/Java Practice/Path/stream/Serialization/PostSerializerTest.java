package Path.stream.Serialization;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class PostSerializerTest {

    @Test
    void serializeTest(){
        String content = "This is my first post";
        String id = "abcde";
        String author = "Fathia Oyinloye";
        Post post = new Post(content, id, author);
        String fileName = "post";
        PostSerializerAndDeserializer.serialize(post);
    }

    @Test
    void serializeToAFileTest(){
        String content = "This is my first post";
        String id = "abcde";
        String author = "Fathia Oyinloye";
        Post post = new Post(content, id, author);
        String fileLocation = "/home/fathia-oyinloye/Documents/git-repositories/Practice/LeetCode/Java Practice/Path/stream/Serialization/output";
        String fileName = "post";
        Path path = Path.of(fileLocation, fileName);
        PostSerializerAndDeserializer.serialize(post,path);
    }


    @Test
    void testThatCanDesSerialize() {
        String fileLocation = "/home/fathia-oyinloye/Documents/git-repositories/Practice/LeetCode/Java Practice/Path/stream/Serialization/output";
        String fileName = "post";
        Path path = Path.of(fileLocation, fileName);
        Post post = PostSerializerAndDeserializer.deserialize(path);
        assertNotNull(post);
        assertEquals("This is my first post", post.getContent());
        assertEquals("Fathia Oyinloye", post.getAuthor());




    }


}