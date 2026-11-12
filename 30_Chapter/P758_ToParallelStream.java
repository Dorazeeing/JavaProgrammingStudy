import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class P758_ToParallelStream {
    public static void main(String[] args) {
        List<String> ls = Arrays.asList("Box", "Simple", "Complex", "Robot");
        Stream<String> stringStream = ls.stream(); // 스트림 생성

        BinaryOperator<String> binaryOperator = (str1, str2) -> {
            if(str1.length() > str2.length())
                return str1;
            else
                return str2;
        };

        String str = stringStream.parallel() // 병렬 스트림 생성
                .reduce("", binaryOperator);

        System.out.println(str);
    }
}

