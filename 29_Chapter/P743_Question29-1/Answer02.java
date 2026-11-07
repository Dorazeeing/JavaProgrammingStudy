/*
 * [문제 29-1] map
 *
 * • 문제 2
 * 위 문제 1에서는 Box<String>을 String으로 맵핑하였다. 이번에는 Box<String>을 Integer
 * 로 맵핑하도록 문제 1의 답안을 수정해보자. 이때 Integer는 상자에 담긴 문자열의 길이이다.
 */

import java.util.Arrays;
import java.util.List;

public class Answer02 {
    public static void main(String[] args) {
        List<Box<String>> boxList = Arrays.asList(new Box<>("Robot"), new Box<>("Simple"));
        boxList.stream()
                .map(b -> b.get())
                .map(s -> s.length())
                .forEach(i -> System.out.println(i));
    }
}

class Box<T> {
    private T ob;
    public Box(T o) { ob = o; }
    public T get() { return this.ob; }
}
