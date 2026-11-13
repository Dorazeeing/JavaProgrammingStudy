import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class P776_CollectStringStream {
    public static void main(String[] args) {
        String[] words = {"Hello", "Box", "Robot", "Toy"};
        Stream<String> stringStream = Arrays.stream(words);

        List<String> stringList = stringStream.filter(s -> s.length() < 5)
            .collect(() -> new ArrayList<>(),
                (c, s) -> c.add(s),
                (lst1, lst2) -> lst1.addAll(lst2));
        System.out.println(stringList);
    }
}