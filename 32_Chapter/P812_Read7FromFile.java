import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class P812_Read7FromFile {
    public static void main(String[] args) throws IOException {
        InputStream in = new FileInputStream("data.dat"); // 입력 스트림 생성
        int dat = in.read();
        in.close();

        System.out.println(dat);
    }
}