import java.util.Scanner;
import java.util.Arrays;

public class P409 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        boolean bo = false;

        int nCasos, nPersones, nPerNivell, nNivells, j;
        int[] candidats;

        nCasos = s.nextInt();

        for (int cas = 0; cas < nCasos; cas++) {
            nPerNivell = s.nextInt();
            nPersones = s.nextInt();

            candidats = new int[nPersones];

            for (int i = 0; i < candidats.length; i++)
                candidats[i] = s.nextInt();

            Arrays.sort(candidats);

            j = 0;
            nNivells = 0;

            while (j + nPerNivell - 1 < candidats.length) {
                bo = Math.abs(candidats[j] - candidats[nPerNivell + j - 1]) <= 15;

                if (bo) {
                    j += nPerNivell;
                    nNivells++;
                } else
                    j++;
            }

            System.out.println(nNivells);
        }

        s.close();
    }
}
