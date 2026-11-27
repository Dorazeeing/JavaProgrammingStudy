import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class P828_BufferedDataInputStream {
    public static void main(String[] args) {
        try(DataInputStream in =
            new DataInputStream(
                new BufferedInputStream(
                    new FileInputStream("data.dat")))) {
            System.out.println(in.readInt());
            System.out.println(in.readDouble());
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}