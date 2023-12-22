import java.util.Scanner;

public class P605 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String prenda = s.next();
        int hivern, estiu;

        while (!prenda.equals(".")) {
            estiu = 0;
            hivern = 0;

            while (!prenda.equals(".")) {
                if (prenda.equals("V"))
                    estiu++;
                else if (prenda.equals("I"))
                    hivern++;

                prenda = s.next();
            }

            if (hivern > estiu)
                System.out.println("INVIERNO");
            else if (hivern < estiu)
                System.out.println("VERANO");
            else
                System.out.println("EMPATE");

            prenda = s.next();
        }

        s.close();
    }
}
