package coba.ken.minimeme.dictionary;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class SimpleFileDictionary implements Dictionary<List<String>> {

    @Override
    public List<String> create() {
        Path path = Paths.get("src/main/resources/dics/random.txt");
        try {
            return Files.readAllLines(path, StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean save() {
        return false;
    }
}
