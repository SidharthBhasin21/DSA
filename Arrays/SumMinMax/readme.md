# Sum of Min Max

`Easy`

> Adobe, Cisco, eBay, DoorDash

## Problem Statement

### You are given an array nums. Your task is to find out the sum of the maximum and minimum elements in the array.

> Example 1:

```
Input:

nums = [-10, 2, 4, 5, 6]

Output:

-4
```

> Example 2:

```
Input:

nums = [8, -2, 1]

Output:

6
```

```
Constraints:
1 <= |nums| <= 105

-108 <= nums[i] <= 108
```

## Solution

```java
public static long sumMaxMin(List<Long> nums) {
        Collections.sort(nums);
        return nums.get(0) + nums.get(nums.size() - 1);
    }
```
