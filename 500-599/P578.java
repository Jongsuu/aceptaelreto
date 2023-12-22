import java.util.Scanner;
import java.util.HashSet;

public class P578 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HashSet<String> productes = new HashSet<String>();

        String producte;

        int nProductes;

        nProductes = s.nextInt();

        while (nProductes != 0) {
            for (int i = 0; i < nProductes + 1; i++) {
                producte = s.nextLine().toLowerCase();

                if (!producte.equals(""))
                    productes.add(producte);
            }

            System.out.println(productes.size());
            productes.clear();

            nProductes = s.nextInt();
        }

        s.close();
    }
}
