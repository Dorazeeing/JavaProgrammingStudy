import java.util.Arrays;
import java.util.stream.Stream;

public class P761_FlatMapStream {
    public static void main(String[] args) {
        Stream<String> stringStream1 = Stream.of("MY_AGE", "YOUR_LIFE");

        // 아래 람다식에서 스트림을 생성
        Stream<String> stringStream2 = stringStream1.flatMap(s -> Arrays.stream(s.split("_")));
        stringStream2.forEach(s -> System.out.println(s));
    }
}