import java.util.Scanner;

public class P456 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int nCasos = Integer.parseInt(s.nextLine());

        for (int nCaso = 0; nCaso < nCasos; nCaso++) {
            int ancho = s.nextInt();
            int alto = s.nextInt();
            int chocolate = s.nextInt();

            double areaTableta = ancho * alto;

            System.out.println(Math.round(Math.ceil(chocolate / areaTableta)));
            s.nextLine();
        }

        s.close();
    }
}
