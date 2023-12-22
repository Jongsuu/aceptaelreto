import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class P458 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        List<Long> nums = new ArrayList<Long>();
        long multiplicacioP, multiplicacioU;
        int nNums;

        nNums = s.nextInt();

        while (nNums != 0) {
            // Carrego números
            for (int i = 0; i < nNums; i++)
                nums.add(s.nextLong());

            if (nums.size() == 2)
                System.out.println(nums.get(0) * nums.get(1));
            else {
                Collections.sort(nums);

                multiplicacioP = nums.get(0) * nums.get(1);
                multiplicacioU = nums.get(nums.size() - 1) * nums.get(nums.size() - 2);

                if (multiplicacioP > multiplicacioU)
                    System.out.println(multiplicacioP);
                else
                    System.out.println(multiplicacioU);
            }

            nums.clear();
            nNums = s.nextInt();
        }

        s.close();
    }
}
