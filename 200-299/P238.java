import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class P238 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        List<Integer> bitllets = new ArrayList<Integer>();

        String[] camps;
        String linia, bPerCap;

        int nB, nPart, quant;

        linia = s.nextLine();

        while (!linia.equals("0 0")) {
            camps = linia.split(" ");

            nB = Integer.parseInt(camps[0]);
            nPart = Integer.parseInt(camps[1]);

            for (int i = 0; i < nB; i++)
                bitllets.add(s.nextInt());

            s.nextLine();

            for (int i = 0; i < nPart; i++) {
                quant = 0;
                bPerCap = "";

                for (int j = i; j < nB; j += nPart) {
                    if (bitllets.size() != 0 && j < bitllets.size()) {
                        quant += bitllets.get(j);

                        bPerCap += " " + bitllets.get(j);
                    }
                }

                bPerCap.trim();
                System.out.println(quant + ":" + bPerCap);
            }

            System.out.println("---");

            bitllets.clear();
            linia = s.nextLine();
        }

        s.close();
    }
}
