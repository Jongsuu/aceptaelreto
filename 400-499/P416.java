import java.util.Scanner;
import java.util.HashSet;

public class P416 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HashSet<String> cumples = new HashSet<String>();

        String[] cumple;
        String output;

        int nCumples = s.nextInt();

        while (nCumples != 0) {
            for (int i = 0; i < nCumples; i++) {
                cumple = s.next().split("/");

                cumples.add(cumple[0] + '/' + cumple[1]);
            }

            if (cumples.size() == nCumples)
                output = "NO";
            else
                output = "SI";

            System.out.println(output);

            cumples.clear();
            nCumples = s.nextInt();
        }

        s.close();
    }
}
