package Arrays.FindPairsSumArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Solution
 */
public class Solution {

  public static void main(String[] args) {

  }

  public static List<List<Integer>> findPair(int[] arr) {

    List<List<Integer>> ans = new ArrayList<>();
    int n = arr.length;
    int[] a = Arrays.copyOf(arr, n);
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if (exist(a, arr[i] + arr[j], n)) {

          ans.add(new ArrayList<>(Arrays.asList(arr[i], arr[j])));
        }
      }
    }
    ans.sort((x, y) -> {
      int minLen = Math.min(x.size(), y.size());
      for (int i = 0; i < minLen; i++) {
        int cmp = x.get(i).compareTo(y.get(i));
        if (cmp != 0) {
          return cmp;
        }
      }
      return Integer.compare(x.size(), y.size());
    });
    return ans;

  }

  public static boolean exist(int[] arr, int sum, int n) {
    for (int i = 0; i < n; i++) {
      if (arr[i] == sum)
        return true;
    }
    return false;
  }

}