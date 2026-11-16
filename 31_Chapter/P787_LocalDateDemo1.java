import java.time.LocalDate;

public class P787_LocalDateDemo1 {
    public static void main(String[] args) {
        // Today
        LocalDate today = LocalDate.now();
        System.out.println("Today: " + today);

        // X-mas in this year
        LocalDate xmas = LocalDate.of(today.getYear(), 12, 25);
        System.out.println("Xmas: " + xmas);

        // Eve of X-mas in this year
        LocalDate eve = xmas.minusDays(1);
        System.out.println("Xmas Eve: " + eve);
    }
}