package coba.ken.minimeme.responder;

public class Responder {
    private final String name;

    public Responder(String name) {
        this.name = name;
    }

    public String response(String input) {
        return String.format("%sってなに?", input);
    }

    public String getName() {
        return this.name;
    }
}
