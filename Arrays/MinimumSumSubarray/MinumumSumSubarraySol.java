package Arrays.MinimumSumSubarray;

public class MinumumSumSubarraySol {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 1, 1, 1, 1, 1 };
        int target = 11;

        System.out.println(minSubArrayLen(target, arr));

    }

    public static int minSubArrayLen(int K, int[] A) {
        int l = 0;
        int r = 0;
        int n = A.length;
        int curSum = 0;
        int minlen = Integer.MAX_VALUE;

        while (r < n) {
            curSum += A[r];
            while (curSum >= K) {
                minlen = Math.min(minlen, r - l + 1);
                curSum -= A[l];
                l++;
            }
            r++;
        }
        if (minlen == Integer.MAX_VALUE)
            minlen = 0;

        return minlen;
    }
}
