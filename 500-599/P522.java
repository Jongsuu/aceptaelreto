import java.util.Scanner;

public class P522 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[] camps;
        String s1, s2;

        boolean iguals, mesGran;

        char c1, c2, c3, c4;
        int i, tamany;

        while (s.hasNextLine()) {
            // Agafo les paraules
            camps = s.nextLine().split(" ");
            s1 = camps[0];
            s2 = camps[1];

            // Reinicio els valors
            i = 1;
            iguals = true;
            mesGran = false;

            // Agafo els primers caracters
            c1 = s1.charAt(0);
            c3 = s2.charAt(0);

            // Comprovo quina paraula és més curta
            if (s1.length() <= s2.length())
                tamany = s1.length();
            else
                tamany = s2.length();

            while (iguals && i < tamany) {
                if (i < tamany) {
                    c2 = s1.charAt(i);
                    c4 = s2.charAt(i);
                } else {
                    c2 = 0;
                    c4 = 0;
                }

                // Comprovo ll per la primera paraula
                if (c1 == 'l' && c2 == 'l') {
                    // Si tmb te ll i++ per saltar-me la següent lletra (la segona l)
                    iguals = c3 == 'l' && c4 == 'l';

                    if (!iguals)
                        mesGran = c3 >= 'm';
                    else
                        i++;
                }
                // Comprovo ch per la primera paraula
                else if (c1 == 'c' && c2 == 'h') {
                    // Si tmb te ch i++ per saltar-me la següent lletra (la h)
                    iguals = c3 == 'c' && c4 == 'h';

                    if (!iguals)
                        mesGran = c3 >= 'd';
                    else
                        i++;
                }
                // Comprovo ll per la segona paraula
                else if (c3 == 'l' && c4 == 'l') {
                    // Com que ja hem mirat si hi havia ll no cal comprovar-ho i ja assumeixo que
                    // son diferents
                    iguals = false;
                    mesGran = c1 <= 'l';
                }
                // Comprovo ch per la segona paraula
                else if (c3 == 'c' && c4 == 'h') {
                    // Com que ja hem mirat si hi havia ll no cal comprovar-ho i ja assumeixo que
                    // son diferents
                    iguals = false;
                    mesGran = c1 <= 'c';
                }
                // Sino podem comprovar-ho normal
                else {
                    iguals = c1 == c3;

                    if (!iguals)
                        mesGran = c1 < c3;
                }

                if (iguals && i < tamany) {
                    c1 = s1.charAt(i);
                    c3 = s2.charAt(i);

                    i++;
                }
            }

            // Si son iguals pero tenen diferent longitud una es mes gran que l'altre
            if (iguals) {
                if (c1 != c3)
                    mesGran = c1 < c3;
                else {
                    if (s1.length() > s2.length())
                        mesGran = false;
                    else if (s2.length() > s1.length())
                        mesGran = true;
                }
            }

            // Mostro la sortida
            if (mesGran)
                System.out.println(s1);
            else
                System.out.println(s2);
        }

        s.close();
    }
}
