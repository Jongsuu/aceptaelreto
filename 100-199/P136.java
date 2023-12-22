import java.util.Scanner;

public class P136 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int forca, tamany;

        forca = s.nextInt() * 2;
        tamany = s.nextInt();

        while (forca != 0) {
            System.out.println(eslabonesATrencar(forca, tamany));

            forca = s.nextInt() * 2;
            tamany = s.nextInt();
        }

        s.close();
    }

    public static int eslabonesATrencar(int forca, int tamany) {
        int resultat = 0, tamanyG, tamanyP;

        if (tamany <= forca)
            resultat = 0;
        else {
            tamanyP = tamany / 3;
            tamanyG = tamany - tamanyP;

            resultat = eslabonesATrencar(forca, tamanyG) + eslabonesATrencar(forca, tamanyP);
            resultat++;
        }

        return resultat;
    }
}
