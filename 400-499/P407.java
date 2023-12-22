import java.util.Scanner;

public class P407 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[] camps;
        String linia;

        long caselles, tirada, posicio, seguentPosicio;

        linia = s.nextLine();

        while (!linia.equals("0 0 0")) {
            camps = linia.split(" ");

            caselles = Long.parseLong(camps[0]);
            posicio = Long.parseLong(camps[1]);
            tirada = Long.parseLong(camps[2]);

            seguentPosicio = posicio + tirada;

            if (seguentPosicio > caselles)
                seguentPosicio = caselles - (seguentPosicio - caselles);

            System.out.println(seguentPosicio);

            linia = s.nextLine();
        }

        s.close();
    }
}
