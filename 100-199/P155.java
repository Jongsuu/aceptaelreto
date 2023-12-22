import java.util.Scanner;

public class P155 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int x = s.nextInt();
        int y = s.nextInt();

        while (x >= 0 && y >= 0) {
            System.out.println(2 * x + 2 * y);

            x = s.nextInt();
            y = s.nextInt();
        }

        s.close();
    }
}
