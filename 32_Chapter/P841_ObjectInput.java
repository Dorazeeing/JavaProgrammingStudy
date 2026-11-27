import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class P841_ObjectInput {
    public static void main(String[] args) {
        try(ObjectInputStream oi = new ObjectInputStream(new FileInputStream("Object.bin"))) {
            SBox box1 = (SBox) oi.readObject();
            System.out.println(box1.get());
            SBox box2 = (SBox) oi.readObject();
            System.out.println(box2.get());
        }
        catch (IOException|ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class SBox implements java.io.Serializable {
    String s;
    public SBox(String s) {
        this.s = s;
    }
    public String get() {
        return s;
    }
}