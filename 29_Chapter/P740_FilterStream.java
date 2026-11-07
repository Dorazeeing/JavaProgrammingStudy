import java.util.Arrays;
import java.util.List;

public class P740_FilterStream {
    public static void main(String[] args) {
        int[] iArr = {1, 2, 3, 4, 5};
        Arrays.stream(iArr).filter(n -> n % 2 ==1).forEach(n -> System.out.println(n));
        System.out.println();

        List<String> sList = Arrays.asList("Toy", "Robot", "Box");
        sList.stream()
                .filter(s -> s.length() == 3)
                .forEach(s -> System.out.println(s));
    }
}

