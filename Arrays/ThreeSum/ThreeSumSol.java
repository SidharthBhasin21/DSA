package Arrays.ThreeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ThreeSumSol
 */
public class ThreeSumSol {

    public static void main(String[] args) {
        int[] nums = { -2, 0, 1, 2, 1 };
        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            List<List<Integer>> listTemp = twoSum(nums, -nums[i], i + 1);
            for (List<Integer> list : listTemp) {
                list.add(0, nums[i]);
                ans.add(list);
            }
        }
        return ans;
    }

    private static List<List<Integer>> twoSum(int[] nums, int target, int startFrom) {

        int l = startFrom;
        int r = nums.length - 1;

        List<List<Integer>> ans = new ArrayList<>();

        while (l < r) {
            if (l > startFrom && nums[l] == nums[l - 1]) {
                l++;
                continue;
            }
            if (r < nums.length - 1 && nums[r] == nums[r + 1]) {
                r--;
                continue;
            }
            if (nums[l] + nums[r] > target) {
                r--;
            } else if (nums[l] + nums[r] < target) {
                l++;
            } else {
                List<Integer> temp = new ArrayList<>();
                temp.add(nums[l]);
                temp.add(nums[r]);
                ans.add(temp);
                l++;
                r--;
            }

        }
        return ans;

    }

}