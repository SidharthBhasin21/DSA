
package Arrays.MinimunDifference;

import java.util.*;

/**
 * MinimumDiff
 */
public class MinimumDiff {
    public static void main(String[] args) {

        int[] arr = { 22, 7, 1, 3, 11, 20, 19 };
        System.out.println(minimumAbsDifference(arr));

    }

    public static List<List<Integer>> minimumAbsDifference(int[] arr) {

        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        int n = arr.length;
        int minDiff = Integer.MAX_VALUE;

        for (int i = 1; i < n; i++) {
            minDiff = Math.min(minDiff, arr[i] - arr[i - 1]);
        }
        for (int i = 1; i < n; i++) {
            if (arr[i] - arr[i - 1] == minDiff) {
                List<Integer> temp = new ArrayList<>();
                temp.add(arr[i - 1]);
                temp.add(arr[i]);
                ans.add(temp);
            }
        }

        return ans;
    }

}