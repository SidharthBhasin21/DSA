package Arrays.MinimumOperationsToMakeEleEqual;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[][] A = {
                { 0, 2, 8 },
                { 8, 2, 0 },
                { 0, 2, 8 } };
        int K = 2;
        System.out.println(minOperations(3, 3, K, A));

    }

    public static int minOperations(int n, int m, int k, int A[][]) {
        if (n == 0)
            return 0;
        int[] b = new int[n * m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                b[i * m + j] = A[i][j];
            }
        }
        Arrays.sort(b);

        int median = b[(n * m) / 2];
        int count = 0;

        for (int i = 0; i < b.length; i++) {

            if (b[i] % k != 0)
                return -1;

            count += Math.abs((b[i] - median) / k);
        }

        return count;

    }
}
