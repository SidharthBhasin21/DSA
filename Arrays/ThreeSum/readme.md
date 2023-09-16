# 3 Sum Problem

`Medium`

> Amazon, Yahoo, Apple, Workday, Walmart Global Tech

## Problem Statement

### Return all triplets [nums[i], nums[j], nums[k]] where i!= j, i!= k, j!= k, and nums[i] + nums[j] + nums[k] == 0 for an integer array nums. Keep in mind that there cannot be any duplicate triplets in the solution set.

#### Note: The order of the output and the order of the triplets does not matter.

> Example 1:

```
Input:
nums = [-2, 0, 1, 2, 1]
```

```
Output:
[[-2, 1, 1],[-2,0,2]]
```

```
Explanation:
nums[0] + nums[2] + nums[4] = (-2) + 1 + 1 = 0.
nums[0] + nums[1] + nums[3] = (-2) + 0 + 2 = 0.
The distinct triplets are [-2, 1, 1] and [-2,0,2].
```

> Example 2:

```
Input: nums = [0,1,1]
Output: []
```

```
Constraints:
3 <= nums.length <= 3000
-105 <= nums[i] <= 105
```

## Solution

```java

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

```
