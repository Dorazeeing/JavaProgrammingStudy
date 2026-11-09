import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class P745_ToyStream {
    public static void main(String[] args) {
        List<ToyPriceInfo> toyPriceInfoList = new ArrayList<>();
        toyPriceInfoList.add(new ToyPriceInfo("GUN", 200));
        toyPriceInfoList.add(new ToyPriceInfo("TEDDY", 350));
        toyPriceInfoList.add(new ToyPriceInfo("CAR", 550));

        toyPriceInfoList.stream()
                .filter(i -> i.getPrice() <= 500)
                .map(i -> i.getPrice())
                .forEach(p -> System.out.println(p));
    }
}

@AllArgsConstructor
class ToyPriceInfo {
    private String name;
    @Getter
    private int price;
}