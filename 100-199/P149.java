import java.util.Scanner;

public class P149 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int nToros, maxVel;
        int velToro;

        while (s.hasNext()) {
            nToros = s.nextInt();
            maxVel = s.nextInt();

            for (int i = 1; i < nToros; i++) {
                velToro = s.nextInt();

                if (velToro > maxVel)
                    maxVel = velToro;
            }

            System.out.println(maxVel);
        }

        s.close();
    }
}
