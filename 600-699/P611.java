import java.util.Scanner;
import java.util.TreeSet;
import java.util.HashMap;

public class P611 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HashMap<Integer, String> llibres = new HashMap<Integer, String>();
        TreeSet<Integer> anys = new TreeSet<Integer>();

        String output, llibre;

        int any, anyLlibre, nLlibres;

        while (s.hasNextLine()) {
            any = s.nextInt();
            s.nextLine();

            nLlibres = s.nextInt();

            for (int i = 0; i < nLlibres; i++) {
                anyLlibre = s.nextInt();
                llibre = s.nextLine();

                if (anyLlibre >= any) {
                    llibres.put(anyLlibre, llibre);
                    anys.add(anyLlibre);
                }
            }

            if (llibres.size() == 0)
                output = "NINGUNA";

            else if (llibres.size() == nLlibres)
                output = "TODAS";

            else
                output = llibres.get(anys.first()).trim();

            llibres.clear();
            anys.clear();

            System.out.println(output);
        }

        s.close();
    }
}
