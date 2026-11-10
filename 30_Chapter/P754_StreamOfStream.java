import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class P754_StreamOfStream {
    public static void main(String[] args) {
        Stream.of(11, 22, 33, 44)
                .forEach(n -> System.out.println(n));
        System.out.println();

        Stream.of("So simple stirng")
                .forEach(s -> System.out.println(s));
        System.out.println();

        List<String> ls = Arrays.asList("Toy", "Robot", "Box");
        Stream.of(ls)
                .forEach(s -> System.out.println(s));
    }
}

