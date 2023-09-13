package Arrays.MultipleLeftRotation;

import java.util.Arrays;

public class MultipleLeftRotation {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };
        int[] b = { 2, 3 };

        int[][] ans = multipleLeftRotation(arr, b);

        System.out.println(Arrays.toString(ans));

    }

    public static int[][] multipleLeftRotation(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;
        int[][] ans = new int[m][n];

        int[] temp = new int[2 * A.length];

        for (int i = 0; i < n; i++) {
            temp[i] = A[i];
            temp[i + n] = A[i];

        }

        for (int i = 0; i < m; i++) {
            int offset = (B[i]) % n;
            for (int j = 0; j < n; j++) {
                ans[i][j] = temp[j + offset];

            }
        }
        return ans;
    }

}
