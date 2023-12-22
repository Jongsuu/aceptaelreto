import java.util.Scanner;
import java.util.HashSet;

public class P521 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HashSet<String> vivendes = new HashSet<String>();

        String[] camps;
        String linia;

        boolean minAsolit;
        short nPortals, nPisos, nAsistents, min;

        linia = s.nextLine();

        while (!linia.equals("0 0 0")) {
            camps = linia.split(" ");

            nPortals = Short.parseShort(camps[0]);
            nPisos = Short.parseShort(camps[1]);
            nAsistents = Short.parseShort(camps[2]);

            min = (short) Math.ceil((double) (nPortals * nPisos) / 2);

            for (short i = 0; i < nAsistents; i++)
                vivendes.add(s.next() + s.next());

            minAsolit = vivendes.size() >= min;

            s.nextLine();

            if (minAsolit)
                System.out.println("EMPEZAMOS");
            else
                System.out.println("ESPERAMOS");

            vivendes.clear();
            linia = s.nextLine();
        }

        s.close();
    }
}
