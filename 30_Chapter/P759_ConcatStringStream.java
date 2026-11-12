import java.util.stream.Stream;

public class P759_ConcatStringStream {
    public static void main(String[] args) {
        Stream<String> stringStream1 = Stream.of("Cake", "Milk");
        Stream<String> stringStream2 = Stream.of("Lemon", "Jelly");

        // 스트림을 하나로 묶은 후 출력
        Stream.concat(stringStream1, stringStream2)
                .forEach(s -> System.out.println(s));
    }
}