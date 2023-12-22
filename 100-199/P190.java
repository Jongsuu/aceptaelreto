import java.util.Scanner;

public class P190 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num, den, resta;
        long resultat;

        num = s.nextInt();
        den = s.nextInt();

        while (num >= den) {
            resta = num - den;
            resultat = 1;

            for (int i = 0; i < resta; i++)
                resultat *= num - i;

            System.out.println(resultat);

            num = s.nextInt();
            den = s.nextInt();
        }

        s.close();
    }
}
