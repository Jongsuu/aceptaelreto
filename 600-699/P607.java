import java.util.Scanner;

public class P607 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int nFoto, nCasos, nCopies, nLinies;

        nCasos = s.nextInt();

        for (int cas = 0; cas < nCasos; cas++) {
            nCopies = s.nextInt();

            nLinies = 1;
            nFoto = 0;

            while (nLinies < nCopies) {
                nLinies *= 2;

                nFoto++;
            }

            System.out.println(nFoto);
        }

        s.close();
    }
}
