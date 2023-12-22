import java.util.Scanner;

public class P162 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[] campos = s.nextLine().split(" ");
        int nEspacios = Integer.parseInt(campos[0]);

        while (nEspacios != 0) {
            String caracterNegro = campos[1];

            imprimirLimiteTablero(nEspacios * 8);

            for (int fila = 0; fila < 8; fila++) {
                for (int i = 0; i < nEspacios; i++) {
                    System.out.print("|");

                    if (fila % 2 == 0) {
                        for (int col = 0; col < 8; col++) {
                            if (col % 2 == 0)
                                pintaBlanco(nEspacios);
                            else
                                pintaNegro(nEspacios, caracterNegro);
                        }
                    } else {
                        for (int col = 0; col < 8; col++) {
                            if (col % 2 == 0)
                                pintaNegro(nEspacios, caracterNegro);
                            else
                                pintaBlanco(nEspacios);
                        }
                    }

                    System.out.print("|");
                    System.out.println();
                }
            }

            imprimirLimiteTablero(nEspacios * 8);

            campos = s.nextLine().split(" ");
            nEspacios = Integer.parseInt(campos[0]);
        }

        s.close();
    }

    private static void imprimirLimiteTablero(int nEspacios) {
        System.out.print("|");

        for (int i = 0; i < nEspacios; i++)
            System.out.print("-");

        System.out.print("|");
        System.out.println();
    }

    private static void pintaBlanco(int nEspacios) {
        for (int i = 0; i < nEspacios; i++)
            System.out.print(" ");
    }

    private static void pintaNegro(int nEspacios, String caracterNegro) {
        for (int i = 0; i < nEspacios; i++)
            System.out.print(caracterNegro);
    }
}
