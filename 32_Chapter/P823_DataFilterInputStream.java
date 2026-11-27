import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class P823_DataFilterInputStream {
    public static void main(String[] args) {
        try(DataInputStream in = new DataInputStream(new FileInputStream("data.dat"))) {
            int num1 = in.readInt(); // int형 데이터를 꺼냄
            double num2 = in.readDouble(); // double형 데이터를 꺼냄

            System.out.println(num1 + "\n" + num2);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}