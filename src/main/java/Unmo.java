import coba.ken.minimeme.responder.PatternResponder;
import coba.ken.minimeme.responder.RandomResponder;
import coba.ken.minimeme.responder.Responder;

public class Unmo {
    private final String name;
    private Responder responder;

    public Unmo(String name) {
        this.name = name;
        this.responder = new PatternResponder("Proto",new RandomResponder("proto"));
    }

    public String response(String input) {
        return responder.response(input);
    }

    public String getName() {
        return this.name;
    }

    public String getResponderName() {
        return this.responder.getName();
    }
}
