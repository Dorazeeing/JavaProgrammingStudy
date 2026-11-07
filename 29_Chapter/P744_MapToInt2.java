import java.util.Arrays;
import java.util.List;

public class P744_MapToInt2 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Box", "Robot", "Simple");
        stringList.stream()
                .mapToInt(s -> s.length())
                .forEach(i -> System.out.println(i + "\t"));
    }
}