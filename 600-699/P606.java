import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P606 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Integer> preus = new ArrayList<Integer>();
        List<Integer> longitudLIS = new ArrayList<Integer>();

        int nDies, maxCrec;
        nDies = s.nextInt();

        while (nDies != 0) {
            for (int i = 0; i < nDies; i++)
                preus.add(s.nextInt());

            longitudLIS.add(1);

            for (int i = 1; i < nDies; i++) {
                maxCrec = 1;

                for (int j = 0; j < i; j++) {
                    if (preus.get(j) < preus.get(i))
                        maxCrec = Math.max(maxCrec, longitudLIS.get(j) + 1);
                }

                longitudLIS.add(maxCrec);
            }

            System.out.println(Collections.max(longitudLIS));

            preus.clear();
            longitudLIS.clear();

            nDies = s.nextInt();
        }

        s.close();
    }
}
