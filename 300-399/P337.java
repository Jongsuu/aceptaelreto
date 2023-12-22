import java.util.Scanner;

public class P337 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[] filaSup = new String[6], filaInf = new String[6];
        String output;

        int nCasos, index, suma;
        boolean encaixen;

        nCasos = s.nextInt();
        s.nextLine();

        for (int cas = 0; cas < nCasos; cas++) {
            encaixen = true;
            index = 1;

            filaSup = s.nextLine().split(" ");
            filaInf = s.nextLine().split(" ");

            suma = Short.parseShort(filaSup[0]) + Short.parseShort(filaInf[0]);

            while (encaixen && index < 6) {
                encaixen = suma == Short.parseShort(filaSup[index]) + Short.parseShort(filaInf[index]);
                index++;
            }

            if (encaixen)
                output = "SI";
            else
                output = "NO";

            System.out.println(output);
        }

        s.close();
    }
}
