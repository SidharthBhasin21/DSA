package Arrays.ChocolateDistributionProblem;

import java.util.Arrays;

public class ChocolateDistributionProblem {
    public static void main(String[] args) {

    }

    public int findMinDiff(int[] arr, int m) {
        if (arr.length == 0 || m == 0)
            return 0;

        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;

        if (arr.length < m)
            return -1;

        for (int i = 0; i + m - 1 < arr.length; i++) {
            minDiff = Math.min(minDiff, arr[i + m - 1] - arr[i]);
        }

        return minDiff;
    }

}
