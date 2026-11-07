import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P738_ListStream {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Toy", "Robot", "Box");
        list.stream().forEach(str -> System.out.println(str));
    }
}

