import java.time.ZoneId;

public class P800_ZoneIdDemo1 {
    public static void main(String[] args) {
        ZoneId paris = ZoneId.of("Europe/Paris");
        System.out.println(paris);
    }
}