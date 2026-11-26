import java.io.*;
import java.util.Scanner;

public class P818_BufferedFileCopier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("src: ");
        String src = sc.nextLine();

        System.out.print("dst: ");
        String dst = sc.nextLine();

        try(InputStream in = new FileInputStream(src);
            OutputStream out = new FileOutputStream(dst)) {
            byte buffer[] = new byte[1024];
            int len;

            while(true) {
                len = in.read(buffer);
                if(len == -1)
                    break;
                out.write(buffer, 0, len);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}