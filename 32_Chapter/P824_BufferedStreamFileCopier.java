import java.io.*;
import java.util.Scanner;

public class P824_BufferedStreamFileCopier {
    public static void main(String[] args) {
        String src, dst;
        Scanner sc = new Scanner(System.in);

        if(args.length != 0) {
            System.out.println("src: " + args[0]);
            System.out.println("dst: " + args[1]);

            src = args[0];
            dst = args[1];
        }

        else {
            System.out.print("src: ");
            src = sc.nextLine();

            System.out.print("dst: ");
            dst = sc.nextLine();
        }

        try(BufferedInputStream in = new BufferedInputStream(new FileInputStream(src));
            BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(dst))) {
            int data;

            while(true) {
                data = in.read();
                if(data == -1)
                    break;
                out.write(data);
            }

            out.flush(); // 버퍼에 남은 내용을 파일로 내보낸 뒤에 cat 해야 한다.

            new ProcessBuilder("cat", dst)
                    .inheritIO()
                    .start()
                    .waitFor();
        }
        catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}