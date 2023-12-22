import java.util.Scanner;

public class P272 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int nCasos, b10;

        nCasos = Integer.parseInt(s.nextLine());

        for (int cas = 0; cas < nCasos; cas++) {
            b10 = Integer.parseInt(s.nextLine());

            System.out.println(base6(b10));
        }

        s.close();
    }

    public static String base6(int b10) {
        String resultat;

        if (b10 < 6)
            resultat = "" + b10;
        else {
            resultat = base6(b10 / 6);
            resultat += "" + (b10 % 6);
        }

        return resultat;
    }
}
