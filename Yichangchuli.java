import java.io.IOException;

public class Yichangchuli {
    public static void main(String[] args) {
        try {
            Yichang(11);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
            System.out.println("catch exceptino...");
        }
        System.out.println("bbb");
    }

    public static void Yichang(int i) throws Exception {
        if (i != 1) {
            throw new IOException("io错误.");
        }
        System.out.println("aaa");
    }
}