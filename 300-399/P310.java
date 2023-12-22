import java.util.*;

public class P310 {
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int nCasos = Integer.parseInt(s.nextLine());

        for (int nCaso = 0; nCaso < nCasos; nCaso++) {
            System.out.println(alturaArbolGeneral(s.nextInt(), 0));
        }

        s.close();
    }

    private static int alturaArbolGeneral(int nHijos, int alturaPadre) {
        if (nHijos == 0)
            return alturaPadre + 1;
        else {
            ArrayList<Integer> alturaHijos = new ArrayList<Integer>();

            for (int i = 0; i < nHijos; i++) {
                alturaHijos.add(alturaArbolGeneral(s.nextInt(), alturaPadre + 1));
            }

            return Collections.max(alturaHijos);
        }
    }
}
