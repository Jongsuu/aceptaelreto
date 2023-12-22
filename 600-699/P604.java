import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class P604 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HashMap<Character, List<Character>> cartes = new HashMap<Character, List<Character>>();
        List<Character> l = new ArrayList<Character>();

        String[] camps;
        char[] sotes = { 'C', 'D', 'P', 'T' };

        int nCasos, distribucio, honor;

        nCasos = s.nextInt();
        s.nextLine();

        for (char sota : sotes)
            cartes.put(sota, new ArrayList<Character>());

        for (int cas = 0; cas < nCasos; cas++) {
            camps = s.nextLine().split(" ");

            distribucio = 0;
            honor = 0;

            for (int i = 0; i < camps.length; i += 2)
                cartes.get(camps[i + 1].charAt(0)).add(camps[i].charAt(0));

            for (char sota : sotes) {
                l = cartes.get(sota);

                if (l.size() == 2)
                    distribucio += 1;
                else if (l.size() == 1)
                    distribucio += 2;
                else if (l.size() == 0)
                    distribucio += 3;

                for (char carta : l) {
                    switch (carta) {
                        case 'A':
                            honor += 4;
                            break;
                        case 'K':
                            honor += 3;
                            break;
                        case 'Q':
                            honor += 2;
                            break;
                        case 'J':
                            honor += 1;
                            break;
                    }
                }
            }

            System.out.println(honor + distribucio);

            for (char sota : sotes)
                cartes.get(sota).clear();
        }

        s.close();
    }
}
