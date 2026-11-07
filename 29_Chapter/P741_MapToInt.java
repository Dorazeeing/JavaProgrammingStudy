import java.util.Arrays;
import java.util.List;

public class P741_MapToInt {
    public static void main(String[] args) {
        List<String> ls = Arrays.asList("Toy", "Robot", "Simple");
        ls.stream()
                .map(s -> s.length())
                .forEach(s -> System.out.println(s + "\t"));
    }
}

