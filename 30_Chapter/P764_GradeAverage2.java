import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.stream.IntStream;

public class P764_GradeAverage2 {
    public static void main(String[] args) {
        ReportCard2[] reportCard2s = {
            new ReportCard2(70, 80, 90),
            new ReportCard2(80, 80, 80),
            new ReportCard2(90, 80, 70)
        };

        Arrays.stream(reportCard2s)
            .flatMapToInt(r -> IntStream.of(r.getKor(), r.getEng(), r.getMath()))
            .average()
            .ifPresent(avg -> System.out.println("avg: " + avg));
    }
}

@AllArgsConstructor
@Getter
class ReportCard2 {
    private int kor;
    private int eng;
    private int math;
}