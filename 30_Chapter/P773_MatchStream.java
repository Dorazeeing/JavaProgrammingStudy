import java.util.stream.IntStream;

public class P773_MatchStream {
    public static void main(String[] args) {
        boolean b = IntStream.of(1, 2, 3, 4, 5)
            .allMatch(n -> n%2 == 0);
        System.out.println("모두 짝수이다. " + b);

        b = IntStream.of(1, 2, 3, 4, 5)
            .anyMatch(n -> n%2 == 0);
        System.out.println("짝수가 적어도 하나는 존재한다. " + b);

        b = IntStream.of(1, 2, 3, 4, 5)
            .noneMatch(n -> n%2 ==0);
        System.out.println("짝수가 존재하지 않는다. " + b);
    }
}

