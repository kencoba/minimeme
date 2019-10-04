package coba.ken.minimeme.responder;

import coba.ken.minimeme.dictionary.Dictionary;
import coba.ken.minimeme.dictionary.JsonMapDictionary;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 */
public class PatternResponder extends Responder {
    private Map<String, String> patterns;
    private Responder defaultResponder;

    public PatternResponder(String name,Responder defaultResponder) {
        super(name);
        patterns = createPatterns();
        this.defaultResponder = defaultResponder;
    }

    @Override
    public String response(String input) {
        for (String ptn : patterns.keySet()) {
            Pattern p = Pattern.compile(ptn);
            Matcher matcher = p.matcher(input);
            if (matcher.find()) {
                String matched = matcher.group();
                return patterns.get(ptn).replaceAll("%match%", matched);
            }
        }
        return this.defaultResponder.response(input);
    }

    private Map<String, String> createPatterns() {
        Dictionary<Map<String,String>> dict = new JsonMapDictionary();
        return dict.create();
    }
}
