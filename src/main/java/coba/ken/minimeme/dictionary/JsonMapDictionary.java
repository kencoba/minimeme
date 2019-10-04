package coba.ken.minimeme.dictionary;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class JsonMapDictionary implements Dictionary<Map<String,String>> {
    @Override
    public Map<String,String> create() {
        Path path = Paths.get("src/main/resources/dics/pattern.txt");
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(path.toFile(),Map.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean save() {
        return false;
    }
}
