import java.util.Scanner;

public class P112 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[] camps;
        String linia, output;

        double distancia, vMax, nSegons, vel, p20;

        linia = s.nextLine();

        while (!linia.equals("0 0 0")) {

            camps = linia.split(" ");

            distancia = Double.parseDouble(camps[0]);
            vMax = Double.parseDouble(camps[1]) / 3.6;
            nSegons = Double.parseDouble(camps[2]);

            if (nSegons <= 0 || distancia <= 0 || vMax <= 0)
                output = "ERROR";

            else {
                vel = distancia / nSegons;
                p20 = vMax * 1.2;

                if (vel <= vMax)
                    output = "OK";
                else if (vel < p20)
                    output = "MULTA";
                else
                    output = "PUNTOS";
            }

            System.out.println(output);

            linia = s.nextLine();
        }

        s.close();
    }
}
