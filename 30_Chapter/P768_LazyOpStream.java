import java.util.stream.IntStream;

public class P768_LazyOpStream {
    public static void main(String[] args) {
        /// 최종 연산이 생략된 스트림의 파이프라인 -> 따라서 중간 연산(peek)가 수행되지 않는다.(Laze)
        IntStream.of(1, 3, 5)
            .peek(d -> System.out.println(d + "\t"));
        System.out.println();

        // 최종 연산이 존재하는 스트림의 파이프라인
        IntStream.of(5, 3, 1)
            .peek(d -> System.out.println(d + "\t"))
            .sum();
        System.out.println();
    }
}

