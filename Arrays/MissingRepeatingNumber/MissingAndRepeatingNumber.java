package Arrays.MissingRepeatingNumber;

import java.util.Arrays;
import java.util.Vector;

/**
 * MissingAndRepeatingNumber
 */
public class MissingAndRepeatingNumber {

    public static void main(String[] args) {

    }

    public static Vector<Integer> findNumbers(int[] a) {
        Vector<Integer> ans = new Vector<>(2);
        int n = a.length;
        int[] hash = new int[n + 1];

        for (int i = 0; i < n; i++) {
            hash[a[i]]++;
        }

        int r = -1, m = -1;

        for (int i = 1; i <= n; i++) {
            if (hash[i] == 2)
                r = i;
            else if (hash[i] == 0)
                m = i;
        }
        ans.add(m);
        ans.add(r);
        return ans;

    }
}