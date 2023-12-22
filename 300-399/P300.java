import java.util.Scanner;

public class P300 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int nCasos = Integer.parseInt(s.nextLine());

        for (int nCaso = 0; nCaso < nCasos; nCaso++) {
            if (esPentavocalica(s.nextLine()))
                System.out.println("SI");
            else
                System.out.println("NO");
        }

        s.close();
    }

    private static boolean esPentavocalica(String palabra) {
        boolean[] validaciones = new boolean[5];
        int indice = 0;

        while (indice < palabra.length() && !validacionesValidas(validaciones)) {
            char caracterActual = palabra.charAt(indice);

            if (caracterActual == 'a')
                validaciones[0] = true;
            else if (caracterActual == 'e')
                validaciones[1] = true;
            else if (caracterActual == 'i')
                validaciones[2] = true;
            else if (caracterActual == 'o')
                validaciones[3] = true;
            else if (caracterActual == 'u')
                validaciones[4] = true;

            indice++;
        }

        return validacionesValidas(validaciones);
    }

    private static boolean validacionesValidas(boolean[] validaciones) {
        return validaciones[0] && validaciones[1] && validaciones[2] && validaciones[3] && validaciones[4];
    }
}
