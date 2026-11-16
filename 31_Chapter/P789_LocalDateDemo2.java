import java.time.LocalDate;
import java.time.Period;

public class P789_LocalDateDemo2 {
    public static void main(String[] args) {
        // Today
        LocalDate today = LocalDate.now();
        System.out.println("Today: " + today);

        // X-MAS in this year
        LocalDate xmas = LocalDate.of(today.getYear(), 12, 25);
        System.out.println("Xmax: " + xmas);

        // 크리스마스까지 앞으로 며칠?
        Period left = Period.between(today, xmas);
        System.out.println("Xmas까지 앞으로 " + left.getMonths() + "월 " + left.getDays() + "일");
    }
}