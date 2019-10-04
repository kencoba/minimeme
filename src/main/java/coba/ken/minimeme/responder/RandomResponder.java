package coba.ken.minimeme.responder;

import coba.ken.minimeme.dictionary.Dictionary;
import coba.ken.minimeme.dictionary.SimpleFileDictionary;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

public class RandomResponder extends Responder {
    private List<String> answers;
    private Random rand = new Random();

    public RandomResponder(String name) {
        super(name);
        answers = createAnswers();
    }

    @Override
    public String response(String input) {
        return answers.get(rand.nextInt(answers.size()));
    }

    private List<String> createAnswers() {
        Dictionary<List<String>> dict = new SimpleFileDictionary();
        return dict.create();
    }
}
