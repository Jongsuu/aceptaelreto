import java.util.*;

public class P185 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int nCasos = Integer.parseInt(s.nextLine());

        Set<String> conjuntoNO = new TreeSet<String>();
        Set<String> conjuntoSI = new HashSet<String>();

        while (nCasos != 0) {
            for (int nCaso = 0; nCaso < nCasos; nCaso++) {
                String linea = s.nextLine();
                String[] ingredientes = linea.split(" ");

                int index = 1;

                if (ingredientes[0].equals("SI:")) {
                    while (!ingredientes[index].equals("FIN")) {
                        conjuntoSI.add(ingredientes[index]);
                        index++;
                    }
                } else {
                    while (!ingredientes[index].equals("FIN")) {
                        conjuntoNO.add(ingredientes[index]);
                        index++;
                    }
                }
            }

            StringBuilder resultado = new StringBuilder();
            conjuntoNO.removeAll(conjuntoSI);

            for (String ing : conjuntoNO) {
                resultado.append(ing + " ");
            }

            System.out.println(resultado.toString().trim());

            conjuntoNO.clear();
            conjuntoSI.clear();

            nCasos = Integer.parseInt(s.nextLine());
        }

        s.close();
    }
}
