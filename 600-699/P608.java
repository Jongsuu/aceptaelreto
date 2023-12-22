import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class P608 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Byte> temp = new ArrayList<Byte>();

        boolean calor, fred;

        short medi, nAvis;
        byte t;

        medi = s.nextShort();

        while (medi != 0) {
            for (short i = 0; i < medi; i++)
                temp.add(s.nextByte());

            nAvis = 0;
            calor = true;
            fred = false;

            for (short i = 0; i < medi; i++) {
                t = temp.get(i);

                if (t <= 4 && calor && !fred) {
                    fred = true;
                    nAvis++;
                }

                if (fred)
                    calor = t > 6;

                if (calor)
                    fred = false;
            }

            System.out.println(nAvis);

            temp.clear();
            medi = s.nextShort();
        }

        s.close();
    }
}
