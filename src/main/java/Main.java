import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Unmo proto = new Unmo("proto");

        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.println("> ");
            String input = scan.next().trim();
            if (input.isEmpty()) {
                break;
            }
            System.out.printf("%s : %s > ", proto.getName(), proto.getResponderName());
            System.out.println(proto.response(input));
        }
    }
}
