import java.util.Scanner;

public class P167 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int longitud, resultat;

        while (s.hasNextLine()) {
            longitud = Integer.parseInt(s.nextLine());
            resultat = calcularLongitud(longitud);

            System.out.println(resultat);
        }

        s.close();
    }

    public static int calcularLongitud(int longitud) {
        int resultat;

        if (longitud == 1)
            resultat = 4;
        else {
            resultat = 4 * calcularLongitud(longitud / 2);
            resultat += 4 * longitud;
        }

        return resultat;
    }
}
