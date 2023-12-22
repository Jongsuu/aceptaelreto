import java.util.Scanner;

public class P208 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long f = s.nextLong();
        long b = s.nextLong();

        while (f != 0 || b != 0) {
            long total = f * (f + 1) / 2;
            long tirados = (f - b + 1) * (f - b + 2) / 2;

            System.out.println(total - tirados);

            s.nextLine();
            f = s.nextLong();
            b = s.nextLong();
        }

        s.close();
    }
}
