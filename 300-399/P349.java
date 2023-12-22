import java.util.Scanner;

public class P349 {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int nCasos, resultat;

        nCasos = Integer.parseInt(s.nextLine());

        for (int cas = 0; cas < nCasos; cas++) {
            resultat = calcular();

            System.out.println(resultat);
        }

        s.close();
    }

    public static int calcular() {
        char valor;

        int resultat, num1, num2;

        valor = s.next().charAt(0);

        if (esNumero(valor))
            resultat = valor - '0';
        else {
            num1 = calcular();
            num2 = calcular();

            resultat = calcularOperacio(valor, num1, num2);
        }

        return resultat;
    }

    public static int calcularOperacio(char operador, int num1, int num2) {
        int resultat;

        if (operador == '+')
            resultat = num1 + num2;
        else if (operador == '-')
            resultat = num1 - num2;
        else if (operador == '*')
            resultat = num1 * num2;
        else
            resultat = num1 / num2;

        return resultat;
    }

    public static boolean esNumero(char valor) {
        return valor != '+' && valor != '-' && valor != '*' && valor != '/';
    }
}
