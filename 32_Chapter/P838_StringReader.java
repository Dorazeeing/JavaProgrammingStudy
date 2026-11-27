import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class P838_StringReader {
    public static void main(String[] args) {
        try(BufferedReader in = new BufferedReader(new FileReader("String.txt"))) {
            String str;
            while(true) {
                str = in.readLine(); // 한 문장 읽어 들이기
                if(str == null)
                    break;
                System.out.println(str);
            }
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}