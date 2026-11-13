import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class P778_CollectParallelStringStream {
    public static void main(String[] args) {
        String[] words = {
            "Hello", "Box", "Robot", "Toy"
        };
        Stream<String> stringStream = Stream.of(words);

        List<String> stringList = stringStream.parallel()
            .filter(str -> str.length() < 5)
            .collect(() -> new ArrayList<>(),
                (coll, str) -> coll.add(str),
                (lst1, lst2) -> lst1.addAll(lst2));

        System.out.println(stringList);
    }
}
