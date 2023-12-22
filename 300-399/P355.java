import java.util.Scanner;

public class P355 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int nProves, any, output;

        nProves = s.nextInt();

        for (int i = 0; i < nProves; i++) {
            any = s.nextInt();

            if (any % 4 == 0 && any % 100 != 0 || any % 400 == 0)
                output = 29;
            else
                output = 28;

            System.out.println(output);
        }

        s.close();
    }
}
