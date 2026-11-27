import java.io.*;
import java.util.Scanner;

public class P824_BufferedStreamFileCopier {
    public static void main(String[] args) {
        String src, dst;
        Scanner sc = new Scanner(System.in);

        System.out.print("src: ");
        src = sc.nextLine();

        System.out.print("dst: ");
        dst = sc.nextLine();

        try(BufferedInputStream in = new BufferedInputStream(new FileInputStream(src));
            BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(dst))) {
            int data;

            while(true) {
                data = in.read();
                if(data == -1)
                    break;
                out.write(data);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}