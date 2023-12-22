import java.util.Scanner;

public class P158 {
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int nCasos = Integer.parseInt(s.nextLine());
        int nMuros;
        short saltosArriba, saltosAbajo, muroAnterior = 0, muroActual;

        while (nCasos > 0) {
            nMuros = Integer.parseInt(s.nextLine());
            saltosArriba = 0;
            saltosAbajo = 0;

            if (nMuros > 0)
                muroAnterior = s.nextShort();

            nMuros--;

            while (nMuros > 0) {
                muroActual = s.nextShort();

                if (muroActual > muroAnterior) {
                    saltosArriba++;
                    muroAnterior = muroActual;
                } else if (muroActual < muroAnterior) {
                    saltosAbajo++;
                    muroAnterior = muroActual;
                }

                nMuros--;
            }

            s.nextLine();
            System.out.println(saltosArriba + " " + saltosAbajo);
            nCasos--;
        }

        s.close();
    }
}
