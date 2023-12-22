import java.util.Scanner;

public class P455 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int nCasos = Integer.parseInt(s.nextLine());

        for (int nCaso = 0; nCaso < nCasos; nCaso++) {
            int divisor = Integer.parseInt(s.nextLine());

            System.out.println(10000 / gcd(divisor, 10000));
        }

        s.close();
    }

    private static int gcd(int a, int b) {
        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}
