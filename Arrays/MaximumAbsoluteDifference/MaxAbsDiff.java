package Arrays.MaximumAbsoluteDifference;

import java.util.ArrayList;

public class MaxAbsDiff {
    public static void main(String[] args) {

    }

    public static int maxArr(ArrayList<Integer> A) {

        int n = A.size();
        int[] aipi = new int[n];
        int[] aimi = new int[n];

        for (int i = 0; i < n; i++) {
            aipi[i] = A.get(i) + i;
            aimi[i] = A.get(i) - i;
        }

        int maxaipi = Integer.MIN_VALUE;
        int minaipi = Integer.MAX_VALUE;

        int minaimi = Integer.MAX_VALUE;
        int maxaimi = Integer.MIN_VALUE;

        for (int e : aipi) {
            maxaipi = Math.max(maxaipi, e);
            minaipi = Math.min(minaipi, e);
        }
        for (int e : aimi) {
            maxaimi = Math.max(maxaimi, e);
            minaimi = Math.min(minaimi, e);
        }

        int diffaipi = maxaipi - minaipi;
        int diffaimi = maxaimi - minaimi;

        return Math.max(diffaipi, diffaimi);

    }
}
