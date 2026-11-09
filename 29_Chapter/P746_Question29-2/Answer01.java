/*
 * [문제 29-2] 두 번의 중간 연산
 *
 * 예제 ToyStream.java의 ToyPriceInfo 클래스에 다음 메소드를 추가하자.
 *     public String getModel() { return model; }
 *
 * 그리고 예제의 내용대로 스트림을 생성한 이후에 다음의 내용대로 필터링, 맵핑을 하고 마지막에
 * 결과로 남은 스트림의 내용을 forEach 연산을 통해 전부 출력하자.
 *     필터링 조건    model이 참조하는 문자열의 길이가 10을 넘으면 해당 인스턴스 통과
 *     맵핑 방법      ToyPriceInfo 인스턴스 ⇨ String 인스턴스(모델명)
 */

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Answer01 {
    public static void main(String[] args) {
        List<ToyPriceInfo> toyPriceInfoList = new ArrayList<>();
        toyPriceInfoList.add(new ToyPriceInfo("GUN_LR_45", 200));
        toyPriceInfoList.add(new ToyPriceInfo("TEDDY_BEAR_S_014", 350));
        toyPriceInfoList.add(new ToyPriceInfo("CAR_TRANSFORM_VER_7719", 550));

        toyPriceInfoList.stream()
                .filter(i -> i.getName().length() > 10)
                .map(i -> i.getName())
                .forEach(s -> System.out.println(s));
    }
}

@AllArgsConstructor
@Getter
class ToyPriceInfo {
    private String name;
    private int price;
}