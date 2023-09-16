# 2 Sum

`Easy`

> Amazon ,Expedia, Goldman Sachs

## Problem Statement

### Return the indices of the two numbers so that they add up to target given an array of integers nums and an integer target. You can make an assumption that every input has exactly one solution, and you may avoid using the same element more than once.

#### Note: Return the answer in sorted order.

> Example 1:

```
Input:
nums = [1,2,3,4,5]
target = 8
Output:
[2,4]
Explanation:
Because nums[2] + nums[4] == 8, we return [2, 4].
```

> Example 2:

```
Input:
nums = [1,2,3,4,5]
target = 3
Output:
[0,1]

```

> Constraints:

```
2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
```

## Solution

> Brute force

```java
public static int[] twoSum(int[] nums, int target) {

        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    ans[0] = i;
                    ans[1] = j;
                }

            }
        }
        return ans;
    }

```

> Optimised

```java
 public int[] twoSumOptimised(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                res[0] = map.get(target - nums[i]);
                res[1] = i;
                return res;
            }
            map.put(nums[i], i);
        }
        return res;
    }
```

> Alternate approach

```java
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
