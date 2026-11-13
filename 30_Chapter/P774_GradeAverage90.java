import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

public class P774_GradeAverage90 {
    public static void main(String[] args) {
        ReportCard3[] reportCard3s = {
            new ReportCard3(93, 84, 90),
            new ReportCard3(92, 87, 95),
            new ReportCard3(85, 99, 93),
        };

        boolean b1 = Arrays.stream(reportCard3s)
            .mapToDouble(r -> (r.getKor() + r.getEng() + r.getMath()) / 3.0)
            .anyMatch(avg -> avg >= 90);
        System.out.println("평균이 90점 이상인 학생이 한 명 이상 존재." + b1);

        if(b1 == true) {
            boolean b2 = Arrays.stream(reportCard3s)
                .mapToDouble(r -> (r.getKor() + r.getEng() + r.getMath()) / 3.0)
                .allMatch(avg -> avg >= 90);
            System.out.println("모두 평균 90점 이상." + b2);
        }
    }
}

@AllArgsConstructor
@Getter
class ReportCard3 {
    private int kor;
    private int eng;
    private int math;
}