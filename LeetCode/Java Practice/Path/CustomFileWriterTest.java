package Path;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;

import static org.junit.jupiter.api.Assertions.*;

class CustomFileWriterTest {
    @Test
            void testCanWriteToJsonFile(){
        String json = """
            {
            "name":"fathia",
            "age":23,
            "country": "Greece"
    }""";
        try {
            CustomFileWriter.writeJsonToFile(CustomFileWriter.getJsonFilePath(), json);
            String dataFromFile = Files.readString(CustomFileWriter.getJsonFilePath());
            assertEquals(json, dataFromFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


    @Test
    void testCanWriteToYamlFile() {
        CustomFileWriter customFileWriter = new CustomFileWriter();
        String yaml = """
                name : "Fathia",
                age : 23,
                country : "Somalia"
                """;

        try {
            CustomFileWriter.writeYamlToFile(CustomFileWriter.getYaml(), yaml);
            String dataFromFile = Files.readString(CustomFileWriter.getYaml());
            assertEquals(yaml, dataFromFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        }




    @Test
    void testCanDeleteFromJsonFile() throws IOException {
        CustomFileWriter customFileWriter = new CustomFileWriter();
        customFileWriter.createPath();
        assertTrue(Files.exists(customFileWriter.getPath()));
        CustomFileWriter.deleteFromFile(customFileWriter.getPath());
        assertFalse(Files.exists(customFileWriter.getPath()));
    }

    }