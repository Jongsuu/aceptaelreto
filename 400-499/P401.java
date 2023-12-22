import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class P401 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long nCasos = s.nextLong();
        s.nextLine();

        String[] linia;
        List<Integer> primeresLletres;
        String p1, p2, output;
        Boolean trifelio;
        int index;

        for (long i = 1; i <= nCasos; i++) {
            linia = s.nextLine().split(" ");
            p1 = linia[0].toLowerCase();
            p2 = linia[1].toLowerCase();

            p1 = p1.replace('v', 'b');
            p2 = p2.replace('v', 'b');

            if (!p1.equals(p2) && p1.length() == p2.length()) {
                primeresLletres = GetPrimeresLletres(p1, p2);

                trifelio = false;
                index = 0;

                while (!trifelio && index < primeresLletres.size()) {
                    trifelio = EsTrifelio(p1, p2, primeresLletres.get(index));
                    index++;
                }

                if (trifelio)
                    output = "SI";
                else
                    output = "NO";
            } else {
                output = "NO";
            }
            System.out.println(output);
        }
        s.close();
    }

    // return true if p1 && p2 are trifelio
    public static boolean EsTrifelio(String p1, String p2, int indP2) {
        boolean trifelio = true;
        int indP1 = 0;

        while (trifelio && indP1 < p1.length()) {
            trifelio = p1.charAt(indP1) == p2.charAt(indP2);

            if (trifelio) {
                indP2++;
                if (indP2 == p2.length())
                    indP2 = 0;
                indP1++;
            }
        }

        return trifelio;
    }

    // return a list with the position of the first letter of p1, but in p2
    public static List<Integer> GetPrimeresLletres(String p1, String p2) {
        List<Integer> llista = new ArrayList<>();
        String primera = "" + p1.charAt(0);

        if (p2.contains(primera)) {
            for (int i = 0; i < p2.length(); i++) {
                if (p1.charAt(0) == p2.charAt(i))
                    llista.add(i);
            }
        }

        return llista;
    }
}
