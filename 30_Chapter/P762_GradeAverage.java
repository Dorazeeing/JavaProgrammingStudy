import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class P762_GradeAverage {
    public static void main(String[] args) {
        ReportCard[] reportCards = {
            new ReportCard(70, 80, 90),
            new ReportCard(90, 80, 70),
            new ReportCard(80, 80, 80),
        };

        // 스트림 생성
        Stream<ReportCard> reportCardStream = Arrays.stream(reportCards);

        // 학생들의 점수 정보로 이루어진 스트림 생성
        IntStream si = reportCardStream
            .flatMapToInt(x -> IntStream.of(x.getKor(), x.getEng(), x.getMath()));

        double avg = si.average().getAsDouble();
        System.out.println("age: " + avg);
    }
}

@AllArgsConstructor
@Getter
class ReportCard {
    private int kor;
    private int eng;
    private int math;
}