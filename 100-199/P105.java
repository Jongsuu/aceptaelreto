import java.util.Scanner;

public class P105 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[] llistaDies = { "MARTES", "MIERCOLES", "JUEVES", "VIERNES", "SABADO", "DOMINGO" };
        String output, mesVentes, menysVentes, diumenge;

        boolean empatMax, empatMin;

        double total, mitjana, venta, ventaMax, ventaMin;

        int max, min;

        venta = Double.parseDouble(s.nextLine());

        while (venta != -1) {
            total = venta;
            max = 0;
            min = 0;
            ventaMax = venta;
            ventaMin = venta;

            empatMax = false;
            empatMin = false;

            for (int i = 1; i < 6; i++) {
                venta = Double.parseDouble(s.nextLine());
                total += venta;

                if (venta > ventaMax) {
                    max = i;
                    ventaMax = venta;
                    empatMax = false;
                } else if (venta == ventaMax)
                    empatMax = true;

                if (venta < ventaMin) {
                    min = i;
                    ventaMin = venta;
                    empatMin = false;
                } else if (venta == ventaMin)
                    empatMin = true;
            }

            mitjana = total / 6;

            if (venta > mitjana)
                diumenge = "SI";
            else
                diumenge = "NO";

            if (empatMax)
                mesVentes = "EMPATE";
            else
                mesVentes = llistaDies[max];

            if (empatMin)
                menysVentes = "EMPATE";
            else
                menysVentes = llistaDies[min];

            output = mesVentes + " " + menysVentes + " " + diumenge;

            System.out.println(output);

            venta = Double.parseDouble(s.nextLine());
        }

        s.close();
    }
}
