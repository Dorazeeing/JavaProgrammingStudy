import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.List;

public class P786_HowLongParallel {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(41, 42, 43, 44, 45, 46);

        Instant start = Instant.now(); // 스톱워치 시작
        integerList.parallelStream()
            .map(n -> fibonacci(n))
            .forEach(n -> System.out.println(n));
        Instant end = Instant.now(); // 스톱워치 멈춤
        System.out.println("Parallel processing: " + Duration.between(start, end).toMillis());
    }

    public static long fibonacci(long n) {
        if(n == 1 || n == 2)
            return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

