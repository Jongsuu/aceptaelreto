import java.util.Scanner;

public class P347 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int altura, amplada;

        amplada = s.nextInt();
        altura = s.nextInt();

        while (amplada != 0 && altura != 0) {
            System.out.println(comptarPajaritas(amplada, altura));

            amplada = s.nextInt();
            altura = s.nextInt();
        }

        s.close();
    }

    public static int comptarPajaritas(int amplada, int altura) {
        int res;

        if (amplada < 10 || altura < 10)
            return 0;
        else {

            if (amplada > altura) {
                res = amplada / altura;
                amplada -= res * altura;
            }

            else {
                res = altura / amplada;
                altura -= res * amplada;
            }

            return res + comptarPajaritas(amplada, altura);
        }
    }
}
