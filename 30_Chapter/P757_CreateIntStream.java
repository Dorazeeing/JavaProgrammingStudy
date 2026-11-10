import java.util.stream.IntStream;

public class P757_CreateIntStream {
    public static void showIntStream(IntStream intStream) {
        intStream.forEach(n -> System.out.print(n + "\t"));
        System.out.println();
    }

    public static void main(String[] args) {
        IntStream intStream1 = IntStream.of(7, 5, 3);
        showIntStream(intStream1);

        IntStream intStream2 = IntStream.range(5, 8);
        showIntStream(intStream2);

        IntStream intStream3 = IntStream.rangeClosed(5, 8);
        showIntStream(intStream3);
    }
}

