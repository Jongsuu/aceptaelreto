import java.util.Scanner;

public class P219 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int nCasos, nDecims, output, decim;

        nCasos = s.nextInt();

        for (int cas = 0; cas < nCasos; cas++) {
            output = 0;
            nDecims = s.nextInt();

            for (int i = 0; i < nDecims; i++) {
                decim = s.nextInt();

                if (decim % 2 == 0)
                    output++;
            }

            System.out.println(output);
        }

        s.close();
    }
}
